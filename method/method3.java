package method;
import java.util.Scanner;

public class method3 {
    static void mt3(){
        int number = 1;
        Scanner sc = new Scanner(System.in);
        int [] x = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("ป้อนตัวเลขครั้งที่ " + number++ + ": " );
            x[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int j = 0; j < x.length; j++) {
            if (x[j] > 0) {
                count++;
            }

        }
        System.out.println("จำนวนตัวเลขบวกที่ป้อนเข้ามาคือ: " + count);
        sc.close();
    }

    public static void main(String[] args) {
        mt3();

    }

}
