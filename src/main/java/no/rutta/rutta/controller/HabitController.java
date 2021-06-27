package no.rutta.rutta.controller;

import no.rutta.rutta.core.model.Habit;
import no.rutta.rutta.core.repository.HabitRepository;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitController {
    private final HabitRepository habitRepository;

    public HabitController(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    @GetMapping("/habits")
    @Secured("ROLE_USER")
    public List<Habit> all() {
        return habitRepository.findAll();
    }

    @PostMapping("/habit")
    public void create(@RequestBody Habit habit) {
        habitRepository.save(habit);
    }
}
