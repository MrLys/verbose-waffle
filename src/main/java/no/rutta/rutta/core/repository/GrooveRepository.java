package no.rutta.rutta.core.repository;

import no.rutta.rutta.core.model.Groove;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrooveRepository extends JpaRepository<Groove, Long> {
}
