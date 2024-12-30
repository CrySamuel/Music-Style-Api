package io.github.CrySamuel.musicApi.musicStyleAPI.repository;

import io.github.CrySamuel.musicApi.musicStyleAPI.model.MusicStyle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicStyleRepository extends JpaRepository<MusicStyle, String> {
    List<MusicStyle>findByName(String name);
}