create table IF NOT EXISTS booking(
    id int not null primary key,
    id_book int not null,
    id_user int not null,
    date_taken date not null,
    date_given date not null,
    constraint fk_id_book foreign key (id_book) references books(id),
    constraint fk_id_user foreign key (id_user) references users(id)
);