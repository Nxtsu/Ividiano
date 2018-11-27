DROP DATABASE IF EXISTS ividianodb;
CREATE DATABASE ividianodb;
USE ividianodb;

CREATE TABLE Categorie
(
    id_categorie INT NOT NULL AUTO_INCREMENT,
    nom_categorie VARCHAR(45),
    CONSTRAINT pk_id_categorie PRIMARY KEY (id_categorie)
);

CREATE TABLE Client
(
    id_client INT NOT NULL AUTO_INCREMENT,
    nom_client VARCHAR(45),
    email_client VARCHAR(45),
    telephone_client VARCHAR(15),
    adresse_client VARCHAR(250),
    CONSTRAINT pk_id_client PRIMARY KEY(id_client)
);

CREATE TABLE Produit
(
    id_produit INT NOT NULL AUTO_INCREMENT,
    nom_produit VARCHAR(45),
    prix_produit DECIMAL(5,2),
    description_produit VARCHAR(250),
    dernier_maj_produit TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    id_categorie_produit INT,
    CONSTRAINT pk_id_produit PRIMARY KEY(id_produit),
    CONSTRAINT fk_id_categorie_produit FOREIGN KEY (id_categorie_produit) REFERENCES Categorie(id_categorie)
);

CREATE TABLE Commande_client
(
    id_commande_client INT NOT NULL AUTO_INCREMENT,
    montant DECIMAL(6,2),
    date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    no_confirmation INTEGER,
    client_id INT,
    CONSTRAINT pk_id_commande_client PRIMARY KEY(id_commande_client),
    CONSTRAINT fk_client_id FOREIGN KEY(client_id) REFERENCES Client(id_client)
);

CREATE TABLE Produit_commande
(
    commande_client_id INT NOT NULL AUTO_INCREMENT,
    quantite INT,
    produit_id INT,
    CONSTRAINT pk_commande_client_id PRIMARY KEY(commande_client_id),
    CONSTRAINT fk_commande_client_id FOREIGN KEY(commande_client_id) REFERENCES Commande_client(id_commande_client),
    CONSTRAINT fk_produit_id FOREIGN KEY(produit_id) REFERENCES Produit(id_produit)
);

INSERT INTO Categorie VALUES (1,"Films");
INSERT INTO Client VALUES(1,"El Wassifi","a@a","222","Calais");
INSERT INTO Produit VALUES (1,"Overlord",888.88,"222","2018-11-27 09:27:00",1);
INSERT INTO Commande_client VALUES (1,8888.88,"2018-11-27 09:27:00",1,1);
INSERT INTO Produit_commande VALUES(1,20,1);
