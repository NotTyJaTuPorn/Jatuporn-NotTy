package chap1;
import java.util.Scanner;
public class Chapter1_6 {

        public static void main(String[] args) {
            int number = 0, max = 0, sum = 0;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.print("ป้อนตัวเลขที่ไม่เท่ากับศูนย์: ");
                number = sc.nextInt();
    
                if (number == 0) {
                    break;
                } else {
                    sum += number;
                    if (number > max) {
                        max = number;
                    }
                }
            } while (true);
            System.out.println("ค่าที่มากที่สุด คือ " + max);
            System.out.println("ผลรวมของตัวเลขทั้งหมด คือ " + sum);

            sc.close();

        }
    }