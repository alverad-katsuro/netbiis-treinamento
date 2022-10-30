use lojavirtual;

CREATE TABLE Cliente (
	cliente_id int(20) NOT NULL AUTO_INCREMENT,
	cliente_nome varchar(20),
	cliente_sobrenome varchar(40),
	cliente_email varchar(30),
	cliente_telefone varchar(16),
	cliente_cpf varchar(14),
	PRIMARY KEY (cliente_id)
);

CREATE TABLE Curso (
	curso_id int(20) NOT NULL AUTO_INCREMENT,
	curso_nome varchar(40),
	curso_descricao varchar(80),
	curso_valor double(30,2),
    curso_url varchar(40),
	PRIMARY KEY (curso_id)
);

CREATE TABLE cliente_has_curso (
	cliente_id int(20) NOT NULL,
	curso_id int(20) NOT NULL,
    venda_data DateTime NOT NULL
);



ALTER TABLE cliente_has_curso ADD CONSTRAINT cliente_has_curso_fk0 FOREIGN KEY (cliente_id) REFERENCES Cliente(cliente_id);

ALTER TABLE cliente_has_curso ADD CONSTRAINT cliente_has_curso_fk1 FOREIGN KEY (curso_id) REFERENCES Curso(curso_id);

ALTER TABLE cliente_has_curso add CONSTRAINT pk_clienteCurso primary key (cliente_id, curso_id);



