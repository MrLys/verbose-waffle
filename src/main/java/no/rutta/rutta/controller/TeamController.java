package no.rutta.rutta.controller;


import no.rutta.rutta.core.model.Team;
import no.rutta.rutta.core.repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/teams")
    public List<Team> all() {
       return teamRepository.findAll();
    }
}
