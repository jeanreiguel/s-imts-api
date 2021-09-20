CREATE TABLE projeto_skill(
    id bigint not null auto_increment,
    id_projeto bigint not null,
    skill_id bigint not null,
    horas_apontadas bigint not null,
    horas_total bigint not null,
    primary key(id)
);

INSERT INTO projeto_skill VALUES(
    null,
    1,
    1,
    0,
    300
);