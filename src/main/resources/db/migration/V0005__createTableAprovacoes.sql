CREATE TABLE aprovacoes (
    id bigint not null auto_increment,
    data timestamp not null,
    nome_fornecedor varchar(120) not null,
    nome_responsavel varchar(120) not null,
    id_consultor bigint not null,
    horas_aprovadas int not null,
    valor_horas double not null,
    primary key (id)
);