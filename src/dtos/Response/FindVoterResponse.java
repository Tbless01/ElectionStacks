package dtos.Response;

public class FindVoterResponse {
private int userId;
private String username;
private String fullName;
private String validVoter_sCardNumber;

    @Override
    public String toString(){
        return "FindVoterResponse{" +
                "userId=" + userId +
                ", userName='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", validVoter_sCardNumber='" + validVoter_sCardNumber + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getValidVoter_sCardNumber() {
        return validVoter_sCardNumber;
    }

    public void setValidVoter_sCardNumber(String validVoter_sCardNumber) {
        this.validVoter_sCardNumber = validVoter_sCardNumber;
    }
}
