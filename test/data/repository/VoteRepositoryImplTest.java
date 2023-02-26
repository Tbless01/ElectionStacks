package data.repository;

import data.model.Vote;
import data.model.Voter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoteRepositoryImplTest {
    private VoteRepository voteRepository;
    private Vote vote;
    @BeforeEach
    void setUp() {
        voteRepository = new VoteRepositoryImpl();
        vote = new Vote();
    }
    @Test
    public void savedOneVoter_sVoteTest(){
        Vote vote1 = new Vote();
        voteRepository.save(vote);
        voteRepository.save(vote1);
        assertEquals(2, voteRepository.countVote());
    }
    @Test
    public void votesTwiceWithOneId_IdIsOneTest(){
        Vote newVote = voteRepository.save(vote);
        assertEquals(1, newVote.getId());
        Vote foundVote = voteRepository.findById(1);
        assertEquals(foundVote, newVote);
    }
    @Test
    public void deleteAllVotes_countIsZero(){
        voteRepository.save(vote);
        Vote newVote = new Vote();
        voteRepository.save(newVote);
        assertEquals(2,voteRepository.countVote());
        voteRepository.deleteAll();
        assertEquals(0, voteRepository.countVote());
    }

}