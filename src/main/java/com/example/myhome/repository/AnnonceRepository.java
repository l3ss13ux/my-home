package com.example.myhome.repository;

import com.example.myhome.entity.Annonce;
import com.example.myhome.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {

    List<Annonce> findByFavoriTrue();

    List<Annonce> findByVille(Ville ville);
}
