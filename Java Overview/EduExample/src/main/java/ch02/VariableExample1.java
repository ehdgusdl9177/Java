package ch02;

public class VariableExample1 {
    public static void main(String[] args) {

        // boolean = true / false
        boolean boolVal = true;
        System.out.println("boolean type : " + boolVal);
        System.out.println();

        // 정수형
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 300;
        long longVal = 400L;
        System.out.println("byte type : " + byteVal);
        System.out.println("short type : " + shortVal);
        System.out.println("int type : " + intVal);
        System.out.println("long type : " + longVal);
        System.out.println();

        // 문자형
        char charVal = 'A';         // 문자
        // charVal = 'AB';          // char type은 문자 1개만 저장. 두개 이상의 문자는 String class를 사용
        // String strVal = "AB";
        char charVal10 = 65;        // 10진수
        char charVal16 = 0x0041;    // 16진수
        char charUnicd = '\u0041';  // 유니코드

        System.out.println("char type : " + charVal);
        System.out.println("char unicode : " + charUnicd);

        // 실수형
        float floatVal = 10.3f;
        double doubleVal = 5.32;
        double doubleVal2 = 7.21D;
        System.out.println("floatVal type : " + floatVal);
        System.out.println("doubleVal type : " + doubleVal);
        System.out.println("doubleVal2 type : " + doubleVal2);

        // 상수
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; //에러
        System.out.println("Constant value : " + MAX_VALUE);

    }
}
