package africa.semicolon.electionSnacks.controllers;

import africa.semicolon.electionSnacks.dtos.Requests.RegisterRequest;
import africa.semicolon.electionSnacks.services.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoterController {
    @Autowired
    private VoterService voterService;
    @GetMapping("/confirm")
    public Object something() {
        return "It works";
    }
    @PostMapping("/voter/register")
    public Object register(RegisterRequest request) {

        try {
            return voterService.register(request);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
    @GetMapping("/voter/{id}")
    public Object findUserById(int id) {
        return voterService.findUser(id);
    }

}
