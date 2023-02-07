create database demo;
use demo;

create table users (
id int(3) NOT NULL AUTO_INCREMENT,
name varchar(120) NOT NULL,
email varchar(220) NOT NULL,
country varchar(120),
primary key (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
insert into users(name, email, country) values('Hon','hon@che.uk','vietnam');

select * from users;
update users
set name = 'hai' , email = 'ba@gmail.com' ,country = 'bali'
where id = 2;
select * from users order by name;
select * from users where country like 'vie%';