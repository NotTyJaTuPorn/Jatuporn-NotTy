package chap1;
import java.util.Scanner;
public class Chapter1_1{

	public static void main(String[] args) {
            try (Scanner SC = new Scanner(System.in)) {
                System.out.print("ป้อนมวล (m) : ");
                double m = SC.nextDouble();
                System.out.print("ป้อนปริมาตร (v) : ");
                double v = SC.nextDouble();
                double d = m/v;
                
                System.out.println("ความหนาแน่นเท่ากับ : " + d);
                if (d < 1) {
                    System.out.print("เบากว่าน้ำ (Less than water)");
                } else if (d > 1) {
                    System.out.print("หนักกว่าน้ำ (Greater than water)");
                } else if (d == 1) {
                    System.out.print("เท่ากับน้ำ (Equal water)");
                }
            }
	}

}