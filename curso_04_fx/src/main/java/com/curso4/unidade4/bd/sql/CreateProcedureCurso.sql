USE lojavirtual;

DROP PROCEDURE IF EXISTS SP_INSERIR_CURSO;

CREATE PROCEDURE SP_INSERIR_CURSO (IN curso_nome varchar(40), IN curso_descricao varchar(80), IN curso_valor double(30,2), IN curso_url varchar(40))
BEGIN
    INSERT INTO Curso (curso_nome, curso_descricao, curso_valor, curso_url) VALUES (curso_nome, curso_descricao, curso_valor, curso_url);
END