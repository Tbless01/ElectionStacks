package dtos.Requests;

public class RegisterRequest {
    private String lastName;
    private String firstName;
    private String username;
    private String password;
    private String validVoter_sCardNumber;

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", validVoter_sCardNumber='" + validVoter_sCardNumber + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidVoter_sCardNumber() {
        return validVoter_sCardNumber;
    }

    public void setValidVoter_sCardNumber(String validVoter_sCardNumber) {
        this.validVoter_sCardNumber = validVoter_sCardNumber;
    }
}
