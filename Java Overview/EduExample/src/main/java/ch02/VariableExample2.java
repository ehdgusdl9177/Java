package ch02;

public class VariableExample2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;    // x변수의 값을 tmp변수에 할당
        x = y;      // y변수의 값을 x변수에 할당
        y = tmp;    // tmp변수의 값을 y변수에 하당

        System.out.println("x:"+ x + " y:" + y);

        short a,b,c;
        a = 1;
        b = 2;
        c = (short)(a+b);
        System.out.println("c:"+ c);
    }
}
