# 🏦 Spring Boot RESTful Bank Management API

This is a simple and extensible **Spring Boot REST API** that simulates basic bank account operations such as creating accounts, viewing account details, depositing funds, and transferring money. Built using **Spring Boot**, **Spring Data JPA**, and **MySQL**, it demonstrates clean coding practices with a layered architecture.

---

## 🔧 Features 

- ✅ Get all bank accounts    
- 🔍 Search for an account by account number  
- ➕ Add a new bank account  
- 🗑️ Delete an account  
- 💰 Deposit money into an account  
- 🔄 Transfer funds between accounts  
- 🔗 RESTful endpoint structure  
- 📦 Data persistence using Spring Data JPA  

---

## 📂 Tech Stack

- **Java 17+**  
- **Spring Boot**  
- **Spring Web**  
- **Spring Data JPA**  
- **MySQL** (or compatible RDBMS)  
- **Maven**

---

## 📁 Project Structure
com.predator.Rest.SQL
├── controllers
│ └── BankController.java
├── services
│ └── AccountServices.java
├── repositories
│ └── AccountRepo.java
├── entities
│ └── Account.java
└── application.properties

---

## 📬 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/bank/test` | Test API |
| GET    | `/bank/allaccounts` | Get all accounts |
| GET    | `/bank/search/number/{accno}` | Get account by number |
| POST   | `/bank/add` | Add a new account |
| DELETE | `/bank/delete` | Delete account by number |
| PUT    | `/bank/deposit` | Deposit to account |
| PUT    | `/bank/transfer` | Transfer between accounts |

---

## ⚙️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/bank-api.git
   cd bank-api


## 👨‍💻 Developed By

- **Atharva Anil Nathe**  
- **Java Developer | Backend Engineer**  

