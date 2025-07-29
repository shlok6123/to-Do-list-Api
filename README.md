# Momentum API

A simple and robust RESTful API for task management built with Java and the Spring Boot framework. This project provides a complete set of CRUD (Create, Read, Update, Delete) operations for managing tasks.

---

## Features

* **Create a new task** with a title, description, and due date.
* **Read** all tasks or a single task by its unique ID.
* **Update** the details or status of an existing task.
* **Delete** a task from the database.

---

## Technologies Used

* **Java 21**
* **Spring Boot**
* **Spring Web:** For building RESTful APIs.
* **Spring Data JPA:** For database interaction.
* **H2 Database:** An in-memory database for development.
* **Maven:** For project build and dependency management.
* **Lombok:** To reduce boilerplate code.

---

## API Endpoints

The base URL for the API is `/api/tasks`.

| Method | Endpoint          | Description                       |
| :----- | :---------------- | :-------------------------------- |
| `POST` | `/`               | Creates a new task.               |
| `GET`  | `/`               | Retrieves a list of all tasks.    |
| `GET`  | `/{id}`           | Retrieves a single task by its ID.|
| `PUT`  | `/{id}`           | Updates an existing task by its ID.|
| `DELETE` | `/{id}`         | Deletes a task by its ID.         |

---

## How to Run Locally

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YourUsername/momentum-task-api.git](https://github.com/YourUsername/momentum-task-api.git)
    ```
    *(Replace `YourUsername` with your actual GitHub username)*

2.  **Navigate to the project directory:**
    ```bash
    cd momentum-task-api
    ```

3.  **Run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```

The application will start on `http://localhost:8080`.

---

## Example Usage

You can use an API client like **Postman** to interact with the endpoints.

**Example: Create a new task**

* **Method:** `POST`
* **URL:** `http://localhost:8080/api/tasks`
* **Body** (`raw`, `JSON`):
    ```json
    {
      "title": "My First Task",
      "description": "Complete the project README file",
      "dueDate": "2025-08-15"
    }
    ```
