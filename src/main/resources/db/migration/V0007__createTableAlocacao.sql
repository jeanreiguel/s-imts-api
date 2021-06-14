CREATE TABLE alocacao (
    id_consultor bigint not null,
    id_projeto bigint not null,
    skill varchar(255) not null,
    horas_total int not null,
    foreign key (id_consultor) references consultores(cadastro_consultor),
    foreign key (id_projeto) references projetos(id_projeto)

);

INSERT INTO alocacao VALUES(
    1,
    1,
    "Desenvolvimento WEB",
    80
);
INSERT INTO Alocacao VALUES(
    2,
    1,
    "Desenvolvimento PHP",
    80
);