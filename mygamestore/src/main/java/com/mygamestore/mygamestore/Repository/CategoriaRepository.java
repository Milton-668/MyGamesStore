package com.mygamestore.mygamestore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamestore.mygamestore.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
