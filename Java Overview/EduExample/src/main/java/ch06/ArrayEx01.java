package ch06;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] widths;           // 선언
        widths = new int[3];    // 배열 생성

        // 선언과 생성
        int[] ages = new int[5];
        // int[] ages = {20, 15, 33, 42, 19};
        // 배열에 값 할당
        ages[0] = 20;
        ages[1] = 15;
        ages[2] = 33;
        ages[3] = 42;
        ages[4] = 19;

        // 선언, 생성, 값 할당을 동시에 할 수 있다.
        Order order[] = {
                new Order(1, "라면"),
                new Order(2, "세제"),
                new Order(3, "과자")
        };

        // 특정 배열 index(위치의 값 출력)
        System.out.println(ages[0]);
    }
}
