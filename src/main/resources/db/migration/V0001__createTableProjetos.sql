CREATE TABLE PROJETOS(
    id_projeto bigint not null auto_increment,
    secao_projeto bigint not null,
    nome_projeto varchar(150) not null,
    descricao_projeto varchar(500) not null,
    status_projeto varchar(45) not null,
    data_inicio Date,
    data_fim Date,
    horas_apontadas bigint,
    horas_total bigint not null,
     primary key (id_projeto)
);

INSERT INTO PROJETOS VALUES(
    null,
    1,
    "Restauração de alteradores",
    "ABCDEFGHIJKLMNOPQRSTUVWXYZ -- ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "ANDAMENTO",
    '2008-01-01',
    null,
    0,
    2500
);
INSERT INTO PROJETOS VALUES(
    null,
    1,"Autamatização de manufatura",
    "ABCDEFGHIJKLMNOPQRSTUVWXYZ -- ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "CONCLUÍDO",
    '2008-01-01',
    null,
    2500,
    2500
);