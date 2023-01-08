package com.axonactive.premierleague.dao;

import com.axonactive.premierleague.entities.PlayerEntity;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface PlayerDao {
    PlayerEntity getPlayerById(Long id);
    List<PlayerEntity> getAllPlayers();
}