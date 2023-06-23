import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        Contact retrievedContact = contactService.getContactById("1");
        Assertions.assertEquals(contact, retrievedContact);
    }

    @Test
    public void testAddContactWithExistingId() {
        Contact contact1 = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact1);

        Contact contact2 = new Contact("1", "Jane", "Smith", "9876543210", "456 Oak St");
        Assertions.assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact2));
    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateFirstName("1", "Jane");
        Contact updatedContact = contactService.getContactById("1");
        Assertions.assertEquals("Jane", updatedContact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateLastName("1", "Smith");
        Contact updatedContact = contactService.getContactById("1");
        Assertions.assertEquals("Smith", updatedContact.getLastName());
    }

    @Test
    public void testUpdatePhone() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updatePhone("1", "9876543210");
        Contact updatedContact = contactService.getContactById("1");
        Assertions.assertEquals("9876543210", updatedContact.getPhone());
    }

    @Test
    public void testUpdateAddress() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateAddress("1", "456 Oak St");
        Contact updatedContact = contactService.getContactById("1");
        Assertions.assertEquals("456 Oak St", updatedContact.getAddress());
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.deleteContact("1");
        Contact deletedContact = contactService.getContactById("1");
        Assertions.assertNull(deletedContact);
    }
}