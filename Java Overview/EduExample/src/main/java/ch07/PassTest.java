package ch07;

public class PassTest {
    public static void main(String[] args) {
        MyDate date;
        int val;

        val = 11;
        // 기본형 변수의 값을 변경하기 위해 호출
        changeInt(val);
        System.out.println("Int value : " + val);

        date = new MyDate(2022, 7, 22);
        // 참조 변수의 참조값을 변경하기 위해 메서드 호출
        changeObjectRef(date);
        // 현재 멤버 변수의 값 출력 -> 원래 객체를 참조하고 있다.
        date.print();

        // 참조변수의 setter 메서드로 객체의 멤버변수 값 수정
        changeObjectVar(date);
        // 값이 변경된 걸 확인
        date.print();
    }

    public static void changeInt(int value) {value = 55;}
    public static void changeObjectRef(MyDate ref) {ref = new MyDate(2022,1,1);}
    public static void changeObjectVar(MyDate rof) {rof.setDay(4);}
}
