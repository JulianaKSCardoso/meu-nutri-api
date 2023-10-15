create table avaliacao_fisica(

    id                  bigint(20) not null auto_increment,
    paciente_id         bigint(20) not null,
    data_avaliacao      date,
    peso                float,
    altura              float,
    braco_direito       float,
    braco_esquerdo      float,
    ombros              float,
    peitoral            float,
    cintura             float,
    abdomen             float,
    quadril             float,
    coxa_direita        float,
    coxa_esquerda       float,
    observacao          text,

    primary key (id),
    foreign key (paciente_id) references pacientes(id)
);
