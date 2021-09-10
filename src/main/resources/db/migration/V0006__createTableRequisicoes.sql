CREATE TABLE Requisicoes(
    requisicao_id bigint primary key auto_increment,
    requisicao_id_consultor bigint not null,
    nome_responsavel varchar(60) not null,
    descricao varchar(255) not null,
    data_requisicao Date not null,
    data_apontamento Date not null
)