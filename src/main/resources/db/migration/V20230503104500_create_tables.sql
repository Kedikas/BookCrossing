CREATE TABLE book (
                          id bigint(20) NOT NULL AUTO_INCREMENT,
                          title varchar(256) NOT NULL,
                          description varchar(256) NOT NULL,
                          booked bit NOT NULL,
                          rent int,
                          PRIMARY KEY (id),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE comments (
                      id bigint(20) NOT NULL AUTO_INCREMENT,
                      content varchar(256),
                      date date NOT NULL,
                      booked bit NOT NULL,
                      rent int,
                      PRIMARY KEY (id),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;