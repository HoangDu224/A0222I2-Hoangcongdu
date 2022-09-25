create database ss02QuanLyDiemThi;
use ss02QuanLyDiemThi;
create table HocSinh(
MaHS varchar(50) PRIMARY KEY ,
TenHS varchar(50),
NgaySinh date,
Lop varchar(50),
GioiTinh varchar(50));

create table MonHoc(
MaMH varchar(50) PRIMARY KEY,
TenMH varchar(50),
MaGV varchar(50));

create table BangDiem(
	MaHS varchar(50),
	MaMH varchar(50),
	DiemThi int,
	NgayKT date,
	PRIMARY KEY (MaHS, MaMH),
	FOREIGN KEY (MaHS) REFERENCES HocSinh(MaHS),
	FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
    );
    
create table GiaoVien(
MaGV varchar(50) PRIMARY KEY,
TenGV varchar(50),
SDT varchar(10));

ALTER TABLE MonHoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);