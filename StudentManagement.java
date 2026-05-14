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
        for(Student s : students) {
            s.Display();
        }
    }
}
