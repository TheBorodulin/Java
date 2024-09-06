import java.util.List;
class Lisoteh extends Student implements IPassExam {
    private List<String> exams = List.of("Biology", "Chemistry");

    public Lisoteh(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    public void raiseHand() {
        System.out.println(getName() + " " + getLastName() + " raises hand");
    }

    @Override
    public void passExam() {
        displayExams();
    }

    @Override
    public void displayExams() {
        System.out.println(getName() + " " + getLastName() + " at Lisoteh passes " + String.join(", ", exams));
    }
}