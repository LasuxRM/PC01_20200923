package p02Bank;

public class BranchOffice implements Person, Entity{

	private String Name;
	private String Phone;
	private String Address;
	
	ATM[] atm0 = new ATM[3];
	
	public BranchOffice(String name, String phone, String address) {
		super();
		Name = name;
		Phone = phone;
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
}
