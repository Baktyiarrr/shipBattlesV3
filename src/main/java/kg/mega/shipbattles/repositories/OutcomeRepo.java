package kg.mega.shipbattles.repositories;

import kg.mega.shipbattles.models.entities.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeRepo extends JpaRepository<Outcome, String> {
}
