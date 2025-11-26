# Todo App ✅

This is a simple Todo application built as a Java Maven project. It is designed to manage daily tasks and demonstrate clean project structure, basic CRUD-style operations, and Java fundamentals.

## Features

- Add new todo items.
- List all current tasks.
- Mark tasks as completed or pending.
- Delete tasks you no longer need.
- Clean Maven structure, easy to read and extend.

## Getting started

1. Clone the repository:
``` 
git clone https://github.com/kunnaaalll/todo.git
cd todo/todo
```

2. Build the project with Maven:
``` Maven Clean Instal ```


3. Run the application:

- If you have a `main` class configured in the `pom.xml` (using `maven-jar-plugin` or `spring-boot-maven-plugin`):

  ```
  mvn exec:java
  # or, if you built a jar:
  java -jar target/todo-*.jar
  ```

- Replace the command above with the exact jar name or execution goal you use in your project.

## Usage

- Follow the prompts in the console (if it is a CLI app) to:
- Add a new todo.
- View the list of todos.
- Mark tasks as done.
- Delete tasks.

- If it is a web app (for example, using Spring Boot), open the URL printed in the console (for example `http://localhost:8080`) and use the web interface.

Update this section to match how your app actually behaves.

## Project structure

Typical Maven layout:

- `src/main/java` – Java source code (controllers, services, models).
- `src/main/resources` – Configuration files, templates, static assets.
- `src/test/java` – Unit and integration tests.
- `pom.xml` – Maven configuration, dependencies, and build plugins.

Adjust this description to reflect your actual package names and modules.

## Requirements

- Java (JDK) installed (for example Java 17 or the version you use).
- Maven installed and available on your `PATH`.

Check your `pom.xml` for the exact Java version and dependencies.

## Future improvements

- Add persistence (for example, store todos in a database or file).
- Add validation and error handling.
- Add tests for core todo operations.
- Add a REST API or web UI on top of the core logic.

## License

This project is created for learning and personal use. Feel free to fork it, experiment with it, and build additional features on top of it.
