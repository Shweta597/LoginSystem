# 🔐 Full Stack Login System (Spring Boot + React)

A simple yet powerful full-stack login and registration system built using **Spring Boot**, **React**, and **PostgreSQL**. This project demonstrates secure authentication, form validation, and clean architecture using layered services.

## ✨ Features

- ✅ User Registration with name, email, and password
- ✅ User Login with authentication
- ✅ Password hashing using BCrypt
- ✅ Form validation on both frontend & backend
- ✅ RESTful API structure
- ✅ Axios integration for HTTP requests
- ✅ Clean UI with Material UI
- ✅ Redirects and feedback messages on success/error

## 🛠️ Technologies Used

### 🔧 Backend (Spring Boot)
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Spring Security (optional for enhancement)
- BCrypt Password Encoder

### 🌐 Frontend (React)
- React 18+
- Axios
- React Router DOM
- Material UI

  
🗂️ Project Structure

``` project-root/
├── backend/
│   └── src/
│       └── main/
│           └── java/
│               └── com/
│                   └── shwetashaw/
│                       └── login/
│                           ├── controller/       # REST API controllers
│                           ├── service/          # Business logic and service layer
│                           ├── model/            # Entity classes (e.g., AppUser)
│                           ├── repository/       # Spring Data JPA repositories
│                           └── dto/
│                               └── response/      # Response DTOs (SuccessMessage, ErrorMessage)
│
├── frontend/
│   ├── public/
│   └── src/
│       ├── components/        # React components (LoginForm, RegisterForm, HomePage)
│       ├── App.js             # App routes and structure
│       └── index.js           # Entry point for React app
│
└── README.md                  # Project documentation ```



## 🚀 Getting Started

### 🔙 Backend Setup

cd backend

./mvnw spring-boot:run

Ensure PostgreSQL is running and connection details are configured in application.properties.


## Frontend Setup

cd frontend

npm install

npm start
