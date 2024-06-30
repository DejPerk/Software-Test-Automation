package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import contact.Contact;

public class ContactService {

	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	public boolean addContact(Contact contact) {
		boolean ContactAlready = false;
		for (Contact contactList : contacts) {
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		if (!contactAlready) {
			contacts.add(contact);
			return true;
		} else {
			return false;
		}
	}
	public boolean deleteContact(String string) {
		for (Contact contactList : contacts) {
			if (contactList.getContactID().equals(string)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	public boolean updateContact(String contactID, String firstName, String lastName, String Number, String Address) {
		for (Contact contactList : contacts) {
			if (contactList.getContactID().equals(contactID)) {
				if(!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirstName(firstName);
				}
				if(!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setLastName(lastName);
				}
				if(!number.equals("") && (number.length() == 10 )) {
					contactList.setNumber(number);		
				}
				if(!address.equals("") && !(address.length() > 30)) {
					contactList.setAddress(address);			
				}
				return true;
			}
		}
		return false;
	}
}
