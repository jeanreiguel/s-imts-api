CREATE TABLE fornecedor_responsaveis (
    id bigint not null auto_increment,
    id_fornecedor bigint not null,
    nome varchar(50) not null,
    user_id bigint,
    primary key(id)
);
alter TABLE fornecedor_responsaveis ADD CONSTRAINT fk_usuario_responsavel FOREIGN KEY (user_id) REFERENCES usuario(id);

INSERT INTO fornecedor_responsaveis (id, id_fornecedor, nome, user_id) VALUES
(null,1, 'Jean Reiguel',1),
(null,2,'Maria Gabriela',2);