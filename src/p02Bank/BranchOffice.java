package p02Bank;

import java.util.Scanner;

public class BranchOffice implements Person, Entity{

	Scanner sc = new Scanner (System.in);
	
	private String Name;
	private String Phone;
	private String Address;
	
	ATM[] atm0 = new ATM[3];
	
	public BranchOffice(String name, String phone, String address) {
		super();
		Name = name;
		Phone = phone;
		Address = address;
		
		for (int i = 0; i < atm0.length; i++) {
			
			atm0[i].setName(Name.concat(String.valueOf(i)));
			atm0[i].setAddress(Name.concat(String.valueOf(i)));
			atm0[i].setAtmType(Name.concat(String.valueOf(i)));
		}
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
