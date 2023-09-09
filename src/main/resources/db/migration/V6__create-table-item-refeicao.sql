create table item_refeicao
(
    id              bigint(20) not null auto_increment,
    alimento        varchar(80),
    quantidade      integer not null,
    refeicao_id     bigint(20) not null,

    primary key (id),
    foreign key (refeicao_id) references refeicao(id)
);
