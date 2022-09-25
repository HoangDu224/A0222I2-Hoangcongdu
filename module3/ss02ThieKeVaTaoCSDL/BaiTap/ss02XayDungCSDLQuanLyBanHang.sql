create database QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
cID varchar(10) primary key,
cName varchar(20),
cAge varchar(20)
);

create table `Order`(
oID varchar(10) primary key,
cID varchar(20),
oDate varchar(20),
oTotalPrice varchar(20),
foreign key (oID) references Customer(cID)
);

create table Product(
pID varchar(10) primary key,
pName varchar(20),
pPrice varchar(20)
);

create table OrderDetail(
oID varchar(10),
pID varchar(10),
primary key (oID,pID),
odQTY varchar (20),
foreign key (oID) references `Order`(oID),
foreign key (pID) references Product(pID)
);