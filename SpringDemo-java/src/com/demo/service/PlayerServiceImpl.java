package com.demo.service;

import com.demo.Player;
import com.demo.repository.PlayerRepository;
import com.demo.repository.PlayerRepositoryImpl;

import java.util.List;

public class PlayerServiceImpl implements PlayerService{

    private PlayerRepository playerrepository = new PlayerRepositoryImpl();

    @Override
    public List<Player> getPlayerName() {
       return playerrepository.findAll();
    }

    public void setPlayerRepository(PlayerRepository playerRepository){
        this.playerrepository = playerRepository;
    }
}
