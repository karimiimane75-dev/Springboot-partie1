package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Annotation Lombok @Data génère automatiquement les méthodes toString, equals, hashCode,getters et setters pour la classe
@Data

// Annotation Lombok @NoArgsConstructor génère un constructeur sans arguments
@NoArgsConstructor

// Annotation Lombok @AllArgsConstructor génère un constructeur avec tous les arguments
@AllArgsConstructor

// Annotation Lombok @ToString génère automatiquement la méthode toString pour la classe
@ToString

// Annotation JPA @Entity indique que cette classe est une entité persistante
@Entity

// Annotation JPA @Table spécifie le nom de la table dans la base de données
@Table(name = "produits")

public class Produit {
	
// Annotation JPA @Id indique que cette propriété est une clé primaire
@Id

// Annotation JPA @GeneratedValue spécifie la stratégie de génération de la clé primaire
@GeneratedValue(strategy = GenerationType.IDENTITY)

// Annotation JPA @Column spécifie le nom de la colonne dans la table de la base de données
@Column(name = "ID_PRODUIT")
Integer id;

// Annotation JPA @Column spécifie le nom de la colonne dans la table de la base de données
@Column(name = "NOM_PRODUIT")
String nom;

// Cette propriété sera automatiquement mappée à une colonne dans la table de la base de données
Double prix;
}