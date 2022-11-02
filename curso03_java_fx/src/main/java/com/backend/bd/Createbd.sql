use lojavirtual;

CREATE TABLE Cliente (
	cliente_id int(20) NOT NULL AUTO_INCREMENT,
	cliente_nome varchar(20) NOT NULL,
	cliente_sobrenome varchar(40) NOT NULL,
	cliente_email varchar(30) NOT NULL,
	cliente_telefone varchar(16) NOT NULL,
	cliente_cpf varchar(14) NOT NULL,
	PRIMARY KEY (cliente_id)
);

CREATE TABLE Curso (
	curso_id int(20) NOT NULL AUTO_INCREMENT,
	curso_nome varchar(40) NOT NULL,
	curso_descricao varchar(80) NOT NULL,
	curso_valor double(30,2) NOT NULL,
	PRIMARY KEY (curso_id)
);

CREATE TABLE Cliente_has_Curso (
	cliente_id int(20) NOT NULL,
	curso_id int(20) NOT NULL,
    data_venda datetime NOT NULL
);



ALTER TABLE Cliente_has_Curso ADD CONSTRAINT Cliente_has_Curso_fk0 FOREIGN KEY (cliente_id) REFERENCES Cliente(cliente_id);

ALTER TABLE Cliente_has_Curso ADD CONSTRAINT Cliente_has_Curso_fk1 FOREIGN KEY (curso_id) REFERENCES Curso(curso_id);

ALTER TABLE Cliente_has_Curso add CONSTRAINT pk_clienteCurso primary key (cliente_id, curso_id);



