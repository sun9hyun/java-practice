package randaomTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random(); //
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(3));
		}
		
		r.nextInt(3); // n 전달하면 n-1값 나옴 
	}
}
