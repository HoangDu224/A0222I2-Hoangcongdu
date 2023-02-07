create database CaseStudy;
use CaseStudy;

-- Employee

create table position (
position_id int primary key auto_increment,
position_name varchar(45)
);

create table education_degree (
education_degree_id int primary key auto_increment,
education_degree_name varchar(45)
);

create table division (
division_id int primary key auto_increment,
division_name varchar(45)
);

create table `user` (
username varchar(255) primary key,
`password` varchar(255)
);

create table employee(
employee_id int primary key auto_increment,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int ,
education_degree_id int,
division_id int,
username varchar(255),
foreign key (position_id) references position (position_id),
foreign key (education_degree_id) references education_degree (education_degree_id),
foreign key (division_id) references division (division_id),
foreign key (username) references `user`(username)
);

create table role (
role_id int primary key auto_increment,
role_name varchar(255)
);

create table user_role (
role_id int ,
username varchar(255),
foreign key (role_id) references role (role_id),
foreign key (username) references user(username)
);

-- Customer
create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(45)
);
create table customer (
customer_id int primary key auto_increment,
customer_type_id int,
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
foreign key (customer_type_id) references customer_type(customer_type_id)
);
-- Service
create table service_type(
service_type_id int primary key auto_increment,
service_type_name varchar(45)
);

create table rent_type(
rent_type_id int primary key auto_increment,
rent_type_name varchar(45),
rent_type_cost double
);

create table service(
service_id int primary key auto_increment,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int ,
service_type_id int ,
stadard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floor int,
foreign key (service_type_id) references service_type(service_type_id),
foreign key (rent_type_id) references rent_type(rent_type_id)
);
-- Contract
create table contract(
contract_id int primary key auto_increment,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee (employee_id),
foreign key (customer_id) references customer (customer_id),
foreign key (service_id) references service (service_id)
);

create table attach_service(
attach_service_id int primary key auto_increment,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);

create table contract_detail(
contract_detail_id int primary key auto_increment,
contract_id int ,
attach_service_id int,
quantity int,
foreign key (contract_id) references contract (contract_id),
foreign key (attach_service_id) references attach_service(attach_service_id)
);

-- Nhập dữ liệu

insert into position (position_name)
values ('Lễ tân'), ('Phục vụ'), ('Chuyên viên'), ('Giám sát'), ('Quản lý'), ('Giám đốc');
select * from position;
insert into education_degree (education_degree_name)
values ('Trung cấp'), ('Cao đẳng'), ('Đại học'), ('Sau đại học');

insert into division (division_name)
values ('Sale - Marketing'), ('Hành chính'), ('Phục vụ'), ('Quản lý');

insert into `user`(username, `password`)
values ('employee1', 'employee'),
		('employee2', 'employee'),
        ('employee3', 'employee'),
        ('employee4', 'employee'),
        ('customer1', 'customer'),
        ('customer2', 'customer'),
        ('customer3', 'customer'),
        ('customer4', 'customer');
        
insert into role (role_name)
values ('Lễ tân'), ('Phục vụ'), ('Chuyên viên'), ('Giám sát'), ('Quản lý'), ('Giám đốc');

insert into user_role(role_id, username)
values (1, 'employee1'),
		(2,'employee2'),
        (3,'employee3'),
        (6,'employee4');


insert into employee (
employee_name,
employee_birthday,
employee_id_card,
employee_salary,
employee_phone,
employee_email,
employee_address,
position_id,
education_degree_id,
division_id
)
values ('Nguyễn Văn An', '1970-11-07',	'456231786', 10000000, '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng',	1, 3, 1),
       ('Lê Văn Bình', '1997-04-09', '654231234', 7000000, '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2),
       ('Hồ Thị Yến', '1995-12-12', '999231723', 14000000, '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2),
       ('Võ Công Toản', '1980-04-04', '123231365', 17000000, '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4, 4);
       
insert into customer_type (customer_type_name)
values ('Diamond'), ('Platinium'), ('Gold'), ('Silver'), ('Member');

insert into customer (
customer_type_id,
customer_name,
customer_birthday ,
customer_gender ,
customer_id_card ,
customer_phone ,
customer_email ,
customer_address)
values (5, 'Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng'),
	   (3, 'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị'),
       (1, 'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh'),
       (1, 'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng'),
       (4, 'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai'),
       (4, 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng');
      
insert into service_type (service_type_name)
values ('Villa'), ('House'), ('Room');
insert into rent_type (rent_type_name,rent_type_cost)
values ('Year',10000), ('Month',5000), ('Day',1000), ('Hour',100);
insert into service (
service_name ,
service_area ,
service_cost ,
service_max_people ,
rent_type_id  ,
service_type_id  ,
stadard_room ,
description_other_convenience ,
pool_area ,
number_of_floor 
)
values ('Villa Beach Front', 25000, 10000000, 10, 3, 1, 'vip', 'Có hồ bơi', 500, 4),
       ('House Princess 01', 14000, 5000000, 7, 2, 2, 'vip', 'Có thêm bếp nướng', null, 3),
       ('Room Twin 01', 5000, 1000000, 2, 4, 3, 'normal', 'Có tivi', null, null),
       ('Villa No Beach Front', 22000, 9000000, 8, 3, 1, 'normal', 'Có hồ bơi', 300, 3),
       ('House Princess 02', 10000, 4000000, 5, 3, 2, 'normal', 'Có thêm bếp nướng', null, 2),
       ('Room Twin 02', 3000, 900000, 2, 4, 3, 'normal', 'Có tivi', null, null);
       
insert into attach_service (
attach_service_name ,
attach_service_cost ,
attach_service_unit ,
attach_service_status)
values ('Karaoke', 10000, 1, 'tiện nghi, hiện tại'),
       ('Thuê xe máy', 10000, 2, 'hỏng 1 xe'),
       ('Thuê xe đạp', 20000, 3, 'tốt'),
       ('Buffet buổi sáng', 15000, 4, 'đầy đủ đồ ăn, tráng miệng'),
       ('Buffet buổi trưa', 90000, 5, 'đầy đủ đồ ăn, tráng miệng'),
       ('Buffet buổi tối', 16000, 6, 'đầy đủ đồ ăn, tráng miệng');
       

insert into contract (
contract_start_date ,
contract_end_date ,
contract_deposit ,
contract_total_money ,
employee_id ,
customer_id ,
service_id 
)
values ('2020-12-08', '2020-12-08', 0,999999, 1, 1, 3),
       ('2020-07-14', '2020-07-21', 200000,999999, 1, 3, 1),
       ('2021-03-15', '2021-03-17', 50000,999999, 3, 4, 2),
       ('2021-01-14', '2021-01-18', 100000,999999, 2, 4, 5),
       ('2021-07-14', '2021-07-15', 0,999999, 2, 2, 6),
       ('2021-06-01', '2021-06-03', 0,999999, 4, 4, 6),
       ('2021-09-02', '2021-09-05', 100000,999999, 2, 4, 4),
       ('2021-06-17', '2021-06-18', 150000,999999, 1, 4, 1),
       ('2020-11-19', '2020-11-19', 0,999999, 4, 4, 3);
       
insert into contract_detail (
contract_id  ,
attach_service_id ,
quantity )
values (1, 4, 5), (2, 5, 8), (2, 5, 15), (8, 1, 1), (2, 2, 11), (6, 3, 1), (6, 2, 2), (5, 2, 2);
SET FOREIGN_KEY_CHECKS=0;
 delete from customer where customer_id = 1;
 update customer set customer_type_id = ? , customer_name = ? , customer_birthday = ? , customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ? where customer_id = ?;
 select * from customer where customer_name like '%h' and customer_phone like ?  and customer_address like ? ;