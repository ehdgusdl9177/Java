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

- 역어셈플코드 중에 #1, #2 등의 번호는 상수 풀(Constants Pool)에 대한 참조로 상수가 어떤 것인지 보기 위해서는 '-verbose' 옵션을 추가하여 javap 명령을 실행하면 된다. > javap -c -verbose Hello World

## Class Loader
- Class를 Load하고 Link를 통해 적절히 배치하는 일련의 작업을 수행
  - Class는 참조되는 순간 동적으로 Load 및 Link가 이루어진다.(Dynamic Loading)
  - Load가 어느 시점에 수행되느냐에 따라 LoadTime Dynamic Loading과 Runtime Dynamic Loading으로 구분된다.
- JVM에 Namespace를 이용하여 이미 로딩된 클래스는 로딩하지 않는다.
- JVM 기동시 기본적으로 로딩
  - Bootstrap ClassLoader를 생성(부모를 가지지 않는 최상위 ClassLoader로 Native code로 구련되었으며, 런타임환경 구성의 기초단계)
  - Java Runtime Library(rt, jar)를 로딩
  - java.lang.Object class를 로딩

<img width="232" alt="스크린샷 2022-11-03 오전 8 53 40" src="https://user-images.githubusercontent.com/75515697/199623655-cc176b36-2e49-414a-944f-90a9213830a8.png">

## Execution Engine - Interpreter
- 로딩된 클래스가 Execution Engine을 거치게 되면 내부적으로 Bytecode를 Instruction(명령어)으로 변경하여 이를 수행한다.
- Interpreter 방식은 Bytecode를 하나씩 읽고 해석하여 실행하는 방식으로 실행시간이 많이 걸린다.
- 초장기의 JVM은 실행 속도에 있어 약점이 있었다.

<img width="401" alt="스크린샷 2022-11-03 오전 9 24 48" src="https://user-images.githubusercontent.com/75515697/199626458-4187458c-dd6e-4c94-bf87-e2ae82889282.png">

## Execution Engine - JIT(Just-In-Time) Compiler
- JIT Compiler방식은 Bytecode로 부터 Native code(OS가 해석 가능한 기계어)를 생성한 뒤 실행함
- 아래 그림과 같이 java 소스가 ByteCode로 변경된 후 JIT Compiler를 통하면 Native Code로 변경되어 실행됨
- 실행시간은 빠르나 Native code로 compile하는 시간은 길다
- 기본적으로 Cache가 되기 때문에 반복 호출시(Loop문) 성능이 극대화 됨. 그렇지 않다면 Interpreter 보다 성능이 떨어질 수 있다.
- 그렇기 때문에 Interpreter를 사용하다가 일정한 기준을 넘어서게 되면 JIT Compiler를 가동하는 방식(Lazy Fashion)을 사용

<img width="510" alt="스크린샷 2022-11-03 오전 9 29 38" src="https://user-images.githubusercontent.com/75515697/199626841-2b715030-1be6-4baa-8b24-86feb7204e52.png">

## Runtime Data Area
- PC(Program Counter) Register
  - Java는 Stack-Base로 작동되며, 현재 작업하는 내용을 CPU에 Instruction(명령)으로 제공해야 하는데 이를 위한 버퍼공간으로 PC Register라는 메모리 영역을 생성
- Java Stack: 로컬 변수(Local Variable)를 저장하는 공간
  - 메소드가 호출될 때마다 Stack Frame라는 새로운 데이터 영역이 생성됨
  - Stack Frame이 모여 Java Stack이 되며, 최상단은 Active Java Stack이 됨
  - 하나의 Thread에 각각의 Java Stack이 존재함

<img width="218" alt="스크린샷 2022-11-03 오전 9 46 03" src="https://user-images.githubusercontent.com/75515697/199628310-4362dc0a-813c-43af-a83b-e340aef8bd66.png">

- Native Method Stack
  - JVM Method와 같은 방식으로 사용됨
  - JVM 명령이 아닌 다른 언어를 사용해서 구현(보통 C언어)
  - JNI(Java Native Interface)를 이용해서 다른 언어와 연동할 수 있음

<img width="492" alt="스크린샷 2022-11-03 오전 9 56 56" src="https://user-images.githubusercontent.com/75515697/199629143-80ba30e0-ed36-4cb6-bb0b-37e4c127cc0e.png">

## Garbage Collector
- 시스템 레벨에서 Garbage Collector Thread가 자동적으로 더 이상 사용하지 않는 데이터를 메모리로 반환하는 메모리 관리를 해주기 때문에 별도의 코드가 필요없다.
- 자동으로 메모리 관리를 해주기 때문에 개발자는 비즈니스 코드에 집중할 수 있다.
- GC지원으로 메모리로 인한 System이 crash되는 일이 타 언어에 비해 많이 줄었다.(GC를 지원한다고해서 메모리 부족으로 시스템이 다운되는 현상이 없어지는 것은 아니다.)
- 전체 메모리가 아닌 특정한 객체 단위의 Operation이다.
- 개발자가 코드를 삽입하여 메모리 해제할 수 없다. 대신 필요시 GC Option이라는 것을 이용하여 GC의 메모리 수집 방식을 조정하여 애플리케이션을 운영앟ㄹ수 있다. Java 11 버전에서는 G1 GC알고리즘을 기본으로 사용한다.
- Garbage 대상은 Heap과 Method Area에서 현재 사용되지 않고 있는 객체를 의미한다. Java에서는 객체 인스턴스가 생성된 후 시간에 따라 5가지 세대로 나눠진다.
  - Eden > Survivir0 > Survivor1 > Old (왼쪽 방향일수록 신생데이터)
- Metaspace는 OS레벨에서 관리하는 Native memory 영역으로 클래스, 메소드, 상수 풀 정보 등의 메타 정보들이 저장되며 사이즈에 제한이 없다(Java 8 버전이전에는 permanent영역으로 사이즈 제한으로 인해 메모리 부족현상 오류가 발생했었다.)

<img width="434" alt="스크린샷 2022-11-03 오전 10 09 06" src="https://user-images.githubusercontent.com/75515697/199630076-f5ce32cb-f650-4e0c-b0ca-f00d65769310.png">
