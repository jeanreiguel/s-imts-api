CREATE TABLE consultores (
    cadastro_consultor bigint not null auto_increment,
    nome_consultor varchar(100) not null,
    skill_consultor varchar(255) not null,
    limite_horas varchar(4) not null,
    status varchar(7) not null,
    primary key (cadastro_consultor),
    user_id bigint
    );

    INSERT INTO consultores VALUES (
        null,
        "Jean Henrique Reiguel",
        "Desenvolvedor WEB",
        "1600",
        "ATIVO",
        null
    );
    INSERT INTO consultores VALUES (
        null,
        "Maria Gabriela de Souza Cruz",
        "Desenvolvedor PHP",
        "1200",
        "ATIVO",
       null
    );
    INSERT INTO consultores VALUES (
        null,
        "Roberta Polez Bassegio",
        "Desenvolvedor JAVA",
        "1800",
        "ATIVO",
        null
    );