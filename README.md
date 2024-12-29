# Music-Style-API 🎵

This API was created to manage and explore various musical styles while serving as a practical project to develop skills in Spring Boot and RESTful API design.

---

## 🔧 Features

This API has a CRUD already done, this is just an example

- **Create a musical style**: Add new musical styles with details like name, description, and example music.
- **Retrieve a musical style**: Fetch details of a specific musical style by its unique ID.

---

## 📚 Project Structure

- **Controller**: Manages HTTP requests and defines endpoints for interacting with the API.
- **Model**: Represents the `MusicStyle` entity with attributes for name, description, and music.
- **Repository**: Interfaces with the database to perform CRUD operations on musical styles.
- **Resources**: Contains configuration files such as `application.yml` for database setup and initial SQL.

---

## 🛠️ Tools and Libraries

- **Spring Boot DevTools**: Hot-reloading for efficient development.
- **Spring Web**: Provides RESTful web services functionality.
- **Spring Data JPA**: Simplifies database interactions.
- **H2 Database**: In-memory database for quick testing and prototyping.
- **Postman**: API testing and debugging.

---

## 🔍 Endpoints

### Base URL
`http://localhost:8080/music`

### 1. Create a Musical Style
- **Endpoint**: `POST /music`
- **Description**: Adds a new musical style to the database.
- **Request Body**:
  ```json
  {
    "name": "Rock",
    "description": "A genre characterized by a strong rhythm and often played with electric guitars.",
    "music": "Bohemian Rhapsody"
  }
  ```
- **Response**:
  ```json
  {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "name": "Rock",
    "description": "A genre characterized by a strong rhythm and often played with electric guitars.",
    "music": "Bohemian Rhapsody"
  }
  ```

### 2. Retrieve a Musical Style by ID
- **Endpoint**: `GET /music/{id}`
- **Description**: Fetches the details of a musical style using its unique identifier.
- **Response Example**:
  ```json
  {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "name": "Rock",
    "description": "A genre characterized by a strong rhythm and often played with electric guitars.",
    "music": "Bohemian Rhapsody"
  }
  ```

---

## 🔧 Setup and Run

### Prerequisites:
- Java 17+
- Maven

### Steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/music-style-api.git
   ```
2. Navigate to the project directory:
   ```bash
   cd music-style-api
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Access the API at `http://localhost:8080/music`.

---

## 🎨 Future Enhancements

- Add filtering and sorting options for musical styles.
- Implement authentication and authorization.
- Integrate with external music databases for extended functionality.
- Add Swagger documentation for easier API exploration.

---

Feel free to explore, give feedback, or contribute! ✨

