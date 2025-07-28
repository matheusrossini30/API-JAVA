package br.com.matheusrossini.todolist.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IuserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario Já existe");
        }

        var passwordHashred = BCrypt.withDefaults()
                .hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable UUID id, @RequestBody UserModel userModel) {
        var userOptional = this.userRepository.findById(id);

        if (userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        }

        var user = userOptional.get();

        var existingUser = this.userRepository.findByUsername(userModel.getUsername());
        if (existingUser != null && !existingUser.getId().equals(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username já está em uso por outro usuário");
        }

        user.setName(userModel.getName());
        user.setUsername(userModel.getUsername());

        if (userModel.getPassword() != null && !userModel.getPassword().isBlank()) {
            var passwordHashed = BCrypt.withDefaults()
                    .hashToString(12, userModel.getPassword().toCharArray());
            user.setPassword(passwordHashed);
        }

        var updatedUser = this.userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable UUID id) {
        var userOptional = this.userRepository.findById(id);

        if (userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        }

        this.userRepository.deleteById(id);
        return ResponseEntity.ok("Usuário deletado com sucesso");

    }

    @GetMapping("/")
    public ResponseEntity<List<UserModel>> listAll() {
        var users = this.userRepository.findAll();
        return ResponseEntity.ok(users);
    }

}
