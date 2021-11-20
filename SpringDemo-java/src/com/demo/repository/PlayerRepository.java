package com.demo.repository;

import com.demo.Player;

import java.util.List;

public interface PlayerRepository {
    public List<Player> findAll();
}
