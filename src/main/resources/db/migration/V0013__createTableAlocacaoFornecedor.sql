CREATE TABLE alocacao_fornecedor (
    id bigint not null auto_increment,
    id_fornecedor bigint not null,
    id_projeto bigint not null,
    primary key (id)
);