import java.util.List;
class Franka extends Student implements IPassExam {
    private List<String> exams = List.of("Literature", "History");

    public Franka(String name, String lastName, int age) {
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
        System.out.println(getName() + " " + getLastName() + " at Franka passes " + String.join(", ", exams));
    }
}