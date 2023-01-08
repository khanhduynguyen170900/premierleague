package com.axonactive.premierleague.service.mapper;

import com.axonactive.premierleague.entities.PlayerEntity;
import com.axonactive.premierleague.service.dto.PlayerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface PlayerMapper {
    @Mapping(source = "footednessEnum", target = "footedness")
    PlayerDto toDto(PlayerEntity player);

    List<PlayerDto> toDtos(List<PlayerEntity> players);
}
