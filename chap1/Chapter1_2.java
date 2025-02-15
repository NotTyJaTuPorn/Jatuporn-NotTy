package chap1;
import java.util.Scanner;
public class Chapter1_2 {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.print("ป้อนตัวเลขเดือน 1-12 : ");
            int m = SC.nextInt();
            
            String M;
            M = switch (m) {
                case 1 -> "มกราคม";
                case 2 -> "กุมภาพันธ์";
                case 3 -> "มีนาคม";
                case 4 -> "เมษายน";
                case 5 -> "พฤษภาคม";
                case 6 -> "มิถุนายน";
                case 7 -> "กรกฎาคม";
                case 8 -> "สิงหาคม";
                case 9 -> "กันยายน";
                case 10 -> "ตุลาคม";
                case 11 -> "พฤศจิกายน";
                case 12 -> "ธันวาคม";
                default -> "ไม่พบเดือนนี้";
            };
            System.out.println("เดือน " + M);
        }
    }

}
