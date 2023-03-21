package africa.semicolon.electionSnacks.data.repository;

import africa.semicolon.electionSnacks.data.model.Vote;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VoteRepositoryImpl implements VoteRepository {
    private int countVote;
    private int countCandidateVote;
    private List<Vote> votes = new ArrayList<>();

    @Override
    public Vote save(Vote vote) {
        boolean articleHasNOtBeenSaved = vote.getId() == 0;
        if (articleHasNOtBeenSaved) {
            vote.setId(generateVoteId());
            votes.add(vote);
            countVote++;
        }
        return vote;
    }

    private int generateVoteId() {
        return countVote + 1;
    }
//public int candidateVote(){
//        if()
//}

    @Override
    public Vote findById(int id) {
        for (Vote vote : votes) if (vote.getId() == id) return vote;
        return null;
    }


    @Override
    public long countVote() {
        return countVote;
    }

    @Override
    public List<Vote> findAll() {
        return null;
    }

    @Override
    public void delete(Vote vote) {

    }

    @Override
    public void delete(int id) {
        for (Vote vote : votes) {
            if (vote.getCandidate().equalsIgnoreCase(String.valueOf(vote))) {
                votes.remove(vote);
                countVote--;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        votes.removeAll(votes);
        countVote = votes.size();
    }
}
