package vo;

public class NameDTO {

			
			private String gender;
			private String name;
			private int ranking;
			private int nameCount;
			

			public void BirthVO() {;}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public int getRanking() {
				return ranking;
			}


			public void setRanking(int ranking) {
				this.ranking = ranking;
			}


			public int getNameCount() {
				return nameCount;
			}


			public void setNameCount(int nameCount) {
				this.nameCount = nameCount;
			}
			
			public int getgender() {
				return nameCount;
			}


			public void setgender(String gender) {
				this.gender = gender;
			}





			@Override
			public String toString() {
				String str = gender +"\t"+ name + "\t" + ranking + "\t" + nameCount ;
				return str; 
			}
			
		}


