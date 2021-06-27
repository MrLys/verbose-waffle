package no.rutta.rutta;

import no.rutta.rutta.core.model.Habit;
import no.rutta.rutta.core.model.User;
import no.rutta.rutta.core.repository.HabitRepository;
import no.rutta.rutta.core.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.Instant;

@SpringBootTest
public class HabitTest {
    @Autowired
    HabitRepository habitRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void testHabitCreatoion() {
        User u = new User();
        u.setEmail("test3");
        u.setUsername("testing2");
        u.setPassword("123");
        u.setCreate_date(Timestamp.from(Instant.now()));
        u.setLast_login(Timestamp.from(Instant.now()));
        userRepository.save(u);

        Habit h = new Habit();
        h.setName("Test--22");
        h.setUserId(u.getId());
        h.setActivityId(0);
        habitRepository.save(h);
    }
}
