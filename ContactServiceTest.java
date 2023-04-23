import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest {
    private ContactDao contactDao;
    private ContactService contactService;

    @Before
    public void setUp() {
        contactDao = new ContactDaoImpl();
        contactService = new ContactServiceImpl(contactDao);
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("C001", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("C002", "Jane", "Smith", "9876543210", "456 Elm St");
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact("C002"));
        assertNull(contactService.getContact("C002"));
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("C003", "Bob", "Johnson", "5555555555", "789 Oak Ave");
        contactService.addContact(contact);

        Contact updatedContact = new Contact("C003", "Bob", "Smith", "5555555555", "789 Oak Ave");
        assertTrue(contactService.updateContact("C003", updatedContact));

        Contact retrievedContact = contactService.getContact("C003");
        assertEquals("Smith", retrievedContact.getLastName());
    }

    @Test
    public void testGetContact() {
        Contact contact = new Contact("C004", "Mary", "Johnson", "1111111111", "321 Pine St");
        contactService.addContact(contact);
        assertNotNull(contactService.getContact("C004"));
    }
}
