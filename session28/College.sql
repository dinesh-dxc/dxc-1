drop database if exists college;

create database college;

use college;

create table CourseList
(
    courseNo varchar(30) Primary Key,
    duration INT,
    startDate Date,
    endDate Date,
    hod varchar(30)
);

select * from CourseList;

Drop Table If Exists Subject;

Create Table Subject
(
   subId INT Primary key AUTO_INCREMENT,
   acYear INT,
   instructor varchar(30),
   topic varchar(30),
   theory INT,
   practical INT
);  

select * from subject;

Drop Table If Exists feedback;

Create Table Feedback
(
   fid varchar(30) Primary Key,
   studentName varchar(30),
   instructor varchar(30),
   subject varchar(30),
   fbvalue varchar(30)
);
