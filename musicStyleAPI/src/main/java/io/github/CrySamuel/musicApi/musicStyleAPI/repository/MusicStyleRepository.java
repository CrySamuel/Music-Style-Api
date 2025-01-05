package io.github.CrySamuel.musicApi.musicStyleAPI.repository;

import io.github.CrySamuel.musicApi.musicStyleAPI.entity.MusicStyleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicStyleRepository extends JpaRepository<MusicStyleEntity, String > {
    List<MusicStyleEntity>findByName(String name);
}