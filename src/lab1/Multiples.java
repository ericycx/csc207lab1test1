package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int num = 0;
        for (int i = 1; i < n; i ++) {
            boolean div_by_3 = i % a == 0;
            boolean div_by_5 = i % b == 0;
            if (div_by_3 || div_by_5) {
                num ++;
            }
        }
        return num;
    }
}
