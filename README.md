# 🛒 E-Commerce Spring Boot Application

A simple and extensible e-commerce backend built with **Spring Boot**. This application manages customers, products, carts, and orders via a RESTful API.

---

## ✨ Features

- ✅ Customer Management (CRUD)
- ✅ Product Catalog Management
- ✅ Shopping Cart per User
- ✅ Order Placement & Listing
- ✅ RESTful API Architecture
- ✅ In-memory H2 Database for quick testing

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 2.x
- Spring Web
- Spring Data JPA
- Lombok
- H2 Database
- Maven

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3+

### Run Locally

```bash
git clone https://github.com/blisahn/e-commerce-spring-boot.git
cd e-commerce-spring-boot
mvn spring-boot:run
```
The server will start on:
📍 http://localhost:8080

## 📦 API Overview

| Method | Endpoint              | Description               |
|--------|-----------------------|---------------------------|
| GET    | `/api/customers`      | List all customers        |
| POST   | `/api/customers`      | Add a new customer        |
| GET    | `/api/products`       | List all products         |
| POST   | `/api/products`       | Add a new product         |
| POST   | `/api/cart/{id}`      | Add item to cart          |
| GET    | `/api/cart/{id}`      | View cart items           |
| POST   | `/api/orders`         | Create order from cart    |
| GET    | `/api/orders`         | List all orders           |
