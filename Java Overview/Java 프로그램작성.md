## 프로그램 작성
- package > import > class 순으로 작성
- 한 명령이 끝난 후에 세미콜론(;) 입력
- '{'와 '}'로 묶인 블록은 클래스, 메서드를 정의하거나 제어문에서 사용
<img width="806" alt="스크린샷 2022-11-04 오전 8 39 49" src="https://user-images.githubusercontent.com/75515697/199855147-d094a731-e339-4879-8915-cb2b982c24da.png">

- 사용자 정의 규칙
  - package명, class명, method명, variable명에 대한 정의 규칙
  - 규칙 위반시 컴파일 에러 발생
    - 글자 수에 제한이 없다.
    - 특수문자(@, #, % , ^, &, *, !, ? 등)은 사용할 수 없다.
    - 첫 글자에 숫자는 사용할 수 없다.
    - 예약어(this, for, if, abstract 등)는 사용할 수 없다.
    
- 코딩 규칙
  - class
    - 첫글자는 '$', '_', 대문자 사용
  - 변수(variable)
    - 일반적으로 static final 변수는 전부 대문자, 그 외에는 소문자 사용
  - 합성어의 첫 글자는 대문자 사용(예: HelloJava, helloJava)
  - variable과 method는 camelcase 형식으로 권장함
  - camelCase
    - xxxxYyyy
  - PascalCase
    - XxxxYyyy

## main() 메소드
- Java 애플리케이샨의 시작점으로 main() 메소드가 포함된 클래스가 반드시 존재해야 한다.
- Runtime에 main() 메소드가 존재하지 않을 결우 아래와 같은 오류 발생
  - Exception un thread "main" java.lang.NoSuchMethodError:main
- Command-Line arguments
  - main 메소드의 파라미터를 통해 애플리케이션 진입시에 값을 전달할 수 있다.
  - 이 기능을 활용해서 애플리케이션 구동시 초기 설정 환경변수 등의 값으로 활용할 수 있다.
    - <img width="521" alt="스크린샷 2022-11-04 오전 9 17 51" src="https://user-images.githubusercontent.com/75515697/199858821-1c153453-70f4-403a-bafd-aa1719786237.png">

<img width="565" alt="스크린샷 2022-11-04 오전 9 23 32" src="https://user-images.githubusercontent.com/75515697/199859316-e60baf8c-c9f1-4319-8c76-94dfb9558017.png">


## 주석(Comment)
- 주석을 이용하여 코드에 대한 설명을 작성한다.
- 프로그램 작성자, 작성일자, 버전 등의 변경이력 정보를 제공할 목적도 있다.
- 종류
  - //: 한줄 주석
  - /*~*/: 범위 주석
  - /**~*/: 사용자 정의 documentation API를 만들 때 사용하는 주석

<img width="555" alt="스크린샷 2022-11-04 오전 9 24 06" src="https://user-images.githubusercontent.com/75515697/199859349-0dff5f0e-2fd8-4a51-b2ce-ceb6cc5b3a5b.png">

## Java 기본 Application 작성
- Package name: ch01
- Class name: Board
- Variable name: boardNo, title
- Method name: main()

<img width="589" alt="스크린샷 2022-11-04 오전 9 24 36" src="https://user-images.githubusercontent.com/75515697/199859397-b0872972-ee60-4da2-b588-d19cb4b490ea.png">

## Compile & Running
- compile: javac 명령어를 이용하여 .java소스를 Compile하면 .class 파일이 생성된다.
  - command line: %JAVA_HOME%₩bin₩javac 자바소스명.java
- Running: java 명령어를 이용하여 .class 파일을 실행한다.(실행시 .class 확장자를 입력하지 않는다)

<img width="430" alt="스크린샷 2022-11-04 오전 10 01 07" src="https://user-images.githubusercontent.com/75515697/199862867-1ae17aaf-1e55-44cb-823a-211fbc313019.png">
