use dxcBank;

Drop table if exists users;

Create Table Users
(
   userName varchar(30) primary key,
   passCode varchar(30) NOT NULL
);

Insert into Users values('Abdul','Rahim'),
('Afrin','Mohammad'),('Narayani','Nathak'),
('Narendra','Arya');


select count(*) from users where username='Abdul' AND passCode='kkfkff';