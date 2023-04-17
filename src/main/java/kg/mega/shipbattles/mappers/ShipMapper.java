package kg.mega.shipbattles.mappers;

import kg.mega.shipbattles.models.dto.ShipDto;
import kg.mega.shipbattles.models.entities.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ShipMapper {
    ShipMapper INSTANCE = Mappers.getMapper(ShipMapper.class);
    Ship shipDtoToShip(ShipDto shipDto);
    ShipDto shipToShipDto(Ship ship);
}
