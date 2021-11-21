package com.fundamentals;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fundamentals.repository.PlayerRepository;
import com.fundamentals.entity.PlayerEntity;

@SpringBootApplication
public class SpringbootFundamentalsApplication {

	private static Object playerRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringbootFundamentalsApplication.class, args);
		System.out.println("This spring fundamentals H2-Integration demo");

	}

	@Bean
	public CommandLineRunner demo(PlayerRepository playerRepository){
		return (args)->{
			playerRepository.save(new PlayerEntity("SachinTendulkar", "Cricket"));
			playerRepository.save(new PlayerEntity("RogerFederer", "Tennis"));
			playerRepository.save(new PlayerEntity("ChristianoRonaldo", "Soccer"));
			playerRepository.save(new PlayerEntity("ValentinoRossi", "MotoGP"));

			for(PlayerEntity entity : playerRepository.findAll()){
				System.out.println("The player is | "+ entity.toString());
			}
		};
	}

}
