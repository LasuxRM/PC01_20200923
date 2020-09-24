package p02Bank;

public class ATM implements Person{

	private String Name;
	private String Address;
	private String atmType;
	
	private int Amount;
	
	public ATM(String name, String address, String atmType) {
		super();
		Name = name;
		Address = address;
		this.atmType = atmType;
	}
	
	public void doDeposit(int amount) {
		Amount = amount;
	}
	public int doWithdraw() {
		return Amount;
	}

	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	public String getAtmType() {
		return atmType;
	}
	public void setAtmType(String atmType) {
		this.atmType = atmType;
	}
}
