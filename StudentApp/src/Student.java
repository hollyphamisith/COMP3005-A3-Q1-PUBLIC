import java.time.LocalDate;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate enrollmentDate;

    // Constructor
    public Student(int studentId, String firstName, String lastName, String email, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    //toString method to print students nicely
    @Override
    public String toString() {
        return String.format("ID: %-4d | Name: %-10s %-10s | Email: %-30s | Enrollment Date: %-10s",
                studentId, firstName, lastName, email, enrollmentDate);
    }
}

