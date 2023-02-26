package services;

import data.model.Voter;
import data.repository.VoterRepository;
import data.repository.VoterRepositoryImpl;
import dtos.Requests.RegisterRequest;
import dtos.Response.FindVoterResponse;
import utils.Mapper;

public class VoterServiceImpl implements VoterService{
private VoterRepository voterRepository = new VoterRepositoryImpl();
    private FindVoterResponse response = new FindVoterResponse();
    @Override
    public Voter register(RegisterRequest registerRequest) {
        if (userExist(registerRequest.getUsername())) throw new IllegalArgumentException(registerRequest.getUsername() + "already exists");
        return voterRepository.save(Mapper.map(registerRequest));
    }
    private boolean userExist(String username) {
        Voter foundVoter = voterRepository.findByUsername(username);
        if (foundVoter != null) return true;
        return false;
    }
    @Override
    public FindVoterResponse findUser(int id) {
        Mapper.map(id);
        return response;
    }
}
