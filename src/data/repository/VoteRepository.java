package data.repository;

import data.model.Vote;

import java.util.List;

public interface VoteRepository {
    Vote save(Vote vote) ;
    Vote findById(int id);
    long countVote();
    List<Vote> findAll();
    void delete(int id);
    void deleteAll();
}

