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

CREATE TABLE cliente_has_curso (
	cliente_id int(20) NOT NULL,
	curso_id int(20) NOT NULL
);



ALTER TABLE cliente_has_curso ADD CONSTRAINT cliente_has_curso_fk0 FOREIGN KEY (cliente_id) REFERENCES Cliente(cliente_id);

ALTER TABLE cliente_has_curso ADD CONSTRAINT cliente_has_curso_fk1 FOREIGN KEY (curso_id) REFERENCES Curso(curso_id);

ALTER TABLE cliente_has_curso add CONSTRAINT pk_clienteCurso primary key (cliente_id, curso_id);



