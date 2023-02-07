
use thimodule;

create table sach (
masach int primary key auto_increment,
tensach varchar(45),
tacgia varchar(45),
mota varchar(45),
soluong int (45)
);

create table hocsinh(
mahocsinh int primary key auto_increment,
hoten varchar(45),
lop varchar(45)
);

create table themuonsach(
mamuonsach varchar(45) primary key ,
masach int ,
mahocsinh int,
trangthai bit(1),
ngaymuon date,
ngaytra date,
foreign key (masach) references sach (masach),
foreign key (mahocsinh) references hocsinh (mahocsinh)
);

insert into sach (tensach , tacgia , mota , soluong)
values ('de' , 'ba' , 'sachh', 3),
	   ('thi' , 'ba' , 'sachh', 3),
       ('thuc' , 'ba' , 'sachh', 3);
insert into hocsinh (hoten, lop)
values ('Hoang','A0222'),
       ('huy','A0222'),
       ('Hoan','A0222'),
       ('Hon','A0222');
       SELECT * FROM hocsinh;
insert into themuonsach (mamuonsach,masach,mahocsinh,trangthai,ngaymuon,ngaytra)
values (?,?,?,?,?,?)