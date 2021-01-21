package br.projetofinal.projetofinal13B.repository;

import org.springframework.data.repository.CrudRepository;

import br.projetofinal.projetofinal13B.model.Anuncio;

public interface AnuncioRepo extends CrudRepository<Anuncio, Integer> {
    
}
