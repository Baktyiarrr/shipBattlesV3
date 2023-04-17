package kg.mega.shipbattles.models.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassDto {
    String classes;
    String type;
    String country;
    int numGuns;
    double bore;
    Integer displacement;
}
