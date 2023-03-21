package africa.semicolon.electionSnacks.data.model;

import lombok.Data;

@Data
public class Voter  {
    private int id;
    private String firstName;
    private String lastName;
    private String UserName;
    private String validVoter_sCardNumber;
    private String password;

}
