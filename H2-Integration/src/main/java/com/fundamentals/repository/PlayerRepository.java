package com.fundamentals.repository;

import com.fundamentals.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
}
