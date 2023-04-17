package kg.mega.shipbattles.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Classes")
public class Class {
    @Id
    @Column(length = 50, nullable = false)
    String classes;
    @Column(length = 2, nullable = false)
    String type;
    @Column(length = 20, nullable = false)
    String country;
    int numGuns;
    double bore;
    Integer displacement;
}
