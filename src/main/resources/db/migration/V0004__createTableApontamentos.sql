CREATE TABLE apontamentos (
    id_apontamento bigint not null auto_increment,
    id_consultor bigint not null,
    id_projeto bigint not null,
    horas_trabalhadas int,
    descricao varchar(255) not null,
    situacao_apontamento varchar(9) not null,
    primary key (id_apontamento),
    FOREIGN KEY (id_consultor) REFERENCES alocacao(id_consultor),
    FOREIGN KEY (id_projeto) REFERENCES alocacao(id_projeto)
);