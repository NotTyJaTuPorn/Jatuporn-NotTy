package chap1;
import java.util.Scanner;
public class Chapter1_7 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("ป้อนแถว : ");
        int row = SC.nextInt();

        System.out.print("ป้อนคอลัมน์ : ");
        int column = SC.nextInt();

        for (int i = 1; i <= row; i++) { 
            for (int j = 1; j <= column; j++) { 
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        SC.close();
    }
}