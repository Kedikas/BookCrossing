create table users(
    id int not null ,
    name varchar not null,
    surname varchar not null,
    username varchar not null,
    password varchar not null,
    primary key (id)
);
create table books(
     id int not null ,
     title varchar(256) not null,
     description varchar(256) not null,
     booked boolean not null,
     rent int,
     primary key (id)
);
create table booking(
      id int not null ,
      id_book int not null,
      id_user int not null,
      date_taken date not null,
      date_given date not null,
      constraint id primary key (id),
      foreign key (id_book) references books(id),
      foreign key (id_user) references users(id)
);
create table comments(
    id int not null primary key,
    id_user int not null,
    content varchar not null,
    date date not null,
    constraint id primary key (id),
    foreign key (id_user) references users(id)
);
