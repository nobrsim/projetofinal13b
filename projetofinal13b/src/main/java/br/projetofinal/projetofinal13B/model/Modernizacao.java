package br.projetofinal.projetofinal13B.model;

import java.util.Date;

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
@Table(name = "itmn_modernizacao")
@Getter
@Setter
public class Modernizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "num_seq")
    private int num_seq;

    @Column(name = "data_modernizacao")
    private Date data_modernizacao; //200

    @Column(name = "descricao")
    private String descricao; //200

    @Column(name = "percentual")
    private double percentual;


    @ManyToOne
    @JoinColumn(name = "id_comunidade") // nome da coluna na tabela
    @JsonIgnoreProperties("usuario") // atributo do User que não deve ser preenchido
    private Comunidade comunidade;

}