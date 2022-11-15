## 객체 참조 변수 - Memory
- 참조(Reference) 변수는 stack 영역에 참조할 수 있는 값(주소)만을 저장하며, 실제 할당된 데이터들은 Heap 영역에 Student 객체내의 멤버 변수들에 저장된다.

<img width="326" alt="스크린샷 2022-11-15 오후 3 41 12" src="https://user-images.githubusercontent.com/75515697/201846643-894f00e5-83a2-4d81-a83c-9219272538b4.png">

- 객체는 아래와 같은 순서로 초기화되고 메모리에 할당된다
  - 선언된 상태에서는 memory의 reference를 위한 공간만을 할당함
  - new 연산자를 사용해야만 MyDate를 위한 공간이 할당됨
  - 멤버들의 명시적인 초기화
  - 생성자를 실행
  - 변수에 Reference값 할당
  - ```Java
    public class MyDate {
      private int day = 1;
      private int month = 10;
      private int year = 2000;
      public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
      }
    }
    ```
    
<img width="335" alt="스크린샷 2022-11-15 오후 3 52 59" src="https://user-images.githubusercontent.com/75515697/201849672-9e44af31-cb80-494b-ba96-3b80477e40a4.png">

- 기존에 생성된 Reference 변수에 다른 Reference 변수를 할당하면 기존의 Reference를 끊고 새로운 인스턴스를 Reference 한다
- ```Java
  int counter = 10;
  
  Student std = new Student();
  Student otherStd = new Student();
  std = otherStd; <- otherStd와 동일한 인스턴스를 Reference 한다.
  ```
  
<img width="323" alt="스크린샷 2022-11-15 오후 4 27 32" src="https://user-images.githubusercontent.com/75515697/201856047-b9accfb8-acd5-4fb4-ac69-42e6c3a4a6ae.png">

