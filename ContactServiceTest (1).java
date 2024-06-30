package contactservicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import contactservice.ContactService;

public class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1475869", "Jane", "Doe", "2168974635", "123 Street");
		assertEquals(true,cs.addContact(test1));
	}
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("1475869", "Jane", "Doe", "2168974635", "123 Street");
		Contact test2 = new Contact("1765345", "John", "Doe", "6317896543", "123 Street");
		Contact test3 = new Contact("1987089", "Person", "Doe", "5105927497", "123 Street");
	
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("1765345"));
		assertEquals(false, cs.deleteContact("1765346"));
		assertEquals(false, cs.deleteContact("1765345"));		
	}
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact test1= new Contact("1475869", "Jane", "Doe", "2168974635", "123 Street");
		Contact test2 = new Contact("1765345", "John", "Doe", "6317896543", "123 Street");
		Contact test3 = new Contact("1987089", "Person", "Doe", "5105927497", "123 Street");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateContact("1987089", "PersonFirst", "DoeLast", "5105927497", "123 Street"));
		assertEquals(false, cs.updateContact("1987088", "PersonFirst", "DoeLast", "5105927497", "123 Street"));
	}

}
