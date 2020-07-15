create database dxcbank;

use dxcbank;

Create Table Account
(
   AccountNo INT primary key,
   FirstName varchar(30),
   LastName varchar(30),
   City varchar(30),
   State varchar(30),
   Amount INT,
   CheqFacil varchar(10),
   AccountType varchar(20),
   Status varchar(10) default 'active',
   DateOfOpen TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

Create Table AccountTransaction
(
      AccountNo int,
      TranAmount numeric(9,2),
      TranDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      TranType varchar(10)
);

