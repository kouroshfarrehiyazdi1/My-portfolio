public class Contact {

    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String email;

    public Contact(String contactID, String firstName, String lastName, String phone, String address, String email) {
        // Validate input
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact ID");
        }
        if (firstName == null || firstName.length() > 20) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        if (lastName == null || lastName.length() > 20) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if (address == null || address.length() > 50) {
            throw new IllegalArgumentException("Invalid Address");
        }
        if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new IllegalArgumentException("Invalid Email Address");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Validate input
        if (firstName == null || firstName.length() > 20) {
            throw new IllegalArgumentException("Invalid First Name");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // Validate input
        if (lastName == null || lastName.length() > 20) {
            throw new IllegalArgumentException("Invalid Last Name");
        }

        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        // Validate input
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }

        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // Validate input
        if (address == null || address.length() > 50) {
            throw new IllegalArgumentException("Invalid Address");
        }

        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Validate input
        if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new IllegalArgumentException("Invalid Email Address");
        }

        this.email = email;
    }

}
