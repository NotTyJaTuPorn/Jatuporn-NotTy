package array;
import  java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] x = new int[5];
        int number = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("ป้อนตัวเลขที่ " + number++ + ": ");
            x[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int j = 0; j < x.length; j++) {
            if (x[j] > 0) {
                sum += x[j];
                count++;
            }
        }

        double average;
        average = (double) sum / count;
        System.out.print(average);
        sc.close();
    }

}
