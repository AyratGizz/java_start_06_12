package Seminar_1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(110));
    }

    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod = prod * digit;
            sum = sum + digit;

            n = n / 10;
        }
        return prod - sum;
    }
}
