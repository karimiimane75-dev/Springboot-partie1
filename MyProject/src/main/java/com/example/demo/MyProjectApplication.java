package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.repositories.ProduitsRepository; 
import com.example.demo.entities.Produit;

@SpringBootApplication
public class MyProjectApplication implements CommandLineRunner {

    @Autowired
    private ProduitsRepository produitsRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajoutez un "null" pour l'ID et respectez l'ordre des paramètres (id, nom, prix)
        produitsRepository.save(new Produit(null, "TCL", 23.00));
        produitsRepository.save(new Produit(null, "Samsung", 45.00));
        
        System.out.println("Affichage des produits :");
        produitsRepository.findAll().forEach(p -> {
            System.out.println(p.toString());
        });
        
        System.out.println("***************************");
        Produit produit = produitsRepository.findById(5).get();
        System.out.println("produit trouvé: "+ produit.toString());
        
        System.out.println("Recherche par nom ***************************");
        produitsRepository.findByNomContains("de").forEach(p->{
        	System.out.println(p.toString());
        });
        
        
        System.out.println("Recherche par prix ***************************");
        produitsRepository.findByPrix(10.00).forEach(p->{
        System.out.println(p.toString());
        });
        
        
        System.out.println("Recherche par double criteres ***************************");
        		produitsRepository.findByNomContainsAndPrix("p",10.00).forEach(p->{

        		System.out.println(p.toString());
        });
        		
        
        produitsRepository.deleteById(9);
        
    }
}