CREATE TABLE usuario(
    id bigint not null auto_increment,
    email varchar(100) not null,
    senha varchar(60) not null,
    primary key(id)
);

INSERT INTO USUARIO (id, email, senha) VALUES
(null, 'jean@gmail.com','123456'),
(null,'mabisousa@gmail.com','123456'),
(null,'robertapolez@gmail.com','123456');

CREATE TABLE role(
    nome_role varchar(45) not null,
    primary key(nome_role)
);

INSERT INTO ROLE VALUES('ROLE_FORNECEDOR');
INSERT INTO ROLE VALUES('ROLE_CONSULTOR');

create table role_usuarios(
    usuarios_id bigint not null,
    role_nome_role varchar(45) not null
);
INSERT INTO ROLE_USUARIOS (usuarios_id, role_nome_role) VALUES
(1, 'ROLE_FORNECEDOR'),
(2, 'ROLE_FORNECEDOR'),
(3,'ROLE_CONSULTOR');

ALTER TABLE role_usuarios ADD CONSTRAINT fk_usuarios
FOREIGN KEY(usuarios_id) REFERENCES usuario(id);

ALTER TABLE role_usuarios ADD CONSTRAINT fk_role
FOREIGN KEY(role_nome_role) REFERENCES role(nome_role);

alter TABLE consultores ADD CONSTRAINT fk_usuario_consultor FOREIGN KEY (user_id) REFERENCES usuario(id);