package kg.mega.shipbattles.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Ships")
public class Ship {
    @Id
    @Column(length = 50, nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "classes", nullable = false)
    Class classes;
    int launched;
}
