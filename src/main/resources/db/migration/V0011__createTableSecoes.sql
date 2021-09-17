CREATE TABLE secoes(
    secao_id bigint not null auto_increment,
    secao_nome varchar(255) not null,
    primary key(secao_id)
);

INSERT INTO secoes VALUES (
    null,
    "ABC"
);

INSERT INTO secoes VALUES (
    null,
    "XZV"
);