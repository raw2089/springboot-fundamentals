package com.demo.service;

import com.demo.Player;
import com.demo.repository.PlayerRepository;

import java.util.List;

public class PlayerServiceImpl implements PlayerService{

    private PlayerRepository playerRepository;

    PlayerServiceImpl(){
    }

    PlayerServiceImpl(PlayerRepository playerRepository){

        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getPlayerName() {

        return playerRepository.findAll();
    }

    public void setRepository(PlayerRepository playerRepository){

        this.playerRepository = playerRepository;
    }
}
