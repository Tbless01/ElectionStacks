package africa.semicolon.electionSnacks.services;

import africa.semicolon.electionSnacks.data.model.Voter;
import africa.semicolon.electionSnacks.dtos.Requests.RegisterRequest;
import africa.semicolon.electionSnacks.dtos.Response.FindVoterResponse;

public interface VoterService {
    Voter register(RegisterRequest registerRequest);
    FindVoterResponse findUser(int id);
}
