package lambdaTest;

@FunctionalInterface
// 함수형 인터페이스로 선언
public interface PrintName {
// 성과 이름을 전달 받은 후 String으로 리턴하는 추상 메소드 선언
	public String checkName(String firstName,String lastName);
	}


