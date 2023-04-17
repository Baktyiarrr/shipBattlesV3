package kg.mega.shipbattles.mappers;

import kg.mega.shipbattles.models.dto.OutcomeDto;
import kg.mega.shipbattles.models.entities.Outcome;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OutcomeMapper {
    OutcomeMapper INSTANCE = Mappers.getMapper(OutcomeMapper.class);
    Outcome outcomeDtoToOutcome(OutcomeDto outcomeDto);
    OutcomeDto outcomeToOutcomeDto(Outcome outcome);
}
