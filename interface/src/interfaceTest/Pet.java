package interfaceTest;

public interface Pet {
	int eyes = 2; // final static 생략됨 
	int nose = 1;
	
	public void bang(); // abstract 생략됨
	public void giveYourHand(); 
	public void bite(); 
	public void sitDown(); 
	public void waitNow(); 
	public void getNose(); 
	
}
