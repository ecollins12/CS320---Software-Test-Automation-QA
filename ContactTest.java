package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contactClass = new Contact("123456789", "Elliot", "Collins", "1234567890", "123 Seasame Street");
		assertTrue(contactClass.getContactID().equals("123456789"));
		assertTrue(contactClass.getFirstName().equals("Elliot"));
		assertTrue(contactClass.getLastName().equals("Collins"));
		assertTrue(contactClass.getPhone().equals("1234567890"));
		assertTrue(contactClass.getAddress().equals("123 Seasame Street"));
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891111", "Elliot", "Collins", "1234567890", "123 Seasame Street");
		});	
	}
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot11111111", "Collins", "1234567890", "123 Seasame Street");
		});	
	}
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", "Collins11111111", "1234567890", "123 Seasame Street");
		});	
	}
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", "Collins", "1234567890", "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactPhoneTenDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", "Collins", "123456789", "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Elliot", "Collins", "123456789", "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", null, "Collins", "123456789", "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", null, "123456789", "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", "Collins", null, "1234567890-=12345647897 Seasame Street");
		});	
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Elliot", "Collins", "123456789", null);
		});	
	}


}
