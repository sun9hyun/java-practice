package ambiguityTest;

public interface InterA {
	default void printData() { // default쓰는 이유 abstract 생략 위해 
		System.out.println("InterA");
	}
}
