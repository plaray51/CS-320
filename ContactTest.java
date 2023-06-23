import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactIdLength() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertTrue(contact.getContactId().length() <= 10);
    }

    @Test
    public void testContactIdNotNull() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertNotNull(contact.getContactId());
    }

    @Test
    public void testFirstNameLength() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertTrue(contact.getFirstName().length() <= 10);
    }

    @Test
    public void testFirstNameNotNull() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertNotNull(contact.getFirstName());
    }

    @Test
    public void testLastNameLength() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertTrue(contact.getLastName().length() <= 10);
    }

    @Test
    public void testLastNameNotNull() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertNotNull(contact.getLastName());
    }

    @Test
    public void testPhoneNumberLength() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertEquals(10, contact.getPhoneNumber().length());
    }

    @Test
    public void testPhoneNumberNotNull() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertNotNull(contact.getPhoneNumber());
    }

    @Test
    public void testAddressLength() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertTrue(contact.getAddress().length() <= 30);
    }

    @Test
    public void testAddressNotNull() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertNotNull(contact.getAddress());
    }
}
