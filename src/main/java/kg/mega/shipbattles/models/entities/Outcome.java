package kg.mega.shipbattles.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@IdClass(OutcomePK.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Outcomes")
public class Outcome {
    @Id
    @Column(length = 50, nullable = false)
    String ship;

    @Id
    @ManyToOne
    @JoinColumn(name = "name", nullable = false)
    Battle battle;
    @Column(length = 10, nullable = false)
    String result;
}
