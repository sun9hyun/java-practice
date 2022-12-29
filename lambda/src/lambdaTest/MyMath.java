package lambdaTest;

public class MyMath {
	public static Calc calculator(String oper) {
		Calc c = null;
		
		switch(oper) {
		case "+":
			c = (n1, n2) - > n1 + n2;
			break;
		case "-":
			c = (n1, n2) - > n1 - n2;
			break;
		}
		
		return c;
		
	}
public static void main(String[] args) {
	
}
