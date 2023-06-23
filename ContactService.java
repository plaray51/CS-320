import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        String contactId = contact.getContactId();
        if (contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact with ID " + contactId + " already exists.");
        }
        contacts.put(contactId, contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            contact.setFirstName(firstName);
        }
    }

    public void updateLastName(String contactId, String lastName) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            contact.setLastName(lastName);
        }
    }

    public void updatePhone(String contactId, String phone) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            contact.setPhone(phone);
        }
    }

    public void updateAddress(String contactId, String address) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            contact.setAddress(address);
        }
    }

    public Contact getContactById(String contactId) {
        return contacts.get(contactId);
    }
}
