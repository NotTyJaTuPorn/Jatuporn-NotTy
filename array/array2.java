package array;

public class array2 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, -4, 5, 6, -7, 8, -9};
        int sum = 0;
        int count = 0;
        double average;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                sum += n[i];
                count++;
            }
        }
        average = (double) sum / count;
        System.out.println(average);
    }
}