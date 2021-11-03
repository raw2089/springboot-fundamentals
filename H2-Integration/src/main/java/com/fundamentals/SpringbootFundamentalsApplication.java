package com.fundamentals;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fundamentals.repository.PlayerRepository;
import com.fundamentals.entity.PlayerEntity;

@SpringBootApplication
public class SpringbootFundamentalsApplication {

	private static Object PlayerRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringbootFundamentalsApplication.class, args);
		System.out.println("This spring fundamentals H2-Integration demo");

	}

	@Bean
	public CommandLineRunner demo(PlayerRepository playerReposiroty){
		return (args)->{
			playerReposiroty.save(new PlayerEntity("SachinTendulkar", "Cricket"));
			playerReposiroty.save(new PlayerEntity("RogerFederer", "Tennis"));
			playerReposiroty.save(new PlayerEntity("ChristianoRonaldo", "Soccer"));
			playerReposiroty.save(new PlayerEntity("ValentinoRossi", "MotoGP"));

			for(PlayerEntity entity : playerReposiroty.findAll()){
				System.out.println("The player is | "+ entity.toString());
			}
		};
	}

}
