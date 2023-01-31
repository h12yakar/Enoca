package com.example.BackendChallenge.controller;


import com.example.BackendChallenge.model.Calisan;
import com.example.BackendChallenge.repository.CalisanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin() //port değişikliği olabilme ihtimali üzerine böyle bırakıyoruz her hangi port ataması yapmıyoruz.
@RestController
public class Controller {

    @Autowired
    CalisanRepository calisanRepository;

    @GetMapping
    public ResponseEntity<List<Calisan>> getCalisan(){
        try{
            return new ResponseEntity<>(calisanRepository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/calisan/{id}")
    public ResponseEntity<Calisan> getCalisanById(@PathVariable("id") Long id){
        try {

            Calisan objCalisan = getKayit(id);
            if (objCalisan != null){return new ResponseEntity<>(objCalisan, HttpStatus.OK);}
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/calisan")
    public ResponseEntity<Calisan> yeniCalisan(@RequestBody Calisan calisan){
        Calisan yeniCalisan = calisanRepository.save(Calisan.builder().adSoyad(calisan.getAdSoyad()).firma(calisan.getFirma()).build());
        return new ResponseEntity<>(yeniCalisan, HttpStatus.OK);
    }

    @PutMapping("/calisan/{id}")
    public ResponseEntity<Calisan> updateCalisan(@PathVariable("id") long id, @RequestBody Calisan calisan){
        Calisan calisanObje = getKayit(id);
        if(calisanObje != null){
            calisanObje.setAdSoyad(calisan.getAdSoyad());
            calisanObje.setFirma(calisan.getFirma());
            return new ResponseEntity<>(calisanRepository.save(calisanObje),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/calisan/{id}")
    public ResponseEntity<HttpStatus> silCalisanById(@PathVariable("id") long id){
        try {
            Calisan sil = getKayit(id);

            if (sil != null){
                calisanRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("calisan")
    public Calisan getKayit(long id){
        Optional<Calisan> objCalisan = calisanRepository.findById(id);
        if (objCalisan.isPresent()){
            return objCalisan.get();
        }
        return null;
    }


}
