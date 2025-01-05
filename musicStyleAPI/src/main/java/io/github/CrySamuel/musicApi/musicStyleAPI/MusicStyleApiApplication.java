package io.github.CrySamuel.musicApi.musicStyleAPI;

import io.github.CrySamuel.musicApi.musicStyleAPI.entity.MusicStyleEntity;
import io.github.CrySamuel.musicApi.musicStyleAPI.repository.MusicStyleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MusicStyleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicStyleApiApplication.class, args);
	}

}
