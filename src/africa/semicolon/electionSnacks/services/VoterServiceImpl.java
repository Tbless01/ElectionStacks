package africa.semicolon.electionSnacks.services;

import africa.semicolon.electionSnacks.data.model.Voter;
import africa.semicolon.electionSnacks.data.repository.VoterRepository;
import africa.semicolon.electionSnacks.dtos.Requests.RegisterRequest;
import africa.semicolon.electionSnacks.dtos.Response.FindVoterResponse;
import africa.semicolon.electionSnacks.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {
    @Autowired
    private VoterRepository voterRepository;

    @Override
    public Voter register(RegisterRequest registerRequest) {
        if (userExist(registerRequest.getUsername()))
            throw new IllegalArgumentException(registerRequest.getUsername() + "already exists");
        return voterRepository.save(Mapper.map(registerRequest));
    }

    private boolean userExist(String username) {
        Voter foundVoter = voterRepository.findByUsername(username);
        if (foundVoter != null) return true;
        return false;
    }

    @Override
    public FindVoterResponse findUser(int id) {
        Voter foundVoter = voterRepository.findById(id);
        if (foundVoter == null) throw new NullPointerException("Voter does not exist");
        FindVoterResponse response = new FindVoterResponse();
        Mapper.map(id);
        return response;
    }
}
