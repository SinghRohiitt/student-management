import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("student add sucesfully");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }
        for (Student s : students) {
            s.Display();

        }
    }

    public void searchStudent(int id) {

        boolean found = false;

        for (Student s : students) {

            if (s.id == id) {
                s.Display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    public void deleteStudent(int id) {

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).id == id) {

                students.remove(i);

                System.out.println("Student deleted successfully");

                found = true;

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    public void updateStudent(int id, String newName, int newAge) {
        boolean found = false;
        for (Student s : students) {
            if (s.id == id) {
                s.name = newName;
                s.age = newAge;
                System.out.println("student updated successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("student not found");
        }
    }
}
