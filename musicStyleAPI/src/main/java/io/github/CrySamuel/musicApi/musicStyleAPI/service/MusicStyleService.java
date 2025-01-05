package io.github.CrySamuel.musicApi.musicStyleAPI.service;

import io.github.CrySamuel.musicApi.musicStyleAPI.entity.MusicStyleEntity;

import io.github.CrySamuel.musicApi.musicStyleAPI.repository.MusicStyleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicStyleService {

    MusicStyleRepository musicStyleRepository;

    public MusicStyleService(MusicStyleRepository musicStyleRepository) {
        this.musicStyleRepository = musicStyleRepository;
    }

    public MusicStyleEntity save(MusicStyleEntity musicStyle){
        return musicStyleRepository.save(musicStyle);
    }

    public MusicStyleEntity getById(String id){
        return musicStyleRepository.findById(id).orElse(null);
    }

    public void deleted(String id){
        musicStyleRepository.deleteById(id);
    }

    public void update(String  id, MusicStyleEntity musicStyle){
        musicStyle.setId(id);
        musicStyleRepository.save(musicStyle);
    }

    public List<MusicStyleEntity> search(String name){
        return musicStyleRepository.findByName(name);
    }

}
