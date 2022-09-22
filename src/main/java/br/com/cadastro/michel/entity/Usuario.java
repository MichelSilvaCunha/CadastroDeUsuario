package br.com.cadastro.michel.entity;


import javax.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sobreNome;

    private String cpf;

    @Deprecated
    public Usuario(){

    }

    public Usuario(String nome, String sobreNome, String cpf){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
    }

}
