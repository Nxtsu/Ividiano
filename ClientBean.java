package fr.ividiano.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ividianodb",name="Client")
public class ClientBean implements Serializable
{
    private int idClient;
    private String nomClient;
    private String emailClient;
    private String telephoneClient;
    private String adresseClient;

    @Id
    @GeneratedValue
    @Column(name="id_client")

    @Column(name="nom_client")

    @Column(name="email_client")

    @Column(name="telephone_client")

    @Column(name="adresse_client")
}