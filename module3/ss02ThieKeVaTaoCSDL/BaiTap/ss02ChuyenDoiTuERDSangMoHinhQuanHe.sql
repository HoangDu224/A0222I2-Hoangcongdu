create database ss02ErdToTable;
use ss02erdtotable;
create table PhieuXuat(
SoPx varchar(20) primary key,
NgayXuat varchar(20)
);

create table VatTu(
MaVTU varchar(20) primary key,
TenVTU varchar(20)
);

create table PhieuNhap(
SoPN varchar(20) primary key,
NgayNhap varchar(20)
);

create table DonDH(
SoDH varchar(20) primary key,
NgayDH varchar(20)
);

create table NhaCC(
MaNCC varchar(20) primary key ,
TenNCC varchar(20),
DiaChi varchar(20)
);

create table SDTnhaCC(
id int primary key,
sdt varchar(10),
MaNCC varchar(20) ,
foreign key(MaNCC) references NhaCC(MaNCC)
);

create table ChiTietPhieuXuat(
SoPX varchar(20) ,
MaVTU varchar(20) ,
primary key(SoPX,MaVTU),
DGXuat varchar(20),
SLXuat varchar(20),
foreign key (SoPx) references PhieuXuat(SoPX),
foreign key (MaVTU) references VatTu(MaVTU)
);

create table ChiTietPhieuNhap(
MaVTU varchar(20),
SoPN varchar(20),
primary key(MaVTU,SoPN),
DGNhap varchar(20),
SLNhap varchar(20),
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoPN) references PhieuNhap(SoPN)
);

create table ChiTietDonDatHang(
MaVTU varchar(20),
SoDH varchar(20),
primary key (MaVTU,SoDH),
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoDH) references DonDH(SoDH)
);

alter table DonDH add constraint foreign key (MaNCC) references NhaCC(MaNCC)







