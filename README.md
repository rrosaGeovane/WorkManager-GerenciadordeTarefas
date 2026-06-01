# WorkManager API

A RESTful task management API built with Spring Boot, designed to help users create, manage, update, and organize their personal tasks.

## Overview

WorkManager is a backend application developed for learning and practicing modern Java development with Spring Boot. The project follows a layered architecture and implements core CRUD operations for users and tasks.

The system allows users to register, authenticate, create tasks, update task information, retrieve task lists, and delete tasks while maintaining ownership validation between users and their tasks.

---

## Features

### User Management

* User registration
* User authentication (login)

### Task Management

* Create new tasks
* Update existing tasks
* Delete tasks
* Retrieve a specific task by ID
* List all tasks belonging to a user
* Ownership validation to ensure users can only access their own tasks

---

## Technologies

* Java 26
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok
* Hibernate

---

## Project Structure

```text
src/main/java
├── controller
├── service
├── repository
├── dto
└── entity
```

### Layer Responsibilities

* **Controller**: Handles HTTP requests and responses.
* **Service**: Contains business rules and application logic.
* **Repository**: Provides database access through Spring Data JPA.
* **DTO**: Transfers data between layers without exposing entities directly.
* **Entity**: Represents database tables and relationships.

---

## Database Model

### User

| Field    | Type   |
| -------- | ------ |
| id       | Long   |
| name     | String |
| email    | String |
| password | String |

### Task

| Field       | Type          |
| ----------- | ------------- |
| id          | Long          |
| title       | String        |
| description | String        |
| completed   | Boolean       |
| createdAt   | LocalDateTime |
| user        | User          |

### Relationship

* One User can have many Tasks.
* One Task belongs to one User.

---

## Getting Started

### Clone the repository

```bash
git clone https://github.com/your-username/workmanager.git
```

### Configure environment variables

```properties
DB_URL=jdbc:mysql://localhost:3306/work_manager
DB_USER=your_user
DB_PASSWORD=your_password
```

### Run the application

```bash
mvn spring-boot:run
```

The API will be available at:

```text
http://localhost:8080
```

---

## Current Endpoints

### User

| Method | Endpoint           |
| ------ | ------------------ |
| POST   | /usuarios/cadastro |
| POST   | /usuarios/login    |

### Tasks

| Method | Endpoint                                 |
| ------ | ---------------------------------------- |
| POST   | /usuarios/{idUsuario}/tarefas            |
| GET    | /usuarios/{idUsuario}/tarefas            |
| GET    | /usuarios/{idUsuario}/tarefas/{idTarefa} |
| PUT    | /usuarios/{idUsuario}/tarefas/{idTarefa} |
| DELETE | /usuarios/{idUsuario}/tarefas/{idTarefa} |

---

## Future Improvements

* JWT Authentication
* Password encryption with BCrypt
* Global exception handling
* Bean Validation
* Unit and integration tests
* Pagination and sorting
* API documentation with Swagger/OpenAPI

---

## Learning Goals

This project was created to strengthen knowledge in:

* Object-Oriented Programming (OOP)
* REST API development
* Spring Boot ecosystem
* JPA/Hibernate relationships
* DTO pattern
* Layered architecture
* Database integration with MySQL

---

## Author

Developed by Ribeiro as a personal learning project focused on Java Backend Development and Spring Boot.
