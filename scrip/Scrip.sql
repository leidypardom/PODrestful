CREATE TABLE ASOCIADO(
	NOMBRE VARCHAR(20),
	PRIMARY KEY (NOMBRE)
);

CREATE TABLE Registradora (
        ID INTEGER NOT NULL,
        ID_ASOCIADO  VARCHAR(20),
        FECHA DATE,
        PRIMARY KEY (ID),
	FOREIGN KEY (ID_ASOCIADO) REFERENCES ASOCIADO(NOMBRE)
);