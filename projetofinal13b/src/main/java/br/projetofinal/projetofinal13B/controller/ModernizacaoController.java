package br.projetofinal.projetofinal13B.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projetofinal.projetofinal13B.model.Modernizacao;
import br.projetofinal.projetofinal13B.repository.ModernizacaoRepo;

@RestController
@RequestMapping("/modernizacao")
public class ModernizacaoController {
    
    @Autowired
    private ModernizacaoRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Modernizacao> buscarPorId(@PathVariable int id){
        Modernizacao modernizacao = repo.findById(id).orElse(null);

        if(modernizacao != null) {
            return ResponseEntity.ok(modernizacao);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Modernizacao> listarAnuncios(){
        List<Modernizacao> lista = (List<Modernizacao>) repo.findAll();

        return lista;
    }

    @PostMapping("/update")
    public ResponseEntity<Modernizacao> atualizaModernizacao(@RequestBody Modernizacao modernizacao) {
        if (modernizacao.getNumSeq() > 0) {
            Modernizacao newModernizacao= repo.save(modernizacao);
            return ResponseEntity.ok(newModernizacao);
        }
        return ResponseEntity.status(400).build(); // Bad Request
    }

    @PostMapping("/new")
    public ResponseEntity<Modernizacao> novoModernizacao(@RequestBody Modernizacao modernizacao) {
        Modernizacao newModernizacao = repo.save(modernizacao);

        return ResponseEntity.ok(newModernizacao);
    }


}

