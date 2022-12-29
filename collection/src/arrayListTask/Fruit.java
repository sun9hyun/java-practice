package arrayListTask;

public class Fruit {
//	과일이름,과일가격
//	private
//	기본생성자
//	toString()재정의
	
	private String name;
	private int price;
	
	public Fruit() {;}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
	      String str = name + "," + price;
	      return str;
}
}
