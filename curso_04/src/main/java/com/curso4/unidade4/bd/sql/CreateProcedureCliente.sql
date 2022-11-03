USE lojavirtual;

DROP PROCEDURE IF EXISTS SP_INSERIR_CLIENTE;

CREATE PROCEDURE SP_INSERIR_CLIENTE (IN cliente_nome varchar(20), IN cliente_sobrenome varchar(40), IN cliente_cpf varchar(14), IN cliente_email varchar(30), IN cliente_telefone varchar(16))
BEGIN
    INSERT INTO Cliente (cliente_nome,cliente_sobrenome,cliente_cpf,cliente_email,cliente_telefone) VALUES (cliente_nome,cliente_sobrenome,cliente_cpf,cliente_email,cliente_telefone);
END