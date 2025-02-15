package chap1;

import java.util.Scanner;

public class Chapter1_4 {
    public static void main(String[] args) { 

        int number = 0, max = 0;        
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("ป้อนตัวเลขที่ไม่เท่ากับศูนย์ :");
                number = sc.nextInt();
                if (number == 0) {
                    break;
            } else {
                if (number > max)
                    max = number;
            }
   } while(true);
            System.out.print("ค่าที่มากที่สุด คือ " + max);
            sc.close();
        }
    }

}
