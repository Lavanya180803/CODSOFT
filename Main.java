import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    String roll = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    if (name.isEmpty() || roll.isEmpty() || grade.isEmpty() || email.isEmpty()) {
                        System.out.println("All fields are required!");
                    } else {
                        Student student = new Student(name, roll, grade, email);
                        sms.addStudent(student);
                        System.out.println("Student added.");
                    }
                    break;

                case "2":
                    System.out.print("Enter Roll Number to Remove: ");
                    String removeRoll = sc.nextLine();
                    sms.removeStudent(removeRoll);
                    System.out.println("Student removed if found.");
                    break;

                case "3":
                    System.out.print("Enter Roll Number to Search: ");
                    String searchRoll = sc.nextLine();
                    Student found = sms.searchStudent(searchRoll);
                    if (found != null) {
                        System.out.println("Found: " + found.getName() + " | " + found.getGrade() + " | " + found.getEmail());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    sms.displayAllStudents();
                    break;

                case "5":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
                
                sc.close();
            }
        }
    }
}
