package com.example.myhome.services;

import com.example.myhome.entity.Annonce;
import com.example.myhome.entity.Ville;
import com.example.myhome.repository.AnnonceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnnonceService {
    private final AnnonceRepository annonceRepository;

    public List<Annonce> getAnnonces() {
        return annonceRepository.findAll();
    }

    public Annonce getAnnonce(Integer id) {
        return annonceRepository.getOne(id);
    }

    public List<Annonce> getFavoris() {
        return annonceRepository.findByFavoriTrue();
    }

    public List<Annonce> getAnnoncesParVille(Ville ville) {
        return annonceRepository.findByVille(ville);
    }

    public void createAnnonce(Annonce annonce) {
        annonceRepository.save(annonce);
    }
}
