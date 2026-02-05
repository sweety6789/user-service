##### User Service (Spring Boot)

This project is a **User Service** built using **Spring Boot**, implementing a basic **User Registration API** with validation and global exception handling.

---

## 🚀 Features
- User registration API
- Input validation using Jakarta Validation
- Global exception handling
- Clean layered architecture (Controller, Service, Repository)
- DTO-based request & response handling
- Maven wrapper support

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate Validator
- Lombok
- Maven
- MySQL (or H2 for testing)

---

## 📂 Project Structure
src/main/java/com/user/service
├── controller
├── service
├── repository
├── entity
├── dto
└── exception


---

## 📌 API Endpoints

### Register User
**POST** `/api/auth/register`

#### Request Body
```json
{
  "username": "john",
  "email": "john@gmail.com",
  "password": "password123"
}


{
  "id": 1,
  "username": "john",
  "email": "john@gmail.com",
  "message": "User registered successfully"
}

{
  "username": "must not be blank",
  "email": "must be a well-formed email address"
}

❗ Error Handling

Validation errors handled globally

Business exceptions handled centrally

Generic exceptions return safe 500 responses

./mvnw spring-boot:run



“I built a Spring Boot user-service implementing a registration API. I used DTOs for request and response, enforced validation with Jakarta Validation,
handled business and validation errors centrally using a global exception handler, and followed a clean layered architecture.”
