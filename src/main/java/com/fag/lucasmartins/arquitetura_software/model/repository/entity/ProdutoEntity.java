package com.fag.lucasmartins.arquitetura_software.model.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Data
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;

    @Column(name = "preco_final")
    private double precoFinal;

    private Integer estoque;
}