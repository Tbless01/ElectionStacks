package services;

import data.model.Voter;
import dtos.Requests.RegisterRequest;
import dtos.Response.FindVoterResponse;

public interface VoterService {
    Voter register(RegisterRequest registerRequest);

    FindVoterResponse findUser(int id);
}
