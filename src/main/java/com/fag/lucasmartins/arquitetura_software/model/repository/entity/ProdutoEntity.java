package com.fag.lucasmartins.arquitetura_software.model.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;

    @Column(name = "preco_final")
    private double precoFinal;

    private Integer estoque;

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public double getPrecoFinal() { return precoFinal; }
    public void setPrecoFinal(double precoFinal) { this.precoFinal = precoFinal; }

    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
}