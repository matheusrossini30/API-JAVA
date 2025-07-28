# 📝 ToDoList

Aplicação web de lista de tarefas desenvolvida com Spring Boot e Maven, que permite criar, visualizar, atualizar e deletar tarefas, além de gerenciar usuários com segurança e boas práticas de API RESTful.

---

## 📋 Índice

- [📝 Descrição](#-descrição)  
- [⚙️ Funcionalidades](#-funcionalidades)  
- [🛠️ Tecnologias](#-tecnologias)  
- [📦 Pré-requisitos](#-pré-requisitos)  
- [🚀 Instalação](#-instalação)  
- [🎯 Como usar](#-como-usar)  
- [🌐 Deploy](#-deploy)  
- [🤝 Contribuição](#-contribuição)  
- [📄 Licença](#-licença)  

---

## 📝 Descrição

Este projeto é uma API RESTful para gerenciamento de uma lista de tarefas (ToDoList), construída em Java utilizando o framework Spring Boot. Ideal para estudo e aplicação prática de conceitos como CRUD completo, controle de rotas, boas práticas REST e deploy em cloud com Docker.

---

## ⚙️ Funcionalidades

### 🔐 Usuários

- Criar novo usuário  
- Listar todos os usuários  
- Atualizar dados de um usuário  
- Deletar usuário

### ✅ Tarefas

- Criar uma nova tarefa  
- Listar todas as tarefas  
- Atualizar uma tarefa existente  
- Deletar uma tarefa  

---

## 🛠️ Tecnologias

- Java 21  
- Spring Boot 3.x  
- Maven  
- Docker  
- Render (para deploy)  

---

## 📦 Pré-requisitos

- Java JDK 21 instalado  
- Maven instalado  
- Docker instalado (para uso do Dockerfile e deploy)  

---

## 🚀 Instalação

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/todolist.git
```

Entre na pasta do projeto:

```bash
cd todolist
```

Compile o projeto com Maven:

```bash
mvn clean install
```

Execute a aplicação localmente:

```bash
mvn spring-boot:run
```

---

## 🎯 Como usar

- Acesse: [http://localhost:8080](http://localhost:8080)  
- Use ferramentas como Postman, Insomnia ou curl para testar os endpoints REST  

### Exemplos de Endpoints

#### 📌 Usuários
- `POST /users` – Cria um novo usuário  
- `GET /users` – Lista todos os usuários  
- `PUT /users/{id}` – Atualiza um usuário  
- `DELETE /users/{id}` – Remove um usuário  

#### 📌 Tarefas
- `POST /tasks` – Cria uma nova tarefa  
- `GET /tasks` – Lista todas as tarefas  
- `PUT /tasks/{id}` – Atualiza uma tarefa  
- `DELETE /tasks/{id}` – Remove uma tarefa  

---

## 🌐 Deploy

Este projeto está preparado para deploy em serviços como Render.com utilizando Docker. O `Dockerfile` na raiz do projeto define todo o processo de build e execução da API.

Para gerar e rodar com Docker localmente:

```bash
docker build -t todolist-api .
docker run -p 8080:8080 todolist-api
```

---

## 🤝 Contribuição

Contribuições são bem-vindas!  
Para contribuir:

1. Faça um fork do projeto  
2. Crie uma branch (`git checkout -b nova-feature`)  
3. Commit suas mudanças (`git commit -m 'Minha feature'`)  
4. Push para o repositório (`git push origin nova-feature`)  
5. Crie um Pull Request

---

## 📄 Licença

Projeto licenciado sob a MIT License. Consulte o arquivo [LICENSE](./LICENSE) para mais detalhes.