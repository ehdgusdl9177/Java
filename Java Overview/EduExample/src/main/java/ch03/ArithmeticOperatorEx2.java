package ch03;

public class ArithmeticOperatorEx2 {
    public static void main(String[] args) {
        int count = 15;
        // 선증가 연산자 : count(16) = count(15) + 1 -> count값 출력
        System.out.println("++count = " + ++count + ", count값 : " + count);
        // 후증가 연산자 : count값 출력(16), count(17) = count(16) + 1
        System.out.println("count++ = " + count++ + ", count값 : " + count);
        // 선감소 연산자 : count(16) = count(17) - 1 -> count값 출력
        System.out.println("--count = " + --count + ", count값 : " + count);
        // 후감소 연산자 : count값 출력(16), count(15) = count(16) - 1
        System.out.println("count-- = " + count-- + ", count값 : " + count);

        int i = 10;
        int j = 10;
        System.out.println(i++ + ++i);      // 10 + 12 = 22
        System.out.println(j++ + j++);      // 10 + 11 = 21
    }
}
