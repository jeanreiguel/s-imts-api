CREATE TABLE PROJETOS(
    id_projeto bigint not null auto_increment,
    secao_projeto varchar(100) not null,
    nome_projeto varchar(150) not null,
    descricao_projeto varchar(500) not null,
    status_projeto varchar(45) not null,
    data_inicio varchar(20),
    data_fim varchar(20),
    horas_apontadas varchar(10),
    horas_total varchar(10) not null,
      primary key (id_projeto)
);

INSERT INTO PROJETOS VALUES(
    null,
    "ABC","Restauração de alteradores",
    "ABCDEFGHIJKLMNOPQRSTUVWXYZ -- ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "ANDAMENTO",
    "10/10/2020",
    null,
    "00",
    "2500"
);
INSERT INTO PROJETOS VALUES(
    null,
    "XYZ","Autamatização de manufatura",
    "ABCDEFGHIJKLMNOPQRSTUVWXYZ -- ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "CONCLUÍDO",
    "10/10/2020",
    null,
    "2500",
    "2500"
);