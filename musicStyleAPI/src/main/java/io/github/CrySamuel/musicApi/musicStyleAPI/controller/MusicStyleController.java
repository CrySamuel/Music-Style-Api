
package io.github.CrySamuel.musicApi.musicStyleAPI.controller;

import io.github.CrySamuel.musicApi.musicStyleAPI.entity.MusicStyleEntity;
import io.github.CrySamuel.musicApi.musicStyleAPI.repository.MusicStyleRepository;
import io.github.CrySamuel.musicApi.musicStyleAPI.service.MusicStyleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("music")
public class MusicStyleController {

    private MusicStyleService musicStyleService;

    public MusicStyleController(MusicStyleService musicStyleService) {
        this.musicStyleService = musicStyleService;
    }

    @PostMapping
    public MusicStyleEntity save(@RequestBody MusicStyleEntity musicStyle){
        System.out.println("The music style has been saved: " + musicStyle + "\n");

        return this.musicStyleService.save(musicStyle);
    }

    @GetMapping("{id}")
    public MusicStyleEntity getById(@PathVariable("id") String id) {
        System.out.println("The ID obtained was: " + id);
        return this.musicStyleService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        System.out.println("\nThe Id was deleted: " + id);
        this.musicStyleService.deleted(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id, @RequestBody MusicStyleEntity musicStyle){
        System.out.println("\nUpdated id was: " + id + "New Informations " + "\n" + musicStyle);
        this.musicStyleService.update(id,musicStyle);
    }

    @GetMapping
    public List<MusicStyleEntity>search(@RequestParam("name") String name){
        System.out.println("\nSearch Name: " + name);
        return this.musicStyleService.search(name);
    }

}
