package arrayListTask;

public class Love {
//	이름,나이
//	private
//	기본생성자
//	toString()
	
	private String name;
	private int age;
	private int number;
	
	public Love() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int Number) {
		this.number = number;
	}

	@Override
	public String toString() {
	      String str = name + "," + age;
	      return str;
	}
}
