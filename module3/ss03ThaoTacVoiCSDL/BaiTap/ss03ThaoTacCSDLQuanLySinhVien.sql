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
-- lấy dữ liệu học viên từ bảng Student để hiển thị danh sách tất cả các học viên
select* from Student;

-- Hiển thị danh sách các học viên đang theo học.
select* from Student where Status = true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select* from `Subject` where Credit <10;

-- Hiển thị danh sách học viên lớp A1
select* from Student s join Class c on s.ClassID = c.ClassID where c.ClassName ='A1';

-- Hiển thị điểm môn CF của các học viên.
select s.StudentID, s.StudentName, sub.SubName, m.Mark
from Student s join Mark m on s.StudentID = m.StudentID join Subject sub on m.SubID = sub.SubID
where sub.SubName ='CF';

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’.
select*
from Student s 
where s.StudentName like 'H%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select*
from Class
where month(StartDate) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select sub.SubID, sub.SubName, sub.Credit, sub.Status
from Subject sub join Mark m on sub.SubID = m.SubID
where sub.Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update Student
set ClassID = '2'
where StudentName like 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark.
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select s.StudentName , sub.SubName , m.Mark
from Student s join Mark m on s.StudentID = m.StudentID join Subject sub on sub.SubID = m.SubID
order by m.Mark desc , s.StudentName asc;
SET SQL_SAFE_UPDATES = 0;