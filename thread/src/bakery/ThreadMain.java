package bakery;

import javax.swing.JOptionPane;

public class ThreadMain {
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		String[] btn = {"계속하기","나가기"};
		t.start();
		
		if(JOptionPane.showOptionDialog(null, "", "종료 테스트", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, btn, null) == 1) {
			t.interrupt();
	}
}
}