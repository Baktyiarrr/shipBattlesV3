package kg.mega.shipbattles.repositories;

import kg.mega.shipbattles.models.entities.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepo extends JpaRepository<Ship, String> {

}
