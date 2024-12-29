package io.github.musicaAPI.musicaApi.repository.repository;

import io.github.musicaAPI.musicaApi.model.MusicStyle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicStyleRepository extends JpaRepository<MusicStyle, String> {
    List<MusicStyle>findByName(String name);
}
