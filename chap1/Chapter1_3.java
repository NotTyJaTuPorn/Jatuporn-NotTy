package chap1;
import java.util.Scanner;
public class Chapter1_3 {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.print("ป้อนข้อความ: ");
            String message = SC.nextLine();
            
            System.out.print("ป้อนตัวเลขจำนวนเต็ม: ");
            int number = SC.nextInt();
            
            for (int i = 0; i < number; i++) {
                System.out.println(message);
            }
            SC.close();
        }
    }
        
}  