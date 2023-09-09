create table plano_alimentar
(
    id                  bigint not null auto_increment,
    observacao          varchar(300),
    paciente_id         bigint not null,
    nutricionista_id    bigint not null,



    primary key(id)
);
