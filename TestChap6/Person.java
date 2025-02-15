package TestChap6;

public class Person {
    protected String name;
    protected int age;
    protected String sex;

    public Person(String n, int a, String s) {
        this.name = n;
        this.age = a;
        this.sex = s;
    }

    @Override
    public String toString() {
        return "\nชื่อ : " + name + "\nอายุ : " + age + "\nเพศ : " + sex;
    }

}
