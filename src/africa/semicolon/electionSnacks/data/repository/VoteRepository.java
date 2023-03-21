package africa.semicolon.electionSnacks.data.repository;

import africa.semicolon.electionSnacks.data.model.Vote;

import java.util.List;

public interface VoteRepository {
    Vote save(Vote vote) ;
    Vote findById(int id);
    long countVote();
    List<Vote> findAll();

    void delete(Vote vote);

    void delete(int id);
    void deleteAll();
}

