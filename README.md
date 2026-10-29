# Library-Management-System
Java Swing Library Management System connected to a MySQL database using JDBC and the MySQL Connector/J JAR file to manage student records, books, and issue/return operations.

To connect your Library Management System (Java Swing + MySQL) to a database, you need MySQL, the MySQL JDBC driver, and a Java connection class.

Step 1: Create the database in MySQL
Open MySQL Workbench or the MySQL command line and execute:
CREATE DATABASE library;
USE library;

If your project already has a database with tables such as student, users, and book, use that existing database name instead of creating a new one.

Step 2: Add the MySQL JDBC driver
In NetBeans, if your project uses a standard Java project:
1. Right-click your project.
2. Select Properties → Libraries.
3. Click Add JAR/Folder.
4. Select the MySQL Connector/J .jar file.
5. Click Apply → OK.

Step 3: Configure the Database Connection

Open the existing `Database.java` file in the `library.management.system` package and configure the following details:

- JDBC Driver: MySQL JDBC Driver
- JAR File: MySQL Connector/J
- Database URL: `jdbc:mysql://localhost:3306/library`
- Username: `root`
- Password: Your MySQL password
