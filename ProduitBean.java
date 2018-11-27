package fr.ividiano.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(schema="ividianodb",name="Produit")
public class ProduitBean implements Serializable
{
    private int idProduit;
    private String nomProduit;
    private Double prixProduit;
    private String descriptionProduit;
    private Timestamp dernierMajProduit;
    private int idCategorieproduit;

    @Id
    @GeneratedValue
    @Column(name="id_produit")

    @Column(name="nom_produit")

    @Column(name="prix_produit")

    @Column(name="description_produit")

    @Column(name="dernier_maj_produit")

    @Column(name="id_categorie_produit")
}