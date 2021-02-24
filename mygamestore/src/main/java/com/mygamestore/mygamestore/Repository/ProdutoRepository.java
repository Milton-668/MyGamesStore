package com.mygamestore.mygamestore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamestore.mygamestore.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);
}
