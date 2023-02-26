package utils;

import data.model.Voter;
import data.repository.VoterRepository;
import dtos.Requests.RegisterRequest;
import dtos.Response.FindVoterResponse;

public class Mapper {
    private static VoterRepository voterRepository;

    public static Voter map(RegisterRequest registerRequest) {
        Voter voter = new Voter();
        voter.setUsername(registerRequest.getUsername());
        voter.setValidVoter_sCardNumber(registerRequest.getValidVoter_sCardNumber());
        voter.setLastName(registerRequest.getLastName());
        voter.setFirstName(registerRequest.getFirstName());
        voter.setPassword(registerRequest.getPassword());
        return voter;
    }

    //    OR
    public static void map(RegisterRequest registerRequest, Voter voter) {
        voter.setUsername(registerRequest.getUsername());
        voter.setLastName(registerRequest.getLastName());
        voter.setFirstName(registerRequest.getFirstName());
        voter.setPassword(registerRequest.getPassword());
    }

    //    public static void map(User foundUser, FindUserResponse response) {
    public static void map(int id) {
        Voter foundVoter = voterRepository.findById(id);
        FindVoterResponse response = new FindVoterResponse();
        response.setFullName(foundVoter.getFirstName() + " " + foundVoter.getLastName());
        response.setUserId(foundVoter.getId());
        response.setUsername(foundVoter.getUserName());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
//        response.setDateRegistered(formatter.format(foundVoter.getDateRegistered));
    }
}
