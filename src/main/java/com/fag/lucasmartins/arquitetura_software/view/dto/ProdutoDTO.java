package com.fag.lucasmartins.arquitetura_software.view.dto;

import lombok.Data;

@Data
public class ProdutoDTO {
    private String nome;
    private Integer estoque;
    private double preco;
}