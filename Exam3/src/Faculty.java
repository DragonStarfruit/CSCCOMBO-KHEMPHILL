
public class Faculty extends Employee{

		private String officeHours; 
		private String rank;
		
		public Faculty(String name, String address, double phoneNumber, String emailAddress, String office, int salery,
				String hireDate, String officeHours, String rank) {
			super(name, address, phoneNumber, emailAddress, office, salery, hireDate);
			this.officeHours = officeHours; 
			this.rank = rank; 
			
		}

		public String getOfficeHours() {
			return officeHours;
		}

		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}

		public String getRank() {
			return rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		@Override
		public String toString() {
			return "Faculty Office Hours:" + officeHours 
					+ "\nrank: " + rank 
					+ "\n" + super.toString();
		} 
		
		
}
