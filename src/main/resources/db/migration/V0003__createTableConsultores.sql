CREATE TABLE consultores (
    cadastro_consultor bigint not null auto_increment,
    nome_consultor varchar(100) not null,
    limite_horas bigint not null,
    status varchar(7) not null,
    primary key (cadastro_consultor),
    user_id bigint
    );

    INSERT INTO consultores VALUES (
        null,
        "Jean Henrique Reiguel",
        1600,
        "ATIVO",
        null
    );
    INSERT INTO consultores VALUES (
        null,
        "Maria Gabriela de Souza Cruz",
        1200,
        "ATIVO",
       null
    );
    INSERT INTO consultores VALUES (
        null,
        "Roberta Polez Bassegio",
        1800,
        "ATIVO",
        null
    );