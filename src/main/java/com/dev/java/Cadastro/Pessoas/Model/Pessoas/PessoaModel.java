package com.dev.java.Cadastro.Pessoas.Model.Pessoas;

import com.dev.java.Cadastro.Pessoas.Model.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
@Data
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private  MissoesModel missoes;
}
