package com.demo.service;

import com.demo.Player;
import com.demo.repository.PlayerRepository;

import java.util.List;

public class PlayerServiceImpl implements PlayerService{

    private PlayerRepository playerrepository ;

    @Override
    public List<Player> getPlayerName() {

        return playerrepository.findAll();
    }

    public void setPlayerRepository(PlayerRepository playerRepository){

        this.playerrepository = playerRepository;
    }
}
