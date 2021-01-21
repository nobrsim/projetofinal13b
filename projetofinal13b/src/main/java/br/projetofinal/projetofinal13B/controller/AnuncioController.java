package br.projetofinal.projetofinal13B.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projetofinal.projetofinal13B.model.Anuncio;
import br.projetofinal.projetofinal13B.repository.AnuncioRepo;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {
    
    @Autowired
    private AnuncioRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Anuncio> buscarPorId(@PathVariable int id){
        Anuncio anuncio = repo.findById(id).orElse(null);

        if(anuncio != null) {
            return ResponseEntity.ok(anuncio);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Anuncio> listarAnuncios(){
        List<Anuncio> lista = (List<Anuncio>) repo.findAll();

        return lista;
    }
}
