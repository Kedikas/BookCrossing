create table IF NOT EXISTS books(
                      id int not null ,
                      title varchar(256) not null,
                      description varchar(256) not null,
                      booked boolean not null,
                      rent int,
                      primary key (id)
);