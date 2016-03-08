
CREATE TABLE customer (
  id int(11) NOT NULL AUTO_INCREMENT,
  city varchar(255) DEFAULT NULL,
  firstName varchar(255) DEFAULT NULL,
  lastName varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE orders (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  customer_id int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK_astys1dv61mdlp0n0wx0574r2 (customer_id),
  CONSTRAINT FK_astys1dv61mdlp0n0wx0574r2 FOREIGN KEY (customer_id) REFERENCES customer (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into customer(firstName, lastName, city) values ('Ruben', 'Alfaro', 'Albacete');
insert into customer(firstName, lastName, city) values ('Diego', 'Peña', 'Un pueblo asi muy apartao');
insert into customer(firstName, lastName, city) values ('Sabri', 'Cotta', 'Al lao Diego');

insert into orders(name, customer_id) values ('Order 1', 1);
insert into orders(name, customer_id) values ('Order 2', 1);
insert into orders(name, customer_id) values ('Order 3', 1);
insert into orders(name, customer_id) values ('Order 5', 2);
insert into orders(name, customer_id) values ('Order 6', 2);
insert into orders(name, customer_id) values ('Order 7', 3);
insert into orders(name, customer_id) values ('Order 8', 3);
COMMIT ;


