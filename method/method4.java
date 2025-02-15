package method;
import java.util.Scanner;

public class method4 {
    void a(){
         Scanner sc = new Scanner(System.in);
        
        int [] x = new int[5];
        int number = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("ป้อนตัวเลขครั้งที่ " + number++ + ": " );
            x[i] = sc.nextInt();
        }

        int sum = 0;
        for (int j = 0; j < x.length; j+=2) {
            if (x[j] % 2 != 0) {
                sum += x[j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
    public static void main(String[] args) {
        method4 b = new method4();
        b.a();

    }

}
