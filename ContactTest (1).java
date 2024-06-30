package contacttest;

import org.junit.jupiter.api.Test;

import contact.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

	@Test
	@DisplayName ("Contact ID string that cannot be longer than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "Number", "Address");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}
	@Test
	@DisplayName ("Contact First Name cannot be longer than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstNameTooLong", "LastName", "Number", "Address");
		if (contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.");
		}
	}
	@Test
	@DisplayName ("Contact Last Name cannot be longer than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastNameTooLong", "Number", "Address");
		if (contact.getLastName().length() > 10) {
			fail("Last Name has more than 10 characters.");
		}
	}
	@Test
	@DisplayName ("Contact number cannot be longer than 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "11111111111", "Address");
		if (contact.getNumber().length() != 10) {
			fail("Number has more than 10 characters.");
		}
	}
	@Test
	@DisplayName ("Contact address cannot be longer than 30 characters")
	void testAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "Number", "12345678910 has too many characters");
		if (contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}
	@Test
	@DisplayName ("Contact First Name cannot be null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact("null", "LastName", "Number", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}
	@Test
	@DisplayName ("Contact Last Name cannot be null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", "null", "Number", "Address");
		assertNotNull(contact.getLastName(), "Last name was null.");
	}
	@Test
	@DisplayName ("Contact Number cannot be null")
	void testContactNumberNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "null", "Address");
		assertNotNull(contact.getNumber(), "Number was null.");
	}
	@Test
	@DisplayName ("Contact Address cannot be null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "Number", "null");
		assertNotNull(contact.getAddress(), "Address was null.");
	}




	
	
}
