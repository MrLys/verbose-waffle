package no.rutta.rutta.controller;

import no.rutta.rutta.core.model.Groove;
import no.rutta.rutta.core.repository.GrooveRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrooveController {

    private final GrooveRepository grooveRepository;

    public GrooveController(GrooveRepository grooveRepository) {
        this.grooveRepository = grooveRepository;
    }

    @GetMapping("/grooves")
    public List<Groove> all() {
        return grooveRepository.findAll();
    }
}
