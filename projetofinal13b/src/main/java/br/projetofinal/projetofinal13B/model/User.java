package br.projetofinal.projetofinal13B.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity // classe mapeada no BD
@Table(name = "tbl_usuario")
@Getter
@Setter
public class User {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3,...
    @Column(name = "id")
    private int id;
 

    @Column(name = "email")
    private String email;

    @Column(name = "linkfoto")
    private String linkfoto;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "racf")
    private String racf;

    @Column(name = "senha")
    private String senha;

    //@OneToMany(mappedBy = "usuario") // atributo na classe Anuncio
    //@JsonIgnoreProperties("usuario") // atributo do 'Anuncio' que não deve ser preenchido
    //private List<Anuncio> anuncios;

}
