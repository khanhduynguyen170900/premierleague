package com.axonactive.premierleague.service;

import com.axonactive.premierleague.dao.PlayerDao;
import com.axonactive.premierleague.entities.PlayerEntity;
import com.axonactive.premierleague.service.dto.PlayerDto;
import com.axonactive.premierleague.service.mapper.PlayerMapper;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class PlayerService {

    @Inject
    private PlayerDao playerDao;

    @Inject
    private PlayerMapper playerMapper;

    public PlayerDto getPlayerById(Long id) {
        return playerMapper.toDto(playerDao.getPlayerById(id));
    }

    public List<PlayerDto> getAllPlayers() {
        return playerMapper.toDtos(playerDao.getAllPlayers());
    }

}
