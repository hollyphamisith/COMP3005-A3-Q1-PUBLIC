
VIDEO DEMONSTRATION: https://youtu.be/xso1HLKHMuo

## Prerequisites

Before running this application, make sure you have the following installed:
- JDK 1.8 or later
- PostgreSQL Server (running on localhost, default port 5432)
- PostgreSQL JDBC Driver (included in the project lib folder or added to the classpath)

## Database Setup

1. Create a PostgreSQL database named `a3`.
2. Use the following SQL command to create the `students` table:

```sql
CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    enrollment_date DATE NOT NULL
);

then

Insert the initial data in students table
INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES
('John', 'Doe', 'john.doe@example.com', '2023-09-01'),
('Jane', 'Smith', 'jane.smith@example.com', '2023-09-01'),
('Jim', 'Beam', 'jim.beam@example.com', '2023-09-02');

then update DBUtil with you credentials:
private static final String URL = "jdbc:postgresql://localhost:5432/a3";
private static final String USER = "yourUsername";
private static final String PASSWORD = "yourPassword";

1. direct into src>main
2. run main
3. choose an operation to run (1 - Add Student
                               2 - View All Students
                               3 - Update Student Email
                               4 - Delete Student
                               5 - Exit )


