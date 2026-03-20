package com.fag.lucasmartins.arquitetura_software.model.bo;

import lombok.Data;

@Data
public class ProdutoBO {

    private String nome;
    private Integer estoque;
    private double preco;
    private double precoFinal;
}