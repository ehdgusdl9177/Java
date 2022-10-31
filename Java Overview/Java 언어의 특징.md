## Java 란?
- Sun Microsystems에서 1991년 썬의 엔지니어들(제임스고슬링)에 의해서 개발되기 시작하였고 현재는 Oracle에 인수됨
- 원래 이름은 오크(Oak)였고 목표는 Home appliances(가전제품에 탑재)를 위해 고안되었고, 나중에 Java라는 이름으로 변경됨
- 1995년 5월 23일 'SunWorld 95'에 공식적으로 Java와 Hot Java(자바로 구현된 웹 브라우저)가 발표되었고, 1996년 1월에 자바의 정식 버전이 발표됨
- 현재는 version 17까지 출시되었으며, Oracle의 Java년 단위 유료 구독형 라이센스 전환으로 유료화 버전을 사용하는 업체도 있으나 대부분 OpenJDK로 운영하는 회사들이 많음
- Oracle JDK 또한 OpenJDK를 기반으로 추가 기능을 포함하여 제작되고 배포되며, OpenJDK로 운영해도 아무런 문제가 없다.

## Java의 특징
- Products and Teminology
  - JDK(Java Development Kit)
    - 자바 개발 도구로 JVM, API, Compiler, Tools, API document가 포함됨
  - JRE(Java Runtime Environment)
    - 자바 실행 환경으로 자바 애플리케이션 실행되기 위한 최소환경(.class 파일이 동작할 수 있는 환경)으로 java 실행프로그램과 라이브러리를 포함한다.
  - JVM(Java Virtual Machine)
    - 자바 애플리케이션을 해석하고, 로드하여 실행하는 가상머신

<img width="358" alt="스크린샷 2022-10-31 오전 9 13 39" src="https://user-images.githubusercontent.com/75515697/198908894-ded8e7cf-976f-4df9-b9d8-214667e12700.png">

- 플랫폼 독립적
  - OS마다 별도의 실행환경을 제공한다.
- 기존 언어는 OS에 맞게 컴파일된 프로그램이 다른 O/S로 변경되면 기존 컴파일된 것을 재사용할 수 없었음
- JAVA는 애플리케이션이 JVM(Java Virtual Machine) (JRE에 포함되어있음)을 통해서만 통신을 하며 JVM이 OS와 통신하는 구조이고, OS별로 JVM이 존재하여 설치되기 때문에 한번 개발된 JAVA 애플리케이션은 OS 관계없이 실행이 가능하다.

<img width="448" alt="스크린샷 2022-10-31 오전 9 21 21" src="https://user-images.githubusercontent.com/75515697/198909246-94022d34-facb-4019-a09e-8f48b737bd25.png">

- Applications과 Applets
  - Applications
    - OS의 JVM을 통해 실행
  - Applets
    - Browser built-in JVM을 통해 실행

<img width="434" alt="스크린샷 2022-10-31 오전 9 26 12" src="https://user-images.githubusercontent.com/75515697/198909497-bd465dd8-9d11-402b-aadc-2f5ddcd12ff8.png">

- 객체지향 언어이다(OOP: Object-Oriented Programming)
  - 상속(Inheritance), 다형성(Ploymorphism), 캡슐화(Encapsulation)
- 멀티쓰레드(Multi-thread)를 지원한다.
  - 타 언어에서는 O/S 마다 구현방법이 상이함
  - 자바에서는 O/S와 관계없이 구현가능하도록 API 제공
- 배우기 쉽다
  - 기본 구문은 C++, 객체지향관련 구문은 스몰톡(small talk)에서 가져옴
- 네트워크와 분산처리를 지원
  - 풍부하고 다양한 API를 지원하여 쉽고 빠르게 개발 가능
  - 네트워크를 통해 객체를 전송
- 동적 클래스 로딩(Dynamic Class Loading)을 지원
  - Runtime에 모든 프로그램(클래스)로딩되지 않고, 필요한 시점에 로드하여 사용할 수 있음
  - 일부 프로그램이 변경되어도 전체 프로그램을 컴파일 하지 않아도 됨

- 풍부한 API(Application Programming Interface) 지원
- 자동 메모리 관리(GC - Garbage Collection)
  - 시스템 레벨에서 Garbage Collector Thread가 자동적으로 더 이상 사용하지 않는 데이터를 메모리로 반환하는 메모리 관리를 해주기 때문에 별도의 코드가 필요없다.
  - 자동으로 메모리 관리를 해주기 때문에 개발자는 비즈니스 코드에 집중할 수 있다.
  - GC 지원으로 메모리로 인한 System이 crash되는 일이 많이 줄었다.

- Java는 Interpreter를 통해 .class 파일의 Byte Code를 해석하는 과정을 거치기 때문에 Compile Program보다 느릴 수 있지만 한번의 코드작성으로 어떤 OS에서도 실행 가능하며, OS마다 Specific한 JVM을 사용한다.

<img width="624" alt="스크린샷 2022-10-31 오전 9 40 03" src="https://user-images.githubusercontent.com/75515697/198910249-6a68014f-5c2e-4d92-8f3f-4a4758b30f03.png">

