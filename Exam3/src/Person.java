
public class Person {
	
	private String name; 
	private String address;
	private double phoneNumber; 
	private String emailAddress;
	
	public Person(String name, String address, double phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person name: " + name 
				+ "\nAddress: " + address 
				+ "\nPhone Number: " + phoneNumber 
				+ "\nEmail: s" + emailAddress;
	}
	
	
}
