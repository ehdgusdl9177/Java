package ch04;

public class SwitchEx {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("num 값은 0 입니다");
                break;
            case 1:
                System.out.println("num 값은 1 입니다");
                break;
            case 2:
                System.out.println("num 값은 2 입니다");
            case 3:
                System.out.println("num 값은 3 입니다");
                break;
            default:
                System.out.println("default 블럭 입니다");
        }
    }
}
