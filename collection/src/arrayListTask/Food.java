package arrayListTask;

public class Food {
//	이름,가격,종류(한중일양)
//	private
//	기본생성자
//	toString
	
	private String kinds; 
	private String name;
	private int price;
	
	public Food() {;}

	





	public String Kinds() {
		return kinds;
	}







	public String getKinds() {
		return kinds;
	}







	public void setKinds(String kinds) {
		this.kinds = kinds;
	}







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
	      String str = name + "," + price + "," + sort;
	      return str;
	}

	
}
