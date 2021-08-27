CREATE TABLE aprovacoes (
    id bigint not null auto_increment,
    data date not null,
    nome_fornecedor varchar(120) not null,
    nome_responsavel varchar(120) not null,
    id_consultor bigint not null,
    id_projeto bigint not null,
    skill varchar(255) not null,
    horas_aprovadas int not null,
    horas_total int not null,
    valor_horas double not null,
    primary key (id),
    foreign key (id_consultor) references consultores(cadastro_consultor),
    foreign key (id_projeto) references projetos(id_projeto)
);