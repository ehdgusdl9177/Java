package ch03;

public class ArithmeticOperatorEx8 {
    public static void main(String[] args) {

        byte num1 = 8;
        int result;

        // x << n 은 x * 2n과 같다 (8 * 4)
        result = num1 << 2;     /* 00001000 << 2 -> 00100000 */
        System.out.println("num1 << 2 = " + result + " / 이진수 -> " + Integer.toBinaryString(result));

        // x >> n 은 x / 2n과 같다 (8 / 4)
        result = num1 >> 2;     /* 00001000 << 2 -> 00000010 */
        System.out.println("num1 >> 2 = " + result + " / 이진수 -> " + Integer.toBinaryString(result));

        /* 논리 시프트 연산자(>>>) 부호비트와 상관없이 0으로 채워져서 무조건 양수이다.
        *  11111111 11111111 11111111 11110000 >>> 3
        *  00011111 11111111 11111111 11111110 >>> 536870910
         */
        result = -16 >>> 3;
        System.out.println("-16 >>> 3 = " + result + " / 이진수 -> " + Integer.toBinaryString(result));
    }
}
