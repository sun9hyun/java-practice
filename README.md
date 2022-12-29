# java-practice
7/13 ~ 8/31

# 반복문

 * for문과 while문의 목적
   - for : 몇 번 반복할 지 알 때
   - while : 몇 번 반복할 지 모를 때


 * do~while문 : 무조건 한 번은 실행 해야 할 때

# 기타 제어문
   * break : 즉시 해당 중괄호 영역을 탈출한다.
      - if문 안에서 사용 시 if문을 탈출하지 않고 if문을 감싸고 있는 중괄호 영역을 탈출한다.

   * continue : 즉시 다음 반복
      - 아래의 코드를 실행하지 않기 위해서 사용한다.
    


# 배열 : 저장공간의 나열
   
   - 변수를 여러 개 선언하면 이름도 여러 개 생긴다. 이 때 각 저장공간을 관리하기가 불편하다.
   - 따라서 n칸 배열을 한 번만 선언하면 저장공간도 n개 생기고, 이름도 한 개이기 때문에 관리하기 편하다.

# 메소드
   이름 뒤에 소괄호.
   단, 키워드 뒤에 소괄호는 메소드가 아니다.

 
* 메소드 주의사항
  - 메소드를 선언할 때에는 {}중괄호가 있으며, 반드시 메소드 밖에서 선언한다.
  - 메소드를 사용할 때에는 {}중괄호가 없으며, 반드시 메소드 안에서 사용한다.

* 메소드 사용
  - 메소드의 리턴 타입이 void면 실행 메소드이므로 값으로 봐서는 절대 안된다.
  - 메소드의 리턴 타입이 void가 아니라면 사용한 부분 통채로가 리턴 값이다.

* 메소드의 목적
  - 1. 재사용(특정성을 부여해서는 안된다).
  - 2. 소스코드 간결화
   
* 리턴해야 할 때
  - 사용한 쪽에 로직의 결과를 전달해야 할 때.
  - 메소드 내에서 모든 작업이 끝날 수 없을 때.

* 리턴하면 안될 때
  - 사용한 쪽에 로직의 결과를 전달할 필요가 없을 때.
  - 메소드 내에서 모든 작업이 완료될 때.



# 클래스(반)
   공통요소를 한 번만 선언해 놓고 가져다 사용만 하도록 설계한다.
   타입이고, 주어이다.


* 생성자
  - 클래스 이름 뒤에 소괄호가 있는 형태, 메소드와 기능이 똑같지만 메소드라고 부르지 않는다.
  - 생성자는 리턴이라는 기능이 존재하지 않기 때문이다.

* 기본 생성자
  - 매개변수와 실행할 문장이 따로 없다.
  - 클래스 선언 시, 자동으로 선언되며, 사용자가 직접 생성자를 선언하게 되면 기본 생성자는 없어진다.

* this
  - 필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근할 수 있다.
  - 이 때 접근한 객체가 가지고 있는 필드의 주소값을 this라는 변수에 자동으로 담긴다.

# 다형성(polymorphism)
   * 오버로딩(Overloading)
    -  매개변수의 개수 또는 타입이 다르면 동일한 이름의 메소드로 선언할 수 있다.
   * 오버라이딩(재정의)

# 상속(inheritance)
   - 기존에 선언된 클래스의 필드를 새롭게 만들 클래스의 필드로 사용하고자 할 때
   - 여러 클래스 선언 시 필드가 겹치는 경우, 부모 클래스를 먼저 선언하고, 공통 필드를 묶어서 자식 클래스들에게 상속해준다.

 
* 다중 상속
   - 여러 부모 클래스를 상속하는 것을 다중 상속이라고 한다.
  - JAVA는 모호성 때문에 다중 상속을 지원하지 않는다.
   - 하지만 JDK8버전부터는 인터페이스에 default 메소드 선언을 허용하며, 여러 개를 지정할 수 있는 인터페이스 특성상 다중 상속을 지원하는 것이나 다름이 없다.

# 캡슐화(encapsulation)
-  클래스 안에다가 데이터와 데이터를 처리하는 행위를 묶어 놓는 것 이라고 말할 수 있다.

# 추상화(abstraciton)
-  불필요한 코드를 제거하고 중요한 부분을 살리는 것이다.

* 추상 클래스
   - 필드 안에  구현이 안된 메소드가 선언되어 있는 클래스를 추상 클래스라고 한다.
   - 이 때 구현되지 않은 메소드를 추상 메소드라고 부른다.
   -반드시 재정의를 통해 구현을 해야지만 메모리에 할당되기 때문에 "강제성"을 부여하기 위해서 추상 메소드로 선언한다.

# 전역변수
      생성자를 통해 메모리에 할당되며, 객체가 각각 가지고 있는 변수

# static 변수(정적변수)
      컴파일러를 통해 메모리에 1개 할당되며, 모든 객체가 공유하는 변수

# 접근 권한 제어자(접근자)

  - default : 다른 패키지에서 접근 불가 , 같은 패키지 접근 가능
  - public : 모든 곳에서 접근 가능, 해당 파일의 메인 클래스일 경우만 사용
  - protected : 다른 패키지에서 접근 불가, 자식은 가능
  - private : 다른 클래스에서 접근 불가, 메소드로만 접근하자!


# Casting
  - up casting : 자식 값을 부모 타입으로 형변환
  - down casting : up casting된 객체를 자식 타입으로 형변환
   ※ 부모 값을 자식 타입으로 형변환 시 오류


# Casting을 사용하는 이유
  - 모든 자식 값을 전달받기 위해서는 동일한 타입의 저장공간으로 받아야 한다.
  - 하지만 자식끼리는 서로 타입이 다르기 때문에 한 번에 전달받을 수가 없다.
  - 이 때 up casting을 사용하면, 모든 자식이 부모 타입이므로 하나의 저장공간에 모든 자식을 받을 수 있게 된다.
  - 만약 up casting으로 자식 값을 전달받았다면, 자식에서 새롭게 구현한 기능들은 사용할 수 없기 때문에 down casting을 통해서 복구하고 사용한다.


# 인터페이스(interface) : 틀
   - 추상 클래스를 고도화시킨 문법
   - 상수와 추상메소드만 존재한다.
   - 구현은 인터페이스를 지정한 클래스에서 진행하고, 인터페이스를 다른 클래스에 지정할 때에는 implements 키워드를 사용한다.
   
# 함수형 인터페이스(Functional interface)
   - 인터페이스 중 추상 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.
   - 이 때 @FunctionalInterface를 인터페이스 위에 작성하여 단 하나의 추상 메소드만 선언할 수 있도록 제한해야 한다.

# 람다식(Lambda Expression)
   - 이름이 없는 메소드로서 변수처럼 사용이 가능하며, 매개변수로도 전달이 가능하다.
   - 함수형 인터페이스는 추상 메소드가 한 개만 선언되기 때문에 메소드 이름이 필요 없다.
   - 따라서 람다식을 익명 메소드(Anonymous Method)라고도 부른다.

* 람다식 문법
   - (매개변수 형식 나열,...) -> 리턴값;
   - (매개변수 형식 나열,...) -> {2개 이상의 문장 작성; return 리턴값;}


# 예외 처리
  - 에러 : 심각한 오류
  - 예외 : 덜 심각한 오류


# API(Application Programming Interface)
   개발에 필요한 라이브러리들의 집합.
   선배 개발자들이 많어 놓은 소스코드.

   - 내부 API
      JDK 설치 시 제공해주는 기본 API
      docs.oracle.com/javase

   - 외부 API
      선배 개발자들이 개발한 패키지 및 클래스들을 의미한다.
      보통 JAR파일로 배포하며 자바 프로젝트의 buildPath에 추가하여 사용할 수 있다.

JAR 파일로 배포하기
   배포할 클래스 또는 패키지 우클릭
   > Export > JAVA/JAR file 선택 > Next
   > destination을 원하는 경로로 선택
   > Export Java source files... 체크
   > Finish

JAR 파일을 프로젝트에 추가하기
   배포된 JAR파일을 다운 받기
   > 프로젝트 우클릭 > Build Path > Configure Build Path
   > Libraries 탭 클릭 > ClassPath(안되면 ModulePath) 클릭 > Add External JARs
   > 저장된 경로의 .jar파일을 더블 클릭으로 추가 > Apply 클릭
   > Orders and Exports 탭 클릭
   > Select All 클릭 > Apply and Close


# Object 클래스(최상위 부모 클래스, 모든 클래스는 자동으로 Object를 상속받는다)
   * toString()
    -  항상 객체명을 출력할 때에는 toString()이 생략되어 있다.
     - toString()을 통해 출력되는 문자열이 마음에 들지 않는다면, 재정의하여 수정하도록 한다.
      - 실무에서는 클래스 선언 시 각 필드의 초기화 여부를 확인하기 위해 toString을 재정의하여 사용한다.

   * equals()
     - 주소값 비교(==).
     - String 클래스에서 equals를 값 비교로 재정의하여 사용하기 때문에
     - 문자열 비교는 무조건 equasl()로 비교한다.

   * hashCode()
  
  
 # Set : 집합

  * HashSet
    -  집합에서는 중복되는 원소를 포함할 수 없는 것 처럼 HashSet이라는 자료구조는 중복되는 값을 무시한다.
    -  저장된 값들은 인덱스가 없기 때문에 순서가 없다.
    -  값의 유무 검사에 특화되어 있는 자료구조이고
    -  해시코드로 유무 검사가 진행되고 속도가 상대적으로 좋다.

 * 순서 부여 : iterator()
  - 순서가 없는 객체에 순서를 부여하거나, 순서가 있어도 iterator 방식의 순서로 변경하고자 할 때 사용한다.
  - hasNext()를 통해 다음 값이 있는 지 검사하고, next()를 사용하여 값을 가져온다.

- Set은 검사의 목적이 있기 때문에 순서 정보를 관리할 필요가 없어서 데이터 크기에 상관없이 검색에 걸리는 시간이 매우 짧다.
- 반면 ArrayList는 index를 관리해야하기 때문에 상대적으로 시간이 오래 걸린다.
> 그러므로 기능적 차이가 없다면 Set을 사용한다.



 # Map
   * HashMap(서버 간 데이터 교환)
     - Key와 Value 한 쌍으로 저장되며, 검색의 목적을 가지고 있다.
     - Key는 중복된 값을 넣으면 Value가 최근 값으로 수정되고, 중복되지 않은 값을 넣으면 새롭게 추가된다.
     - Value는 중복이 가능하다.
         
 # 파일 입출력(Java Application 관점)
   - Stream이라는 연결통로를 통해 원본 데이터가 알맞는 인코딩 방식으로 전송된다.
   - byte단위로 입출력되기 때문에 개별처리이며, 상세 연산이 필요하지 않다면
   - Buffer를 사용한 입출력을 권장한다. Buffer를 사용하면 일괄처리가 가능해진다.

   * Writer(출력)
     - BufferedWriter : 버퍼를 사용한 출력 클래스
     - FileWriter : 전달한 경로의 파일을 출력하기 위한 목적으로 열어준다.
     - 전달한 경로에 파일이 없다면 새롭게 만든 후 열어준다.

   * Reader(입력)
     - BufferedReader : 버퍼를 사용한 입력 클래스
     - FileReader : 전달한 경로의 파일을 입력하기 위한 목적으로 열어준다.
             - 전달한 경로에 파일이 없다면 오류가 발생한다(FileNotFoundException).

   * File(파일 정보)
     - 전달한 경로에 있는 파일의 정보를 담는 타입.
     - 디렉터리 생성, 해당 경로의 전체 파일 목록, 파일 삭제 등


# MVC
  * M(Model) : DB에서 조회된 결과 값을 담기 위한 변수들이 선언된 클래스
      - 클래스명 뒤에 VO, DTO라는 문자열을 붙여준다.
      - VO(Value Object) : 테이블을 보고 그대로 만든 객체
      - DTO(Data Transfer Object) : 화면에 결과를 담아서 전달할 객체

   * V(View) : 사용자에게 보여질 화면을 구성하는 부분
      - Controller에 선언된 CRUD 메소드를 사용하는 부분

   * C(Controller) : DB에 접근할 수 있는 메소드들이 선언된 클래스
      - 접근 후 결과 값이 있을 경우 Model 객체에 담은 후 처리
      - 클래스명 뒤에 DAO라는 문자열을 붙여준다.
      - DAO(Data Access Object)
