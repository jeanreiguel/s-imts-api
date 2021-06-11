CREATE TABLE aprovacao (
    id bigint not null auto_increment,
    cadastro_consultor bigint not null,
    qnt_horas int not null,
    valor_horas double not null,
    valor_total double not null,
    primary key (id)
);