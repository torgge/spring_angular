package com.gbonespirito.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gbonespirito.model.Produto;
import com.gbonespirito.repository.ProdutoRepository;

@RestController
public class ProdutoResource {

	@Autowired
	private ProdutoRepository repository;


	@RequestMapping("/produto")
	public Iterable<Produto> listaProdutos(){
		return repository.findAll() ;
	}
	
	@RequestMapping("/produto/{id}")
	public Produto findByNome(@PathVariable long id){
		return repository.findOne(id);
	}
	
	@RequestMapping( value="/produto", method = RequestMethod.POST)
	public Produto addProduto(@RequestBody final  Produto produto ){
		Produto prod = repository.save(produto);
		return prod;
	}

	@RequestMapping( value="/produto", method = RequestMethod.PUT)
	public Produto updateProduto(@RequestBody final  Produto produto ){
		Produto prod = repository.save(produto);
		return prod;
	}

	@RequestMapping( value="/produto/{id}", method = RequestMethod.DELETE)
	public void deleteProduto(@PathVariable final long id ){
		repository.delete(id);
	}
	
	
}
