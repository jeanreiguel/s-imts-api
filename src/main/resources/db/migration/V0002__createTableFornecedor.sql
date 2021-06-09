CREATE TABLE fornecedor (
    idFornecedor bigint not null auto_increment,
    nome varchar(60) not null,
    email varchar(150) not null,
    telefone varchar(25) not null,
    inicio_contrato timestamp not null,
    fim_contrato timestamp not null
);

INSERT INTO fornecedor VALUES (

);