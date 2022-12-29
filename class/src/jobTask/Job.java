package jobTask;




public class Job {
	String name;
	int exp;
	int level;
	
	public Job () {;}
	public Job(String name,int exp,int level) {
		this.name = name;
		this.exp = exp;
		this.level = level;
	}
	void work(){
		exp++;	
	}
	void fail() {
		exp--;
	}
	void traine() {
		exp++;
	}
	
}
