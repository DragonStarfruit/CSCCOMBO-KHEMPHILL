
public class Staff extends Employee{

		private String title;

		public Staff(String name, String address, double phoneNumber, String emailAddress, String office, int salery,
				String hireDate, String title) {
			super(name, address, phoneNumber, emailAddress, office, salery, hireDate);
			this.title = title;
		}
		
		
		
		public String getTitle() {
			return title;
		}



		public void setTitle(String title) {
			this.title = title;
		}



		@Override
		public String toString() {
			return "Staff title:" + title 
					+ "\nOffice:" + getOffice() 
					+ "\nSalery:" + getSalery()
					+ "\nHire Date: " + getHireDate() 
					+ "\n" + super.toString() ;
		}


		
		
}
