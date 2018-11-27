package fr.ividiano.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ividianodb",name="Produit_commande")
public class ProduitCommandeBean implements Serializable
{
    private int CommandeClientId;
    private int quantite;
    private int produitId;

    @Id
    @GeneratedValue
    @Column(name="commande_client_id")

    @Column(name="quantite")

    @Column(name="produit_id")
}