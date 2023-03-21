package africa.semicolon.electionSnacks.data.repository;

import africa.semicolon.electionSnacks.data.model.Voter;

import java.util.List;

public interface VoterRepository {
    Voter save(Voter voter) ;
    Voter findById(int id);
    long count();
    List<Voter> findAll();
    void delete(Voter voter);
    void delete(int id);
    void deleteAll();
    Voter findByUsername(String username);
}
