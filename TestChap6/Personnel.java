package TestChap6;

public class Personnel extends Person {
    protected String position;

    Personnel(String n, int a, String s, String p) {
        super(n, a, s);
        this.position = p;
    }

    @Override
    public String toString() {
       return super.toString() + "\nตำแหน่ง : " + position;
    }

}
