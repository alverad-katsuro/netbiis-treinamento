use lojavirtual;

ALTER TABLE `cliente_has_curso` DROP FOREIGN KEY `cliente_has_curso_fk0`;

ALTER TABLE `cliente_has_curso` DROP FOREIGN KEY `cliente_has_curso_fk1`;

drop table cliente_has_curso;
drop table Cliente;
drop table Curso;