-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-11-23 18:58:08.186

-- tables
-- Table: Computador
CREATE TABLE Computadores (
    id int  NOT NULL,
    nombre varchar(15)  NOT NULL,
	id_salon int not null,
    CONSTRAINT Computador_pk PRIMARY KEY (id)
);

CREATE TABLE Salones (
    id int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    descripcion varchar(100)  NOT NULL,
    CONSTRAINT Salon_pk PRIMARY KEY (id)
);


CREATE TABLE SalonesProfesores(
	id_profesor int not null,
	id_salones int not null
);


CREATE TABLE Profesores (
    nombre varchar(50)   NOT NULL,
    documento  int NOT NULL,
    correo varchar(50)  NOT NULL,
    CONSTRAINT Profesor_pk PRIMARY KEY (documento)
);



ALTER TABLE Computadores ADD CONSTRAINT Computadores_Salones
    FOREIGN KEY (id_salon)
    REFERENCES salones(id);
	
ALTER TABLE  SalonesProfesores  ADD CONSTRAINT SP_Salones
	FOREIGN KEY (id_salones)
	REFERENCES Salones(id);

ALTER TABLE  SalonesProfesores ADD CONSTRAINT SP_Profesores
	FOREIGN KEY (id_profesor)
	REFERENCES Profesores(documento);

	
/*
  drop table profesores;    
  drop table salones;
  drop table SalonesProfesores;  
  drop table computadores;
 
    
 */