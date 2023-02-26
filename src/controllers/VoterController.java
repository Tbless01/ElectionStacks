package controllers;

import dtos.Requests.RegisterRequest;
import services.VoterService;
import services.VoterServiceImpl;

public class VoterController {
    private VoterService voterService = new VoterServiceImpl();

    public Object register(RegisterRequest request) {

        try {
            return voterService.register(request);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public Object findUserById(int id) {
        return voterService.findUser(id);
    }

}
