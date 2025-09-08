package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i ++) {
            boolean div_by_3 = i % 3 == 0;
            boolean div_by_5 = i % 5 == 0;
            if (div_by_3 || div_by_5) {
                count ++;
            }
        }
        System.out.println(count);

    }
}
