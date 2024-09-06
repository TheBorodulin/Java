import java.util.List;
class Politeh extends Student implements IPassExam {
    private List<String> exams = List.of("Ukrainian", "English");

    public Politeh(String name, String lastName, int age) {
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
        System.out.println(getName() + " " + getLastName() + " at Politeh passes " + String.join(", ", exams));
    }
}