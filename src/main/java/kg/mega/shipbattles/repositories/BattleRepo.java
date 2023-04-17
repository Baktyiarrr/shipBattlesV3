package kg.mega.shipbattles.repositories;

import kg.mega.shipbattles.models.entities.Battle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleRepo extends JpaRepository<Battle, String> {
}
