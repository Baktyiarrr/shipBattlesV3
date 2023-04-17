package kg.mega.shipbattles.models.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kg.mega.shipbattles.models.entities.Class;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShipDto {
    String name;
    Class classes;
    int launched;
}
