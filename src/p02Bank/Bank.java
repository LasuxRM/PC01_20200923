package p02Bank;

public class Bank implements Person, Entity{
	private String Name;
	private String Phone;
	
	private BranchOffice[] bo = new BranchOffice[3];
	
	public Bank(String name, String phone) {
		super();
		Name = name;
		Phone = phone;
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
	
	
}
