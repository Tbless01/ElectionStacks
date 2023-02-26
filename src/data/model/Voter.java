package data.model;

public class Voter  {
    private int id;
    private String firstName;
    private String lastName;
    private String UserName;
    private String validVoter_sCardNumber;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserName() {
        return UserName;
    }

    public void setUsername(String userName) {
        UserName = userName;
    }

    public String getValidVoter_sCardNumber() {
        return validVoter_sCardNumber;
    }

    public void setValidVoter_sCardNumber(String validVoter_sCardNumber) {
        this.validVoter_sCardNumber = validVoter_sCardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
