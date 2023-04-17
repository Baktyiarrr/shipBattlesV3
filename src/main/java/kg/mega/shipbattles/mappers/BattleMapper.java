package kg.mega.shipbattles.mappers;

import kg.mega.shipbattles.models.dto.BattleDto;
import kg.mega.shipbattles.models.entities.Battle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface BattleMapper {
    BattleMapper INSTANCE = Mappers.getMapper(BattleMapper.class);
    Battle battleDtoToBattle(BattleDto battleDto);
    BattleDto battleToBattleDto(Battle battle);
}
