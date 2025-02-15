package Chapter6;

public class Student extends Person {
    protected int credits;
    protected double gpa;

    public Student(String name, char sex, int credits, double gpa) {
        super(name, sex);
        this.credits = credits;
        this.gpa = gpa;
    }

    int getCredits() {
        return credits;
    }

    double getGpa() {
        return gpa;
    }

    public String toString() {
        String s = new String(super.toString());
        s += "\n\tcredits: " + getCredits();
        s += "\n\tgpa: " + getGpa();
        return s;
    }
}
