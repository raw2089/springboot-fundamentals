package com.demo.repository;

import com.demo.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepositoryImpl implements PlayerRepository{
    @Override
    public List<Player> findAll() {
        List<Player> players = new ArrayList<>();
        Player p1 = new Player();
        p1.setPlayerName("SachinTendulkar");
        p1.setGame("Cricket");

        Player p2 = new Player();
        p2.setPlayerName("RogerFederer");
        p2.setGame("Tennis");

        players.add(p1);
        players.add(p2);

        return players;
    }
}
