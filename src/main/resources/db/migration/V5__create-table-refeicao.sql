create table refeicao
(
    id                  bigint(20) not null auto_increment,
    tipo_refeicao       varchar(50),
    plano_alimentar_id  bigint(20) not null,

    primary key(id),
    foreign key(plano_alimentar_id) references plano_alimentar(id)
);
