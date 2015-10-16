package com.gbonespirito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gbonespirito.model.Produto;
import com.gbonespirito.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository p;
	
	@RequestMapping("api/produtos")
	public Iterable<Produto> lista(){
		
		for (int i=1; i<100; i++){
    		p.save(new Produto("Teste"+i));
    	}
		
		return p.findAll();
	}
}
