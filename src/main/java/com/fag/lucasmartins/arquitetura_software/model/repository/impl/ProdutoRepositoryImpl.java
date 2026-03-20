package com.fag.lucasmartins.arquitetura_software.model.repository.impl;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.jpa.ProdutoJpaRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.mapper.ProdutoEntityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {

    @Autowired
    private ProdutoJpaRepository jpaRepository;

    @Override
    public void salvar(ProdutoBO bo) {
        jpaRepository.save(ProdutoEntityMapper.toEntity(bo));
    }
}