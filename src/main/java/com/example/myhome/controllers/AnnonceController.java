package com.example.myhome.controllers;

import com.example.myhome.entity.Annonce;
import com.example.myhome.entity.Ville;
import com.example.myhome.services.AnnonceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/annonces")
public class AnnonceController {
    private final AnnonceService annonceService;

    @GetMapping()
    public List<Annonce> getAnnonces() {
        return annonceService.getAnnonces();
    }

    @GetMapping("/{identifiant}")
    public Annonce getAnnonce(@PathVariable("identifiant") Integer id) {
        return annonceService.getAnnonce(id);
    }

    @GetMapping("/favoris")
    public List<Annonce> getFavoris() {
        return annonceService.getFavoris();
    }

    @GetMapping("/{ville}")
    public List<Annonce> getAnnoncesParVille(@PathVariable("ville") Ville ville) {
        return annonceService.getAnnoncesParVille(ville);
    }

    @PostMapping()
    public void createAnnonce(@RequestBody Annonce annonce) {
        annonceService.createAnnonce(annonce);
    }
}
