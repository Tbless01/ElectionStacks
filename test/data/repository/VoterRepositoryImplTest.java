package data.repository;

import data.model.Voter;
import dtos.Requests.RegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.VoterService;

import static org.junit.jupiter.api.Assertions.*;

class VoterRepositoryImplTest {
    private VoterRepository voterRepository;
    private VoterService voterService;
    private Voter voter;
    @BeforeEach

    void setUp() {
        voterRepository = new VoterRepositoryImpl();
        voter = new Voter();
//        RegisterRequest registerRequest = new RegisterRequest();
//        Voter saved = voterService.register(registerRequest);
        voter.setFirstName("firstname");
        voter.setLastName("lastname");
        voter.setUsername("username");
        voter.setPassword("password");
        voter.setValidVoter_sCardNumber("valid card number");
    }
    @Test
    public void saveOneVoterTest(){
        Voter voter = new Voter();
        voterRepository.save(voter);
        assertEquals(1, voterRepository.count());
    }
    @Test
    public void saveOneVoter_idOfVoterIsOneTest(){
        Voter savedVoter = voterRepository.save(voter);
        assertEquals(1, savedVoter.getId());
    }
    @Test
    public void saveTwoVotersWithSameId_CountIsOneTest(){
        Voter savedVoter = voterRepository.save(voter);
        assertEquals(1,voterRepository.count());
        savedVoter.setLastName("PriestessHood");
        voterRepository.save(savedVoter);
        assertEquals(1, voterRepository.count());
    }
    @Test
    public void saveOneVoter_findVoterByIdTest(){
        Voter savedVoter = voterRepository.save(voter);
//        RegisterRequest registerRequest = new RegisterRequest();
//        Voter saved = voterService.register(registerRequest);
        assertEquals(1, savedVoter.getId());
        Voter foundVoter = voterRepository.findById(1);
        assertEquals(foundVoter, savedVoter);
    }
    @Test
    public void saveOneVoter_findVoterByUsernameTest(){
        Voter savedVoter = voterRepository.save(voter);
        savedVoter.setUsername("tbless");
        Voter foundVoter = voterRepository.findByUsername("tbless");
        assertEquals(foundVoter, savedVoter);
    }
    @Test
    public void savedOneVoter_deleteOneVoter_countIsZeroTest(){
        Voter savedVoter = voterRepository.save(voter);
        assertEquals(1, savedVoter.getId());
        voterRepository.delete(1);
        assertEquals(0, voterRepository.count());
    }
    @Test public void savedMoreThanOneVoter_deleteAll_countThatIsZeroTest(){
        Voter voter2 = new Voter();
        Voter voter3 = new Voter();
        voterRepository.save(voter);
        voterRepository.save(voter2);
        voterRepository.save(voter3);
        assertEquals(3, voterRepository.count());
        voterRepository.deleteAll();
        assertEquals(0, voterRepository.count());
    }

}