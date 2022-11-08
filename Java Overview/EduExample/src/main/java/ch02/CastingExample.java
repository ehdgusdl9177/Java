package ch02;

public class CastingExample {
    public static void main(String[] args) {
        double douVal = 35.3;
        int score = (int)douVal;    // 강제 캐스팅으로 소수점 절사

        System.out.println("int score = " + score);
        System.out.println("double douVal = " + douVal);

        byte b = 10;
        int i = b; // up-casting
        System.out.println("byte b : " + b + ", int i : " + i);

        int i2 = 300;
        byte b2 = (byte)i2; // down-casting
        System.out.println("int i2 : " + i2 + ", byte b2 : " + b2);
    }
}
