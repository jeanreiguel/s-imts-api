CREATE TABLE skills(
    id bigint not null auto_increment,
    id_projeto bigint not null,
    skill_id bigint not null,
    skill_nome varchar(255) not null,
    horas_apontadas bigint not null,
    horas_total bigint not null,
    primary key(id)
);

INSERT INTO skills VALUES(
    null,
    1,
    1,
    "asdaasdasdasd",
    0,
    300
);