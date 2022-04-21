package contact;
import java.util.ArrayList;//allows for array lists to be used
public class ContactService {
	//array list to hold contacts, calling Contact class
	public ArrayList<Contact> contacts;
	//default constructor
	public ContactService() {
		contacts = new ArrayList<Contact>();	
	
	}
//Method for adding a contact to contacts list
	public boolean addContact(Contact contact){//access Contact class
		//Code to ensure new contact doesn't already exist
		//set false
		boolean isPresent = false;
		for (Contact contactList:contacts) {
			if (contactList.equals(contact)) {
				isPresent = true;
	}
	}
		//Add contact
		if (!isPresent) {		
			contacts.add(contact);			
			return true;
		}		
		else {
			return false;
		}
		}
	//Method to delete contact
	public boolean deleteContact(String contactID) {
		for (Contact contactList:contacts) {
			if (contactList.getContactID().equals(contactID)) {
				contacts.remove(contactList);		
				return true;
}
}
		return false;

}
	//Method to update contact fields per contact ID
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for(Contact contactList:contacts) {
			//search with contact ID
			if(contactList.getContactID().equals(contactID)) {
				//parameters for the fields including ensuring no null entry
				//First and last name must not be over 10 characters
				if(!firstName.equals("") && !(firstName.length()>10)) {
					//update field
					contactList.setFirstName(firstName);
					}
				
					if(!lastName.equals("") && !(lastName.length()>10)) {
					contactList.setFirstName(lastName);
					}
					
					//phone number must be 10 characters
					if(!phoneNumber.equals("") && (phoneNumber.length()==10)) {
					contactList.setFirstName(phoneNumber);
					}
					
					//Address must not be over 30 characters
					if(!address.equals("") && !(address.length()>30)) {
					contactList.setFirstName(address);
					}
					return true;
					}
		}
					return false;
			}
		
	
}

