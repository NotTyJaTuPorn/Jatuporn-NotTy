package Chapter4;

public class TestHumans1 {
    public static void main(String[] args) {
        Human a1 = new Human("สมชาย");
        System.out.println(a1);
        System.out.println();

        Human a2 = new Human("สมหญิง", "Nokia");
        System.out.println(a2);
        System.out.println();
        
        Human a3 = new Human("จตุพร", "ชาย", "BlackBerry", "พูดคนเดียว");
        System.out.println(a3);
        System.out.println();

        Human a4 = new Human("สมร", "หญิง", "", "เล่นเกม CrossWord");
        System.out.println(a4);
        System.out.println();
    }
}
