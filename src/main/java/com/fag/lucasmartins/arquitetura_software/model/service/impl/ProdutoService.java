package com.fag.lucasmartins.arquitetura_software.model.service.impl;

import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoDTOMapper;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ResponseEntity<Object> cadastrarProduto(ProdutoDTO dto) {
        try {
            ProdutoBO bo = ProdutoDTOMapper.toBO(dto);

            String nome = bo.getNome();
            Integer estoque = bo.getEstoque();
            double preco = bo.getPreco();

            if (nome != null && nome.toLowerCase().contains("premium")) {
                if (preco < 100.0) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .body("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
                }
            }

            double precoFinal = preco;
            if (estoque != null && estoque >= 50) {
                precoFinal = preco - (preco * 0.10);
            }

            bo.setPrecoFinal(precoFinal);

            produtoRepository.salvar(bo);

            Map<String, Object> response = new HashMap<>();
            response.put("mensagem", "Produto cadastrado com sucesso!");
            response.put("nome", nome);
            response.put("estoque", estoque);
            response.put("preco", preco);
            response.put("preco_final", precoFinal);

            return ResponseEntity.status(HttpStatus.CREATED).body(response);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao processar requisição: " + e.getMessage());
        }
    }
}