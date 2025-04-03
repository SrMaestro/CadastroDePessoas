package com.dev.java.Cadastro.Pessoas.Model.Pessoas;

import com.dev.java.Cadastro.Pessoas.Model.Missoes.MissoesModel;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private  MissoesModel missoes;
    public  PessoaModel (){

    }
    public PessoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
