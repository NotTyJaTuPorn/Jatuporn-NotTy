package chap1;

import java.util.Scanner;

public class Chapter1_5 {
    public static void main(String[] args) {
        int number=0, min=12;        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("ป้อนตัวเลขที่ไม่เท่ากับสิบสอง :");
            number = sc.nextInt();
            if (number == 12) {
                break;
        } else {
            if (number < min)
                min = number;
        }
    } while(true);
        System.out.print("ค่าที่น้อยที่สุด คือ " + min);
        sc.close();
    }

}
