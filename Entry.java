
public class Entry {
	private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    
    public Entry(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    } 
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "************\nFirst Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email: " + email + '\n' +
                "************\n";
    }
}

	

