CREATE TABLE fornecedores (
    id_fornecedor bigint not null auto_increment,
    nome_fornecedor varchar(60) not null,
    email_fornecedor varchar(150) not null,
    telefone_fornecedor varchar(25) not null,
    inicio_contrato date not null,
    fim_contrato date,
    primary key (id_fornecedor)
);

INSERT INTO fornecedores VALUES (
    null,
    "IBTECH",
    "ibtech_business@gmail.com",
    "55+ (47)0000-0000",
    "10-10-20",
    null
);
INSERT INTO fornecedores VALUES (
    null,
    "DEVEXP",
    "devexp_business@gmail.com",
    "55+ (47)0000-0000",
    "10-10-20",
    null
);