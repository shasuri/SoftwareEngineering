package refactoring.extractclass.before;

public class Worker {
	private String name;
	private PhoneNumber phoneNumber;

	public Worker(String name, String officeAreaCode, String officeNumber) {
		this.name = name;

		this.phoneNumber = new PhoneNumber(officeAreaCode, officeNumber);
		// this.phoneNumber.setOfficeAreaCode(officeAreaCode);
		// this.phoneNumber.setOfficeNumber(officeNumber);
	}

	public String getPhoneNumber() {
		return phoneNumber.getPhoneNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
