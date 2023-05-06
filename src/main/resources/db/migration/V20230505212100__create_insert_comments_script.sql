create table IF NOT EXISTS comments(
     id int not null primary key,
     id_user int not null,
     content varchar not null,
     date date not null,
     constraint fk1_id_user foreign key (id_user) references users(id)
);