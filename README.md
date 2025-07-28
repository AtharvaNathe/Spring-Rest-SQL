# Spring-Rest-SQL
🏦 Spring Boot RESTful Bank Management API
This project is a Spring Boot REST API for basic bank account operations. It supports CRUD operations and common banking functionalities like deposit and fund transfer. Built with a layered architecture using Spring MVC and Spring Data JPA, this application demonstrates how to build scalable, maintainable RESTful services in Java.

🔧 Features
✅ Get all bank accounts

🔍 Search account by account number

➕ Add a new account

🗑️ Delete an existing account

💰 Deposit money into an account

🔄 Transfer funds between two accounts

🔗 REST endpoints using @RestController and Spring MVC

📦 Data persistence using Spring Data JPA with MySQL (or any RDBMS)

📂 Tech Stack
Java 17+

Spring Boot

Spring Web

Spring Data JPA

MySQL (or compatible RDBMS)

RESTful APIs

Maven

📁 Project Structure
scss
Copy
Edit
com.predator.Rest.SQL
├── controllers (BankController.java)
├── services (AccountServices.java)
├── repositories (AccountRepo.java)
└── entities (Account.java)
📬 Sample Endpoints
GET /bank/test – Test API

GET /bank/allaccounts – List all accounts

GET /bank/search/number/{accno} – Get account by number

POST /bank/add – Add new account

DELETE /bank/delete – Delete account

PUT /bank/deposit – Deposit

PUT /bank/transfer – Transfer

🚀 How to Run
Clone the repository

Configure your database in application.properties

Run the application using your IDE or mvn spring-boot:run

Access endpoints via Postman or any REST client

👨‍💻 Developed By
Atharva Anil Nathe
