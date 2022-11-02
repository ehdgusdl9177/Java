## JVM
- JVM(Java Virtual Machine)은 자바 가상 머신으로 다양한 플랫폼(OS)위에 가상 머신 역할로 자바로 개발한 바이트 코드(.class 파일)가 실행될 수 있는 런타임 환경을 제공하며 각 플랫폼별 JVM은 오라클이나 Open JDK 개발사들이 제공한다.(따라서 플랫폼 독립적인 언어)
- JVM이 구동되면 OS에서 프로세스 형태의 Runtime instance로 구동된다.
- JVM의 주요 Task
  - 코드 로드/확인/실행, 런타임 환경 제공
- JVM 제공하는 기능
  - 메모리 영역, 클래스 파일 형식, 레지스터 세트, 가비지 콜렉터, 치명적 오류 보고 등

## JVM Architecture
- JVM 내부 구조는 Class Loader, Memory Area, Execution Engine 등을 포함하고 있다.
- 동작 흐름
  - 클래스 로더를 클래스 파일을 로드
    - Execution Engine을 통해 Bytecode를 해석(Interpret)
    - Runtime Data Area에 메모리등의 리소스 할당 후 도작
    - 필요에 따라 Garbage Collector를 통한 메모리 관리 및 Thread 등이 동작
- Class(Method) Area
  - Runtime의 Constant pool(상수 풀), Field, Method data, Method에 대한 코드, 클래스별 구조를 저장한다.
- Heap Area
  - Runtime의 객체가 할당되는 데이터 영역이다.
- Stack Area
  - 주로 로컬 변수(Loacl variable)를 저장하는 데이터 영역이다. 각 스레드 별로 Private JVM Stack이 생성된다.

<img width="417" alt="스크린샷 2022-11-02 오전 8 41 42" src="https://user-images.githubusercontent.com/75515697/199362367-6ee62105-6f1f-401a-8dde-671e890890bc.png">

- Execution Engine: 실행 엔진에는 다음과 같은 것들이 포함되어 있다.
  - Interpreter(인터프리터)
    - Bytecode(.class 파일)를 기계(OS에 맞는)가 이해할 수 있는 형태(native code)로 해석하고 명령을 실행한다.
  - JIT(Just-In-Time) Compiler
    - Java의 인터프리터는 런타임에 Bytecode를 매번 읽어들여 해석하는 느린 속도를 해결하기 위해 사용된다.
    - 자주 실행되는 코드를 파악 > 동일한 코드를 매번 해석하지 않고 기계어로 컴파일해서 캐싱하여 재사용 > 성능을 향상시킨다.
    - 실행 기록의 통계 정보로 자주 사용되는 코드들을 확인한다.
  - Garbage Collector
    - 더 이상 사용되지 않는 Object(객체)들을 수집하고 제거하는 역할을 수행한다.
- Native method stack
  - 응용프로그램(Application program)에서 사용되는 Native method 정보를 가지고 있고, 각 스레드별로 개별 Native method stack이 생성된다.
- Native method interface
  - Native Method Libraries와 상화작용하며 Execution Engine을 위해 Native Libraries를 제공한다.

## Java Bytecode
- 자바컴파일러에 의해 생성되는 JVM 해석용 코드로 CPU에 의해 실행되지 않고 JVM이 Interpret 과정을 거쳐 OS에 전달하는 바이너리형태의 명령어 코드
- JVM을 위한 언어로 JVM이 Bytecode를 해석할 수 있는 한, JVM이 어떤 OS에 설치되어 있어도 동일하게 해석되고 동작 된다. > Platform 독립적 > Run Anywhere
- Disassemble the code
  - 컴파일된 Class의 bytecode를 JDK에서 제공하는 JAVAP 커맨드로 역어셈블하여 클래스 파일내의 Bytecode 목록을 추출할 수 있고, 메소드의 목록을 간단히 볼 수 있다.
  - Bytecode는 사람이 쉽게 알아볼 수 있도록 문자화한 니모닉(Mnemonic)으로 되어 있다.
  - Intellij 하단의 Terminal 탭을 클릭 > Terminal 창에서 아래와 같이 입력
    - cd out/production/EduExample/ch01
    - javap -c HeoolWorld

<img width="591" alt="스크린샷 2022-11-02 오전 9 17 30" src="https://user-images.githubusercontent.com/75515697/199365638-33ec9692-94d8-4bb6-a133-d1bace2399ee.png">



