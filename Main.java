import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagement sm = new StudentManagement();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            int choice = 0;

            try {

                choice = sc.nextInt();

                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid Menu Choice");
                    continue;
                }

            } catch (Exception e) {

                System.out.println("Invalid Input! Enter Numbers Only");

                sc.nextLine();

                continue;
            }

            switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        if (id <= 0) {
                            System.out.println("ID must be positive");
                            continue;
                        }

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty");
                            continue;
                        }

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        if (age <= 0) {
                            System.out.println("Age must be positive");
                            continue;
                        }

                        Student s = new Student(id, name, age);

                        sm.addStudent(s);

                    } catch (Exception e) {

                        System.out.println("Invalid Input!");

                        sc.nextLine();
                    }

                    break;

                case 2:
                    sm.displayStudents();
                    break;
                case 3:

                    try {

                        System.out.print("Enter Student ID to Search: ");

                        int searchId = sc.nextInt();

                        sm.searchStudent(searchId);

                    } catch (Exception e) {

                        System.out.println("Invalid ID!");

                        sc.nextLine();
                    }

                    break;

                case 4:

                    try {

                        System.out.print("Enter Student ID to Delete: ");

                        int removeId = sc.nextInt();

                        sm.deleteStudent(removeId);

                    } catch (Exception e) {

                        System.out.println("Invalid ID!");

                        sc.nextLine();
                    }

                    break;

                // UPDATE
                case 5:

                    try {

                        System.out.print("Enter Student ID to Update: ");

                        int updateId = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter New Name: ");

                        String newName = sc.nextLine();

                        if (newName.isEmpty()) {
                            System.out.println("Name cannot be empty");
                            continue;
                        }

                        System.out.print("Enter New Age: ");

                        int newAge = sc.nextInt();

                        if (newAge <= 0) {
                            System.out.println("Age must be positive");
                            continue;
                        }

                        sm.updateStudent(updateId, newName, newAge);

                    } catch (Exception e) {

                        System.out.println("Invalid Input!");

                        sc.nextLine();
                    }

                    break;

                // EXIT
                case 6:

                    System.out.println("Exiting...");

                    System.exit(0);
            }
        }
    }
}