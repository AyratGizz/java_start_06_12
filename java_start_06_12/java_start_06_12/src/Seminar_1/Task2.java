package Seminar_1;

public class Task2 {
    public static void main(String[] args) {
    }

    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            carry += (num1.charAt(i) - '0');


            if (j >= 0) {
                carry += (num2.charAt(j) - '0');
            }

            res = (carry % 10) + res;
            carry = carry / 10;
            j = j - 1;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;

    }

}
