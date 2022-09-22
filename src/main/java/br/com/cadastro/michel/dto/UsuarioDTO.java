package br.com.cadastro.michel.dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Size;

public class UsuarioDTO {
    @Size(min = 2)
    private String nome;
    private String sobreNome;
    @CPF(message = "Numero de CPF invalido")
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
