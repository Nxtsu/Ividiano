package fr.ividiano.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ividianodb",name="Categorie")
public class CategorieBean implements Serializable
{
    private int id_categorie;
    private String nom_categorie = "";
    @Id
    @GeneratedValue
    @Column(name="pk_id_categorie")
    public int getId()
    {
        return id_categorie;
    }
    public void setId(int id)
    {
        id_categorie = id;
    }
    @Column(name="message")
    public String getNomCategorie()
    {
        return nom_categorie;
    }
    public void setNomCategorie(String nom)
    {
        nom_categorie = nom;
    }
}
