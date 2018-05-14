package com.example.barksapi.controllers;

import com.example.barksapi.models.Bark;
import com.example.barksapi.repositories.BarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BarkController {

    @Autowired
    private BarkRepository barkRepository;

    @GetMapping("/")
    public Iterable<Bark> findAllBarks() {
        return barkRepository.findAll();
    }

    @GetMapping("/{barkId}")
    public Bark findBarkById(@PathVariable Long barkId) {
        return barkRepository.findOne(barkId);
    }

    @DeleteMapping("/{barkId}")
    public HttpStatus deleteBarkById(@PathVariable Long barkId) {
        barkRepository.delete(barkId);
        return HttpStatus.OK;
    }

    @PostMapping("/")
    public Bark createNewBark(@RequestBody Bark newBark) {
        return barkRepository.save(newBark);
    }

    @PatchMapping("/{barkId}")
    public Bark updateBarkById(@PathVariable Long barkId, @RequestBody Bark barkRequest) {
        Bark barkFromDb = barkRepository.findOne(barkId);
        barkFromDb.setUserName(barkRequest.getUserName());
        barkFromDb.setBarkText(barkRequest.getBarkText());
        barkFromDb.setLoudness(barkRequest.getLoudness());
        return barkRepository.save(barkFromDb);
    }
}
