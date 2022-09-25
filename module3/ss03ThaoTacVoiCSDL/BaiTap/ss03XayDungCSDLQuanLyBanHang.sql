create database QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
cID int primary key,
cName varchar(25),
cAge tinyint
);

create table `Order`(
oID int primary key,
cID int,
oDate datetime,
oTotalPrice int,
foreign key (oID) references Customer(cID)
);

create table Product(
pID int primary key,
pName varchar(25),
pPrice int
);

create table OrderDetail(
oID int,
pID int,
primary key (oID,pID),
odQTY int,
foreign key (oID) references `Order`(oID),
foreign key (pID) references Product(pID)
);

-- Thêm dữ liệu vào bảng

insert into Customer(cID, cName, cAge)
values (1, 'Minh Quan', 10),
	   (2, 'Ngoc Oanh', 20),
       (3, 'Hong Ha', 50);
       
insert into `Order` (oID, cID, oDate)
values (1, 1, '2016-3-21'),
       (2, 2, '2016-3-23'),
       (3, 1, '2016-3-16');
       
insert into Product (pID, pName, pPrice)
values (1, 'May Giat', 3),
	   (2, 'Tu Lanh', 5),
       (3, 'Dieu Hoa', 7),
       (4, 'Quat', 1),
       (5, 'Bep Dien', 2);
       
insert into OrderDetail (oID, pID, odQTY)
values (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
       (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);
       
-- Truy Xuất Dữ Liệu
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order.
select* from `Order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách.
select c.cName, p.pName
from Customer c join `Order` o on c.cID = o.cID join OrderDetail od on o.oID = od.oID join Product p on od.pID = p.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào.
select c.cName
from Customer c left join `Order` o on c.cID = o.cID left join OrderDetail od on o.oID = od.oID left join Product p on od.pID = p.pID
where o.cID is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.oID, o.oDate, sum(p.pPrice * od.odQTY) as giaban
from `Order` o 
inner Join OrderDetail od on o.oID = od.oID
inner join Product p on od.pID = p.pID
group by o.oID;