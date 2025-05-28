# 📝 ToDoList

Aplicação web de lista de tarefas desenvolvida com Spring Boot e Maven, que permite criar, visualizar, atualizar e criar usuários.

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

Este projeto é uma API RESTful para gerenciamento de uma lista de tarefas (ToDoList), construída em Java utilizando o framework Spring Boot. Ideal para estudo e aplicação prática de conceitos como CRUD, controle de rotas e deploy em cloud.

---

## ⚙️ Funcionalidades

- Criar uma nova tarefa  
- Listar todas as tarefas  
- Atualizar uma tarefa existente  
- Criar usuário  
- Endpoints REST organizados para fácil integração com frontend  

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
- Docker instalado (para deploy com Dockerfile)  

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

- Acesse [http://localhost:8080/](http://localhost:8080/) (ou a URL do seu deploy)  
- Use ferramentas como Postman para testar os endpoints REST (GET, POST, PUT)  
- Exemplo de endpoint:  
  - `GET /tasks` - Lista todas as tarefas  
  - `POST /tasks` - Cria uma nova tarefa  

---

## 🌐 Deploy

Este projeto está configurado para ser containerizado com Docker e hospedado na Render.com. O arquivo Dockerfile está na raiz do projeto e define as etapas de build e execução.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Para isso, faça um fork do projeto, crie uma branch para sua feature, envie um pull request e aguarde a revisão.

---

## 📄 Licença

MIT License - veja o arquivo LICENSE para mais detalhes.