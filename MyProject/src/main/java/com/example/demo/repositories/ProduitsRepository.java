package com.example.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Produit;
public interface ProduitsRepository extends JpaRepository<Produit, Integer> {
	
	public List<Produit> findByNomContains(String car);
	
	public List<Produit> findByPrix(Double prix);
	
	public List<Produit> findByNomContainsAndPrix(String name,Double prix);
}