CREATE TABLE consultores (
    cadastro_consultor bigint not null auto_increment,
    nome_consultor varchar(100) not null,
    email_consultor varchar(150) not null,
    telefone_consultor varchar(25) not null,
    skill_consultor varchar(255) not null,
    limite_horas varchar(4) not null,
    status varchar(7) not null,
    primary key (cadastro_consultor)
    );

    INSERT INTO consultores VALUES (
        null,
        "Jean Henrique Reiguel",
        "jeanrgl03@gmail.com",
        "55+ (47)90000-0000",
        "Desenvolvedor WEB",
        "1600",
        "ATIVO"
    );
    INSERT INTO consultores VALUES (
        null,
        "Maria Gabriela de Souza Cruz",
        "mabisouza@gmail.com",
        "55+ (47)90000-0000",
        "Desenvolvedor PHP",
        "1200",
        "ATIVO"
    );
    INSERT INTO consultores VALUES (
        null,
        "Roberta Polez Bassegio",
        "robertapolez@gmail.com",
        "55+ (47)90000-0000",
        "Desenvolvedor JAVA",
        "1800",
        "ATIVO"
    );