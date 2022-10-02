create database demo;
use demo;

create table Product (
id int,
productCode varchar(20),
productName varchar(20),
productPrice varchar(20),
productAmount varchar(20),
productDescription varchar(20),
productStatus varchar(20)
);

insert into Product
values (1, 'A1', 'Apple', '1000', '5', 'Iphone14', '1'),
       (2, 'S1', 'Samsung', '1000', '5', 'samsung14', '0'),
       (3, 'X1', 'Xiaomi', '1000', '5', 'Xiaomi', '1'),
       (4, 'N1', 'Nokia', '1000', '5', 'Nokia', '0'),
       (5, 'V1', 'Vphone', '1000', '5', 'Vphone', '1');

alter table Product add index Unique_Index(productCode);
alter table Product add index Composite_Index(productName, productPrice);
alter table Product drop index Unique_Index;
alter table Product drop index Composite_Index;
explain select * from product s where s.productCode = 'S1';

-- -------------------------
create view product_view as
select productCode, productName, productPrice, productStatus
from Product;

select * from product_view;

create or replace view product_view as
select productCode, productName, productPrice, productStatus
from Product p
where p.productName = 'Xiaomi';

drop view product_view;

-- --------------------------
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product.
delimiter //
create procedure findAllProduct()
Begin
select * from Product;
End //
delimiter ;
call findAllProduct;

-- Tạo store procedure thêm một sản phẩm mới.
delimiter //
create procedure addNewProduct(IN p_id int, IN p_productCode varchar(20), IN p_productName varchar(20))
Begin
insert into Product(id ,productCode, productName)
values (p_id, p_productCode, p_productName);
End //
delimiter ;

-- Tạo store procedure sửa thông tin sản phẩm theo id.
delimiter //
create procedure editProduct (p_id int ,IN p_productCode varchar(20), IN p_productName varchar(20))
Begin
update Product p
set p.productCode = p_productCode,
    p.productName = p_productName
where p.id = p_id;
End //
delimiter ;
call editProduct (2, 'AAA', 'AAA');

-- Tạo store procedure xoá sản phẩm theo id.
delimiter //
drop procedure deleteProduct;
create procedure deleteProduct (p_id int )
Begin
delete
from Product p
where p.id = p_id;
End //
delimiter ;
call deleteProduct(null);
select * from Product;