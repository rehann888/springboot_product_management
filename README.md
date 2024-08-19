# Spring Boot Product Management Application

This is a simple Product Management application built with Spring Boot. It allows users to add, edit, delete, and search for products in a catalog. The application uses Thymeleaf for the frontend and integrates with a database using JPA/Hibernate.

## Features

- **CRUD Operations:** Add, edit, delete, and view products.
- **Search Functionality:** Search for products by name.
- **Responsive Design:** Built with Bootstrap for a mobile-friendly experience.

## Technologies Used

- **Spring Boot:** Backend framework.
- **Thymeleaf:** Templating engine for rendering views.
- **Bootstrap:** Frontend framework for responsive design.
- **JPA/Hibernate:** For database interaction.
- **MySQL/PostgreSQL:** Database (can be configured for any relational database).

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL or any other relational database

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/rehann888/springboot_product_management.git

   ```

2. Navigate to the project directory:

   ```bash
   cd springboot-product-management

   ```

3. Configure the database:
   Update the `application.properties` file in `src/main/resources` with your database details.

4. Build the project:

   ```bash
   mvn clean install

   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

Usage

- Visit `http://localhost:8080` in your browser.
- Use the interface to add, edit, delete, or search for products.
# springboot_product_management
# springboot_product_management
