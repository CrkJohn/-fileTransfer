-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-11-23 18:58:08.186

-- tables
-- Table: Computador
CREATE TABLE Computador (
    id int  NOT NULL,
    nombre int  NOT NULL,
    CONSTRAINT Computador_pk PRIMARY KEY (id)
);

-- Table: Profesor
CREATE TABLE Profesor (
    nombre int  NOT NULL,
    documento varchar(50)  NOT NULL,
    correo varchar(50)  NOT NULL,
    CONSTRAINT Profesor_pk PRIMARY KEY (documento)
);

-- Table: Salon
CREATE TABLE Salon (
    id int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    descripcion varchar(100)  NOT NULL,
    CONSTRAINT Salon_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: Salon_Computador (table: Computador)
ALTER TABLE Computador ADD CONSTRAINT Salon_Computador
    FOREIGN KEY ()
    REFERENCES Salon ()  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Salon_Profesor (table: Salon)
ALTER TABLE Salon ADD CONSTRAINT Salon_Profesor
    FOREIGN KEY ()
    REFERENCES Profesor ()  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

