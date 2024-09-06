
abstract class Student {
    private String name;
    private String lastName;
    protected int age;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void raiseHand();
    public abstract void displayExams();
}