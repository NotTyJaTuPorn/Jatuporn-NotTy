package method;

public class method2 {

    void a(){
        int[] n = {1, 2, 3, -4, 5, 6, -7, 8, -9};
        int sum = 0;

        for(int num : n){
            sum += num;
        }

        double average = (double) sum / n.length;
        System.out.printf("%.2f",average);
    }

    public static void main(String[] args) {
        method2 b = new method2();
        b.a();
        
    }

}