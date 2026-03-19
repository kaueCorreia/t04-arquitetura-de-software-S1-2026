package com.fag.lucasmartins.arquitetura_software.controller;

import com.fag.lucasmartins.arquitetura_software.model.service.impl.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Object> cadastrarProduto(@RequestBody ProdutoDTO dto) {
        return produtoService.cadastrarProduto(dto);
    }
}