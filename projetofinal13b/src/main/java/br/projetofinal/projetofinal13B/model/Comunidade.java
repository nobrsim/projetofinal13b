package br.projetofinal.projetofinal13B.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "itmn_comunidade")
@Getter
@Setter
public class Comunidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_comunidade")
    private int id_comunidade;

    @Column(name = "nome_comunidade")
    private String nome_comunidade; //200

    @ManyToOne
    @JoinColumn(name = "id_usuario") // nome da coluna na tabela
    //@JsonIgnoreProperties("anuncios") // atributo do User que não deve ser preenchido
    private User usuario;

}
