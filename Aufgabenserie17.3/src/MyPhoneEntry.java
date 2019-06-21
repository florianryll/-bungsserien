
public class MyPhoneEntry implements PhoneEntry {
	private String name;
	private String phoneNumber;

	
	
	public MyPhoneEntry(String name) {
		super();
		this.name = name;
	}
	
	public MyPhoneEntry(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
