package fr.ividiano.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(schema="ividianodb",name="Commande_client")
public class CommandeClientBean implements Serializable
{
    private int idCommandeClient;
    private String montant;
    private TimeStamp dateCreation;
    private int noConfirmation;
    private int clientId;

    @Id
    @GeneratedValue
    @Column(name="id_commande_client")

    @Column(name="montant")

    @Column(name="date_creation")

    @Column(name="no_confirmation")

    @Column(name="client_id")
}