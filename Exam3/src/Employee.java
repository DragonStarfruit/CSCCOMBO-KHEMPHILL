
public class Employee extends Person{

		private String office; 
		private int salery; 
		private String hireDate;
		
		public Employee(String name, String address, double phoneNumber, String emailAddress, String office, int salery, String hireDate) {
			super(name, address, phoneNumber, emailAddress);
			this.office = office; 
			this.salery = salery;
			this.hireDate = hireDate; 
		}

		public String getOffice() {
			return office;
		}

		public void setOffice(String office) {
			this.office = office;
		}

		public int getSalery() {
			return salery;
		}

		public void setSalery(int salery) {
			this.salery = salery;
		}

		public String getHireDate() {
			return hireDate;
		}

		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}

		@Override
		public String toString() {
			return "Employee office: " + office 
					+ "\nSalery: " + salery 
					+ "\nHire Date: " + hireDate 
					+ "\n" + super.toString();
		} 
		
		
		
		
}
