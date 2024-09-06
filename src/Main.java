import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Politeh("Ivan", "Danyliv", 18));
        students.add(new Politeh("Petro", "Shchur", 19));
        students.add(new Franka("Maria", "Melnyk", 20));
        students.add(new Lisoteh("Galyna", "Pylypiv", 17));
        students.add(new Politeh("Pavlo", "Ivaniv", 19));
        students.add(new Lisoteh("Taras", "Riznyk", 19));
        return students;
    }

    public static void allStudentsRaiseHands(List<Student> students) {
        students.forEach(Student::raiseHand);
    }

    public static void allPassExam(List<Student> students)  {
        students.forEach(student -> {
            if (student instanceof IPassExam) {
                ((IPassExam) student).passExam();
            }
        });
    }

    public static void filterStudents(List<Student> students) {
        students.stream()
                .filter(s -> s.age > 18 && s.getName().startsWith("P"))
                .forEach(s -> System.out.println(s.getName() + " " + s.getLastName()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = createStudentList();

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter command (hand, exams, filter, exit):");
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "hand":
                    allStudentsRaiseHands(students);
                    break;
                case "exams":
                    allPassExam(students);
                    break;
                case "filter":
                    filterStudents(students);
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Unknown command");
                   // break;
            }
        }
        scanner.close();
    }
}