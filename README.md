# Student Management API

## Overview

This project is a **Spring Boot REST API** for managing student data.
It demonstrates CRUD operations and integration with an external API using **RestTemplate**.

## Technologies Used

* Java
* Spring Boot
* REST APIs
* RestTemplate
* DTO Pattern
* Maven

## Features

* Create Student
* Get Student by ID
* Get All Students
* Update Student
* Delete Student

## Architecture

Controller → Service → External API

The application uses **DTO conversion**:

* StudentDto → FakeStudentDto
* FakeStudentDto → StudentDto

This ensures separation between internal models and external API models.

## API Endpoints
-------------------------------------------------
| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| POST   | /students      | Create student    |
| GET    | /students/{id} | Get student by ID |
| GET    | /students      | Get all students  |
| PUT    | /students/{id} | Update student    |
| DELETE | /students/{id} | Delete student    |
-----------------------------------------------
## How to Run

1. Clone the repository
2. Open the project in IntelliJ
3. Run `StudentManagementApplication.java`

Server runs on:

http://localhost:8080

## Author

Muni Balaji
