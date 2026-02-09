# Task Manager Application

A Spring Boot RESTful Task Management Application built using **layered architecture (Controller → Service → Repository)**. This project demonstrates clean coding practices, proper separation of concerns, DTO usage, exception handling, and CRUD operations.

---

## 📌 Features

* User Management
* Category Management
* Priority Management
* Task Management
* Task Status Tracking (`PENDING`, `IN_PROGRESS`, `DONE`)
* Global Exception Handling
* RESTful APIs

---

## 🛠 Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 / MySQL
* Swagger OpenAPI
* Maven

---

## Project Structure

```text
com.gevernova.taskmanagement
│
├── controller
│   ├── UserController.java
│   ├── CategoryController.java
│   ├── PriorityController.java
│   └── TaskController.java
│
├── service
│   ├── UserService.java
│   ├── CategoryService.java
│   ├── PriorityService.java
│   ├── TaskService.java
│   └──  UserServiceImpl.java
│   ├── CategoryServiceImpl.java
│   ├── PriorityServiceImpl.java
│   └── TaskServiceImpl.java
│      
├── repository
│   ├── UserRepository.java
│   ├── CategoryRepository.java
│   ├── PriorityRepository.java
│   └── TaskRepository.java
│
├── entity
│   ├── User.java
│   ├── Category.java
│   ├── Priority.java
│   └── Task.java
│
├── dto
│   ├── UserRequest.java
│   ├── TaskRequest.java
│   └── TaskStatusUpdateRequest.java
│
├── exception
│   ├── UserNotFoundException.java
│   ├── TaskNotFoundException.java
│   └── GlobalExceptionHandler.java
│
└── TaskManagerApplication.java
```
---

## Application Flow

1. **Client Layer**
   Client (Postman / Swagger UI / Frontend) sends an HTTP request to the application.

2. **Controller Layer**

    * Receives HTTP requests
    * Maps endpoints using annotations like `@GetMapping`, `@PostMapping`
    * Handles request and response only
    * Calls service layer methods

3. **Service Interface Layer**

    * Defines business contracts
    * Ensures loose coupling
    * Used by controllers

4. **Service Implementation Layer**

    * Contains core business logic
    * Validates data and applies rules
    * Communicates with repository layer

5. **Repository Layer**

    * Interacts directly with the database
    * Performs CRUD operations using JPA

6. **Database Layer**

    * Stores persistent data (Users, Tasks, Categories, Priorities)

7. **Response Flow**
   Data flows back from Repository → Service → Controller → Client as HTTP response.

---

### Responsibility Rule

| Layer      | Responsibility              |
| ---------- | --------------------------- |
| Controller | Request & Response handling |
| Service    | Business Logic              |
| Repository | Database Access             |

---

## API Endpoints

### User APIs

| Method | Endpoint        | Description    |
| ------ | --------------- | -------------- |
| POST   | /api/users      | Create user    |
| GET    | /api/users      | Get all users  |
| GET    | /api/users/{id} | Get user by ID |
| PUT    | /api/users/{id} | Update user    |
| DELETE | /api/users/{id} | Delete user    |

---

### Category APIs

| Method | Endpoint             | Description        |
| ------ | -------------------- | ------------------ |
| POST   | /api/categories      | Create category    |
| GET    | /api/categories      | Get all categories |
| GET    | /api/categories/{id} | Get category by ID |
| PUT    | /api/categories/{id} | Update category    |
| DELETE | /api/categories/{id} | Delete category    |

---

### Priority APIs

| Method | Endpoint             | Description        |
| ------ | -------------------- | ------------------ |
| POST   | /api/priorities      | Create priority    |
| GET    | /api/priorities      | Get all priorities |
| GET    | /api/priorities/{id} | Get priority by ID |
| PUT    | /api/priorities/{id} | Update priority    |
| DELETE | /api/priorities/{id} | Delete priority    |

---

### Task APIs

| Method | Endpoint               | Description        |
| ------ | ---------------------- | ------------------ |
| POST   | /api/tasks             | Create task        |
| GET    | /api/tasks             | Get all tasks      |
| GET    | /api/tasks/{id}        | Get task by ID     |
| PATCH  | /api/tasks/{id}/status | Update task status |

---

## Exception Handling

* `UserNotFoundException`
* `TaskNotFoundException`
* Centralized exception handling using `@RestControllerAdvice`
* Returns clean and meaningful HTTP error responses

---

## How to Run

1. Clone the repository
2. Open project in IntelliJ / Eclipse
3. Configure `application.properties` (H2 or MySQL)
4. Run `TaskManagerApplication`
5. Access APIs via Postman or Swagger UI

---

## Author

Developed for learning **Spring Boot REST APIs**, **clean architecture**, and **industry-standard backend practices**.


