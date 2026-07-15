# Hibernate-One-To-Many-Mapping
A Java Hibernate ORM project demonstrating One-to-Many entity mapping between Trainer and Student using JPA annotations, MySQL, and Maven.
# Hibernate One-To-Many Mapping

A Java Hibernate project demonstrating **One-to-Many Mapping** between `Trainer` and `Student` entities using Hibernate ORM, JPA annotations, MySQL, and Maven.

## Features

- One-to-Many Entity Mapping
- Hibernate ORM
- JPA (Java Persistence API)
- MySQL Database Integration
- Maven Project
- Entity Relationship Management

## Technologies Used

- Java
- Hibernate ORM
- JPA
- MySQL
- Maven
- Eclipse IDE

## Project Structure

```
src
├── main
│   ├── java
│   │   └── controller
│   │       ├── Trainer.java
│   │       ├── Student.java
│   │       └── Mainclass.java
│   └── resources
│       └── META-INF
│           └── persistence.xml
```

## Entity Relationship

```
Trainer (1)
   |
   | One-To-Many
   |
   +-------- Student
   +-------- Student
   +-------- Student
```

## JPA Annotations Used

- @Entity
- @Id
- @Column
- @OneToMany
- @ManyToOne
- @JoinColumn

## Database

- MySQL

## How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Configure the MySQL database in `persistence.xml`.
4. Update Maven dependencies.
5. Run `Mainclass.java`.
6. Verify the inserted records in the database.

## Learning Outcomes

- Hibernate Configuration
- One-to-Many Mapping
- Many-to-One Mapping
- EntityManager
- EntityTransaction
- Data Persistence

## Author

**Madiha Azam Ahmed**

GitHub: https://github.com/madihaazamahmed-droid
