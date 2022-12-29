package vo;

public class GirlVO {


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





		@Override
		public String toString() {
			String str = name + "\t" + ranking + "\t" + nameCount ;
			return str; 
		}
		
	}


