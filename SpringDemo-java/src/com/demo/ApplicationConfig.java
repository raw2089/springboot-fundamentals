package com.demo;

import com.demo.repository.PlayerRepository;
import com.demo.repository.PlayerRepositoryImpl;
import com.demo.service.PlayerService;
import com.demo.service.PlayerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.demo"})
public class ApplicationConfig {

    @Bean(name = "playerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public PlayerService getPlayerService(){
        PlayerServiceImpl playerService = new PlayerServiceImpl();
        playerService.setPlayerRepository(getPlayerRespository());
        return playerService;
    }

    @Bean(name = "playerRepository")
    public PlayerRepository getPlayerRespository(){
        return new PlayerRepositoryImpl();
    }
}
