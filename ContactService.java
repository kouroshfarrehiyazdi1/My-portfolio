import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        contacts.add(contact);
    }

    public Contact getContact(String contactID) {
        if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be null");
        }

        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                return contact;
            }
        }

        return null;
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

    public void updateContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        Contact existingContact = getContact(contact.getContactID());
        if (existingContact == null) {
            throw new IllegalArgumentException("Contact does not exist");
        }

        existingContact.setFirstName(contact.getFirstName());
        existingContact.setLastName(contact.getLastName());
        existingContact.setPhone(contact.getPhone());
        existingContact.setAddress(contact.getAddress());
    }

    public void deleteContact(String contactID) {
        if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be null");
        }

        Contact contact = getContact(contactID);
        if (contact != null) {
            contacts.remove(contact);
        }
    }
}
