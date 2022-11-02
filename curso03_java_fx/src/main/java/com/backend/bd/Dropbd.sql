use lojavirtual;


ALTER TABLE `cliente_has_curso` DROP FOREIGN KEY `cliente_has_curso_fk0`;

ALTER TABLE `cliente_has_curso` DROP FOREIGN KEY `cliente_has_curso_fk1`;


drop table Cliente;
drop table Curso;
drop table Cliente_has_Curso;
