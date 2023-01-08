package com.axonactive.premierleague.dao.impl;

import com.axonactive.premierleague.dao.PlayerDao;
import com.axonactive.premierleague.entities.PlayerEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PlayerDaoImpl implements PlayerDao {

    @PersistenceContext(unitName = "premierleague")
    EntityManager em;

    @Override
    public PlayerEntity getPlayerById(Long id) {
        return em.createQuery("SELECT p FROM PlayerEntity p WHERE p.id=:id", PlayerEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return em.createQuery("SELECT p FROM PlayerEntity p", PlayerEntity.class)
                .getResultList();
    }
}
