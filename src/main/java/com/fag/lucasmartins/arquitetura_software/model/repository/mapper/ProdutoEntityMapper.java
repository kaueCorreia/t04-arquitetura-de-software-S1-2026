package com.fag.lucasmartins.arquitetura_software.model.repository.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;

public class ProdutoEntityMapper {

    public static ProdutoEntity toEntity(ProdutoBO bo) {
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(bo.getNome());
        entity.setPreco(bo.getPreco());
        entity.setPrecoFinal(bo.getPrecoFinal());
        entity.setEstoque(bo.getEstoque());
        return entity;
    }

    public static ProdutoBO toBO(ProdutoEntity entity) {
        ProdutoBO bo = new ProdutoBO();
        bo.setNome(entity.getNome());
        bo.setPreco(entity.getPreco());
        bo.setPrecoFinal(entity.getPrecoFinal());
        bo.setEstoque(entity.getEstoque());
        return bo;
    }
}