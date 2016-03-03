package projectThree;

public class PersonalData {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalData(String inputName, String inputAddress, int inputAge, String inputPhoneNumber){
		name = inputName;
		address = inputAddress;
		age = inputAge;
		phoneNumber = inputPhoneNumber;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
