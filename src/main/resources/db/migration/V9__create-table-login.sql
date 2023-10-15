create table login(
    id          bigint not null auto_increment,
    email       varchar(100) not null unique,
    password    text not null,
    role        text not null,

    primary key (id)
);
