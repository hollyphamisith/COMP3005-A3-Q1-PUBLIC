import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentDAO studentDAO = new StudentDAO();
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        //UI to test functions
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add Student");
            System.out.println("2 - View All Students");
            System.out.println("3 - Update Student Email");
            System.out.println("4 - Delete Student");
            System.out.println("5 - Exit");
            System.out.print("Enter option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentEmail();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }

    //lets user add Student and gets input
    private static void addStudent() {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter enrollment date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();
        LocalDate enrollmentDate = LocalDate.parse(dateString, DATE_FORMATTER);

        studentDAO.addStudent(firstName, lastName, email, enrollmentDate);
        System.out.println("Student added successfully!");
    }

    //calls getAllStudents method
    private static void viewAllStudents() {
        List<Student> students = studentDAO.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //takes student ID input to update student Email
    private static void updateStudentEmail() {
        System.out.println("Enter the student ID to update the email: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        System.out.println("Enter new email: ");
        String email = scanner.nextLine();

        studentDAO.updateStudentEmail(id, email);
        System.out.println("Email updated successfully!");
    }

    //takes studentID input to update student email
    private static void deleteStudent() {
        System.out.println("Enter the student ID to delete: ");
        int id = scanner.nextInt();

        studentDAO.deleteStudent(id);
        System.out.println("Student deleted successfully!");
    }
}
