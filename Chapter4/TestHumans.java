package Chapter4;

public class TestHumans {
    public static void main(String[] args) {
        Human a1 = new Human("จตุพร", "ชาย", "BlackBerry", "พูดคนเดียว");
        Human a2 = new Human("สมชาย", "ชาย", "Nokia");
        Human a3 = new Human("สมหญิง", "หญิง");
        Human a4 = new Human("สมร", "หญิง", "N/A", "เล่นเกม CrossWord");

        printHumanInfo(a1);
        printHumanInfo(a2);
        printHumanInfo(a3);
        printHumanInfo(a4);
    }

    public static void printHumanInfo(Human human) {
        System.out.println("ชื่อ : " + human.getName());
        System.out.println("เพศ : " + human.getSex());
        System.out.println("โทรศัพท์ : " + human.getPhone());
        System.out.println("งานอดิเรก : " + human.getHobby());
        System.out.println("-------------------------");
    }
}
