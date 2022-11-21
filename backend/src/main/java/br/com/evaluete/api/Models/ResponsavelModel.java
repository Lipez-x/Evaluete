package br.com.evaluete.api.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "tb_responsavel")
public class ResponsavelModel {
    @Column(nullable = false)
    private String login;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String aluno;
    @Column(nullable = false)
    private Integer cpf;
    @Column(nullable = false, length = 11)
    private Integer telefone;
}
