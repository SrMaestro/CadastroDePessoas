package com.dev.java.Cadastro.Pessoas.Model.Missoes;

import com.dev.java.Cadastro.Pessoas.Model.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nome;
    private  int dificuldade;
    @OneToMany(mappedBy = "missoes" )
    private List<PessoaModel> pessoas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, int dificuldade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
