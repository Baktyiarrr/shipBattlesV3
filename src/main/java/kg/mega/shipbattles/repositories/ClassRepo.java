package kg.mega.shipbattles.repositories;

import kg.mega.shipbattles.models.entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepo extends JpaRepository<Class, String> {
    @Query(value = "SELECT cl.classes FROM Classes cl " +
            " LEFT JOIN Ships s ON s.classes = cl.classes " +
            "WHERE cl.classes IN (SELECT ship FROM Outcomes WHERE result = 'sunk') " +
            " OR s.name IN (SELECT ship FROM Outcomes WHERE result = 'sunk') " +
            "GROUP BY cl.classes", nativeQuery = true)
    List<String> findClassNamesByBattleResult();
}
