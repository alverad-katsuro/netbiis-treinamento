use lojavirtual;

CREATE TABLE `Cliente` (
	`cliente_id` int(20) NOT NULL AUTO_INCREMENT,
	`cliente_nome` varchar(20),
	`cliente_sobrenome` varchar(40),
	`cliente_telefone` varchar(16),
	`cliente_cpf` varchar(14) UNIQUE,
	`cliente_email` varchar(30) NOT NULL UNIQUE,
	`cliente_senha` varchar(30) NOT NULL,
	PRIMARY KEY (`cliente_id`)
);

CREATE TABLE `Curso` (
	`curso_id` int(20) NOT NULL AUTO_INCREMENT,
	`curso_nome` varchar(40),
	`curso_descricao` varchar(80),
	`curso_valor` double(30,2),
	PRIMARY KEY (`curso_id`)
);

CREATE TABLE `Pedido` (
	`cliente_id` int(20) NOT NULL,
	`curso_id` int(20) NOT NULL,
	`pedido_data` DATE NOT NULL,
	PRIMARY KEY (`cliente_id`,`curso_id`)
);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk0` FOREIGN KEY (`cliente_id`) REFERENCES `Cliente`(`cliente_id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk1` FOREIGN KEY (`curso_id`) REFERENCES `Curso`(`curso_id`);



