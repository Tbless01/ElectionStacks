package data.repository;

import data.model.Voter;

import java.util.ArrayList;
import java.util.List;

public class VoterRepositoryImpl implements VoterRepository{
    private int count;
    private final List<Voter> voters = new ArrayList<>();

    @Override
    public Voter save(Voter voter) {
        boolean voterHasNotBeenSaved = voter.getId() == 0;
        if(voterHasNotBeenSaved){
            voter.setId(generateUserId());
            voters.add(voter);
            count++;
        }
        return voter;
    }
    private int generateUserId() {
        return count + 1;
    }

    @Override
    public Voter findById(int id) {
        for (Voter voter : voters) if (voter.getId() == id) return voter;
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Voter> findAll() {
        return null;
    }

    @Override
    public void delete(Voter voter) {

    }

    @Override
    public void delete(int id) {
        for (Voter voter: voters){
            if(voter.getId() == id){
                voters.remove(voter);
                count--;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        voters.removeAll(voters);
        count = voters.size();
    }

    @Override
    public Voter findByUsername(String username) {
        for(Voter voter: voters){
            if(voter.getUserName().equalsIgnoreCase(username)) return voter;
        }
        return null;
    }
}
