create table if not exists car (
id int auto_increment primary key,
name varchar(255),
colour varchar(255),
year_of_construction int
);
create table if not exists bike (
id int auto_increment primary key,
name varchar(255),
year_of_construction int
);