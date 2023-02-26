package data.repository;

import data.model.Voter;

import java.util.List;

public interface UserRepository {
    Voter save(Voter voter) ;
    Voter findById(int id);
    long count();
    List<Voter> findAll();
    void delete(Voter voter);
    void delete(int id);
    void deleteAll();

    Voter findByUsername(String username);
}
