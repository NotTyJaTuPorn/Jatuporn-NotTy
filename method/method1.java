package method;

public class method1 {
    static void arrData(int [] n){
        
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
        if (n[i] % 2 == 0) {
            sum += n[i];
        }
    }
    System.out.println("ผลรวมสมาชิกที่เป็นเลขคู่: " +sum);

    }
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrData(n);
    }

}