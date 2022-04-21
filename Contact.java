package contact;
public class Contact {
	//Contact properties
	//Parameters for character limitations will be enforced in the update data method so that fields cannot be populated without adhering to parameters.
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
public Contact(String contactID, String firstName, String lastName, String phone, String address){
	//Contact constructors
	if(contactID == null || contactID.length()>10) {
		throw new IllegalArgumentException("Invalid ID");
	}
	if(firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid First Name");
	}
	if(lastName == null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid Last Name");
	}
	if(phone == null || phone.length()!=10) {
		throw new IllegalArgumentException("Invalid Phone Number");
	}
	if(address== null || address.length()>30) {
		throw new IllegalArgumentException("Invalid Address");
	}
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.address = address;
	
}

//Getters and Setters for each field to make changes and call data
public String getContactID() {
	return contactID;
}

public void setContactID(String contactID) {
	this.contactID = contactID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
