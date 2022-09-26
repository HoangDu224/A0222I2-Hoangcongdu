create database QuanLySinhVien;
use QuanLySinhVien;

create table Class(
ClassID int not null auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
`Status` bit
);

create table Student(
StudentID int not null auto_increment primary key,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
`Status` bit,
ClassID int not null,
foreign key (ClassID) references Class(ClassID)
);

create table `Subject`(
SubID int not null auto_increment primary key ,
SubName varchar (30) not null,
Credit tinyint not null default 1 check (Credit>=1),
`Status` bit default 1
);

create table Mark(
MarkID int not null auto_increment primary key ,
SubID int not null ,
StudentID int not null,
unique (SubID, StudentID),
Mark float default 0 check (Mark between 0 and 100),
ExamTimes tinyint default 1,
FOREIGN KEY (SubId) REFERENCES Subject (SubId),
FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);

-- Thêm dữ liệu vào trong cơ sở dữ liệu quản lý sinh viên

-- Thêm dữ liệu vào bảng Class
insert into Class
values (1,'A1','2012-11-20',1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

-- Thêm dữ liệu vào bảng Student
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Anh Hoa', 'Da nang', '0912113123', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

-- Thêm dữ liệu vào bảng Subject
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
-- Thêm dữ liệu vào bảng Mark
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
-- Truy vấn dữ liệu CSDL quản lý sinh viên
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from `Subject` s
order by s.Credit desc limit 1;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.SubID , s.SubName, s.Credit, s.Status
from `Subject` s join Mark m on s.SubID = m.SubID
order by m.Mark desc limit 1;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần.
select s.StudentID, s.StudentName, s.Address, s.Phone, s.Status, s.ClassID, avg(m.Mark) as DiemTrungBinh
from Student s join Mark m on s.StudentID = m.StudentID
GROUP BY s.StudentId
order by avg(m.Mark) desc;
