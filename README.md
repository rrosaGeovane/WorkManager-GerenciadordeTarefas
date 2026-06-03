![Java](https://img.shields.io/badge/Java-26-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/Status-In_Development-yellow)

# 📋 WorkManager API

REST API developed with Java and Spring Boot for task management and user organization.

This project was built to practice backend development concepts, focusing on RESTful APIs, layered architecture, business rules implementation, and database integration with MySQL.

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok

---

## ✨ Features

* User registration
* User authentication
* Task creation
* Task update
* Task deletion
* Task retrieval by ID
* User task listing
* Task ownership validation
* MySQL database integration
* Layered architecture pattern

---

## 🏗️ Project Architecture

The application follows a layered architecture pattern to improve organization, scalability, and maintainability.

### 📚 Layers

* **Controller** → Handles HTTP requests and API endpoints
* **Service** → Contains business rules and application logic
* **Repository** → Responsible for database communication
* **DTO** → Data transfer between application layers
* **Entity** → Represents database entities

---

## 📁 Project Structure

```text
src
 └── main
     └── java
         └── com.ribeiro.WorkManager
             ├── controller
             ├── service
             ├── repository
             ├── dto
             └── entity
```

---

## ⚙️ Database Configuration

Set your environment variables in the `application.properties` file:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```

Example:

```properties
DB_URL=jdbc:mysql://localhost:3306/work_manager
DB_USER=root
DB_PASSWORD=your_password
```

---

## 🔌 API Endpoints

### User Management

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | `/usuarios/cadastro` | Register a new user |
| POST | `/usuarios/login` | Authenticate a user |

### Task Management

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | `/usuarios/{idUsuario}/tarefas` | Create a task |
| GET | `/usuarios/{idUsuario}/tarefas` | List all user tasks |
| GET | `/usuarios/{idUsuario}/tarefas/{idTarefa}` | Retrieve task by ID |
| PUT | `/usuarios/{idUsuario}/tarefas/{idTarefa}` | Update task |
| DELETE | `/usuarios/{idUsuario}/tarefas/{idTarefa}` | Delete task |

---

## ▶️ Running the Project

### Clone the repository

```bash
git clone https://github.com/rrosaGeovane/WorkManager.git
```

### Navigate to the project folder

```bash
cd WorkManager
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

## 📌 Learning Goals

This project was developed to strengthen knowledge in:

* REST API development
* Spring Boot ecosystem
* Layered architecture
* DTO pattern
* JPA and Hibernate
* Database integration with MySQL
* Backend development best practices

---

## 🚀 Future Improvements

* Password encryption with BCrypt
* JWT authentication
* Spring Security integration
* Request validation with Bean Validation
* Global exception handling
* Swagger/OpenAPI documentation
* Pagination and sorting
* Unit tests
* Integration tests

---

## 🤝 Contributing

* Fork the repository
* Create a feature branch

```bash
git checkout -b feature/new-feature
```

* Commit your changes

```bash
git commit -m "Add new feature"
```

* Push to your branch

```bash
git push origin feature/new-feature
```

* Open a Pull Request

---

## 📧 Contact

**Geovane Rosa**

Email: rrosageovane@gmail.com

GitHub Repository: https://github.com/rrosaGeovane/WorkManager

---

## 📜 License

This project is available for educational and portfolio purposes.
