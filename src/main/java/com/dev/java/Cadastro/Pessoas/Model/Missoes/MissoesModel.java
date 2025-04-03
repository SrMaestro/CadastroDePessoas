package com.dev.java.Cadastro.Pessoas.Model.Missoes;

import com.dev.java.Cadastro.Pessoas.Model.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nome;
    private  int dificuldade;
    @OneToMany(mappedBy = "missoes" )
    private List<PessoaModel> pessoas;
}
