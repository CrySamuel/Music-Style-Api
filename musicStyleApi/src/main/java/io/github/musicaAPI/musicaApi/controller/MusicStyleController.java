package io.github.musicaAPI.musicaApi.controller;

import io.github.musicaAPI.musicaApi.model.MusicStyle;
import io.github.musicaAPI.musicaApi.repository.repository.MusicStyleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("music")
public class MusicStyleController {

    private MusicStyleRepository musicStyleRepository;

    public MusicStyleController(MusicStyleRepository musicStyleRepository) {
        this.musicStyleRepository = musicStyleRepository;
    }

    @PostMapping
    public MusicStyle save(@RequestBody MusicStyle musicStyle){
        System.out.println("The music style has been saved: " + musicStyle + "\n");

        var id = UUID.randomUUID().toString();
        musicStyle.setId(id);

        musicStyleRepository.save(musicStyle);
        return musicStyle;
    }

    @GetMapping("{id}")
    public MusicStyle getById(@PathVariable("id") String id) {
        System.out.println("The ID obtained was: " + id);
        return musicStyleRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        System.out.println("\nThe Id was deleted: " + id);
        musicStyleRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id, @RequestBody MusicStyle musicStyle){
        System.out.println("\nUpdated id was: " + id + "New Informations " + "\n" + musicStyle);
        musicStyle.setId(id);
        musicStyleRepository.save(musicStyle);
    }

    @GetMapping
    public List<MusicStyle>search(@RequestParam("name") String name){
        System.out.println("\nSearch Name: " + name);
        return musicStyleRepository.findByName(name);
    }

}
