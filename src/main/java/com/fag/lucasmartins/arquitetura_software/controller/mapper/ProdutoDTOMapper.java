package com.fag.lucasmartins.arquitetura_software.controller.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

public class ProdutoDTOMapper {

    public static ProdutoBO toBO(ProdutoDTO dto) {
        ProdutoBO bo = new ProdutoBO();
        bo.setNome(dto.getNome());
        bo.setEstoque(dto.getEstoque());
        bo.setPreco(dto.getPreco());
        return bo;
    }
}