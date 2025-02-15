package Chapter6;

public class Person {
    protected String name;
    protected char sex;

    public Person(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String toString() {
        return "ชื่อ: " + name + " เพศ: " + sex;
    }

}
