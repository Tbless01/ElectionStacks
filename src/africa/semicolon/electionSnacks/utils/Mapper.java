package africa.semicolon.electionSnacks.utils;

import africa.semicolon.electionSnacks.data.model.Voter;
import africa.semicolon.electionSnacks.data.repository.VoterRepository;
import africa.semicolon.electionSnacks.dtos.Requests.RegisterRequest;
import africa.semicolon.electionSnacks.dtos.Response.FindVoterResponse;


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
        voter.setValidVoter_sCardNumber(registerRequest.getValidVoter_sCardNumber());
        voter.setLastName(registerRequest.getLastName());
        voter.setFirstName(registerRequest.getFirstName());
        voter.setPassword(registerRequest.getPassword());
    }

    public static void map(Voter foundUser, FindVoterResponse response){
        response.setFullName(foundUser.getFirstName()+ " " + foundUser.getLastName());
        response.setUserId(foundUser.getId());
        response.setUsername(foundUser.getUserName());

    }

//    public static void map(CreateArticleRequest createArticleRequest, Article article) {
//        article.setBody(createArticleRequest.getBody());
//        article.setTitle(createArticleRequest.getTitle());
//        article.setAuthorId(createArticleRequest.getAuthorId());
//    }
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
