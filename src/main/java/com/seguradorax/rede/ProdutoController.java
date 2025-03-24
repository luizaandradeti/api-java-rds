package com.seguradorax.rede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private RepositoryProduto repositoryProduto;


    @GetMapping
    public List<Produto> getAllProducts() {
        return repositoryProduto.findAll();
    }


}