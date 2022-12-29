package operaterTest;

public class Oper1 {
	public static void main(String[] args) {
		boolean isTrue = 10 >11;
		System.out.println(10==11); // 두 값이 같은지
		System.out.println(10!=11); // 두 값이 다른지 
		System.out.println(isTrue); // 10>11 false
		System.out.println(isTrue && 10 ==10); // false && true -> false
		System.out.println(isTrue || 10 ==10); // false || true -> true
		System.out.println(!isTrue && 10 ==10); // true && true -> true
	}
}
