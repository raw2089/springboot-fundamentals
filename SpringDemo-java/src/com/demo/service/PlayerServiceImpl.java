package com.demo.service;

import com.demo.Player;
import com.demo.repository.PlayerRepository;

import java.util.List;

public class PlayerServiceImpl implements PlayerService{

    private PlayerRepository playerRepository ;

    @Override
    public List<Player> getPlayerName() {

        return playerRepository.findAll();
    }

    public void setPlayerRepository(PlayerRepository playerRepository){

        this.playerRepository = playerRepository;
    }
}
