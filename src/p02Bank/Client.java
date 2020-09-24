package p02Bank;

public class Client implements Person{
	private String Name;
	private String	Address;
	private String	ClientType;
	
	private int Amount;
	
	public Client(String name, String address, String clientType) {
		super();
		Name=name;
		Address = address;
		ClientType = clientType;
	}
	public void RequestDeposit(int amount) {
		amount = Amount;
	}
	public int SolicitarRetiro() {
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
	public String getClientType() {
		return ClientType;
	}
	public void setClientType(String clientType) {
		ClientType = clientType;
	}
	

}
