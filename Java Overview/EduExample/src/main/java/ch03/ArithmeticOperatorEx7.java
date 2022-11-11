package ch03;

public class ArithmeticOperatorEx7 {
    public static void main(String[] args) {

        byte num1 = 3;
        byte num2 = 5;
        int result;

        result = num1 | num2;
        System.out.println("3 | 5 = " + result);

        result = num1 & num2;
        System.out.println("3 & 5 = " + result);

        result = num1 ^ num2;
        System.out.println("3 ^ 5 = " + result);
    }
}
