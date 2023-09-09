create table pacientes
(
  id            bigint not null auto_increment,
  dt_cadastro   date,
  nome          varchar(100) not null,
  dt_nascimento date not null,
  genero        varchar(20) not null,
  cpf           varchar(11) not null,
  telefone      varchar(20) not null,
  email         varchar(100) not null unique,
  logradouro    varchar(100)  not null,
  bairro        varchar(100) not null,
  cep           varchar(9) not null,
  complemento   varchar(100),
  numero        varchar(20),
  uf            varchar(2) not null,
  cidade        varchar(100) not null,
  observacao    text,

  primary key(id)
);
