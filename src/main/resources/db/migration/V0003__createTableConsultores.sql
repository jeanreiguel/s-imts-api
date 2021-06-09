CREATE TABLE consultor (
    idConsultor bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(150) not null,
    telefone varchar(25) not null,
    skill varchar(255) not null,
    limiteHoras varchar(4) not null
    );