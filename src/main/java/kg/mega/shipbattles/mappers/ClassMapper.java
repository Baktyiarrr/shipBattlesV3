package kg.mega.shipbattles.mappers;

import kg.mega.shipbattles.models.dto.ClassDto;
import kg.mega.shipbattles.models.entities.Class;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);
    Class classDtoToClass(ClassDto classDto);
    ClassDto classToClassDto(Class classes);
}
