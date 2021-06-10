CREATE TABLE apontamentos (
    id_apontamento bigint not null auto_increment,
    cadastro_consultor bigint not null,
    nome_consultor varchar(100) not null,
    skill_consultor varchar(255) not null,
    id_projeto bigint not null,
    horas_trabalhadas int not null,
    descricao varchar(255) not null,
    situacao_apontamento varchar(9) not null,
    primary key (id_apontamento),
    FOREIGN KEY (cadastro_consultor) REFERENCES consultores(cadastro_consultor)
);