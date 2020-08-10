drop database if exists dxchib;

create database dxchib;

use dxchib;

drop table if exists Address;

Create Table Address
(
    addressId INT Primary Key AUTO_INCREMENT,
    addressLine1 varchar(30),
    city varchar(30),
    state varchar(30),
    country varchar(30),
    pincode INT
);

insert into address(Addressline1,city,state,country,pincode) values('37-114','Secunderabad','TS','India',44422),
						  ('8-5/3-2','Delhi','UP','India',32233),
                          ('Sterling Heights','Detroit','MI','USA',35666);
                          
                          
select * from Address;              

drop table if exists employee;

Create Table Employee
(
    employeeId INT Primary Key AUTO_INCREMENT,
    name varchar(30),
    email varchar(30),
    addressId INT REFERENCES Address(addressId)
);            

Insert into Employee(name,email,addressId) values('ram','ram@gmail,com',1),
('kishan','kishan@gmail.com',3),('rafiq','Rafiq@gmail.com',2);

drop table if exists question;

Create Table Question
(
    Id INT Primary Key AUTO_INCREMENT,
    Qname varchar(30)
);

Insert into Question(Qname) values('What is OOPs'),('What is Java');

Drop Table If Exists Answer;

Create Table Answer
(
   Id INT Primary Key AUTO_INCREMENT,
   AnswerName varchar(100),
   PostedBy varchar(30),
   Qid INT References Question(ID),
   Type INT 
);

Insert into Answer(Answername,postedby,qid,type) values('Object Oriented Programming','Prasanna',1,1),
		('Java is Good Programming Language','Sikindar',2,1),
        ('Its Programming Language','Prasanna',2,0),
        ('Dotnet is also OOPS','Sikindar',1,0);