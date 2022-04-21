package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	//Test for the addContact method in Contact Service class
	@Test
	void testAddContact(){
		ContactService contactService = new ContactService();
		Contact contactClass = new Contact("123456789", "Elliot", "Collins", "1234567890", "123 Seasame Street");
		//assertEquals test to confirm that the new contact has been added to the list
		assertEquals(true, contactService.addContact(contactClass));
		}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contactClass = new Contact("123456789", "Elliot", "Collins", "1234567890", "123 Seasame Street");
		contactService.addContact(contactClass);//add contact to contact list to delete it later
		assertEquals(true, contactService.deleteContact("123456789"));//delete contact by contact ID
	}
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contactClass = new Contact("123456789", "Elliot", "Collins", "1234567890", "123 Seasame Street");
		contactService.addContact(contactClass);//add contact to contact list to delete it later
		//tests updating each of the fields that should be update-able
		assertEquals(true, contactService.updateContact("123456789", "Elmo", "Collins", "1234567890", "123 Seasame Street"));
		assertEquals(true, contactService.updateContact("123456789", "Elliot", "Bigbird", "1234567890", "123 Seasame Street"));
		assertEquals(true, contactService.updateContact("123456789", "Elliot", "Collins", "1234567800", "123 Seasame Street"));
		assertEquals(true, contactService.updateContact("123456789", "Elliot", "Collins", "1234567890", "124 Seasame Street"));
	}
	}


