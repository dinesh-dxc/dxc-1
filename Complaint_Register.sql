drop database if exists dxccomplaint;

create database dxccomplaint;

use dxccomplaint;

-- complaint type (Keyboard/mouse/network/permission)  put dropdown
-- severity as 1 or 2 or 3 or 4 1 means critical 2 means imp 3 means can be delayed 4 means 
-- no problem if not resolved 
-- Cstatus 'PENDING' by default
Create Table Complaint
(
    complaintId INT AUTO_INCREMENT PRimary Key,
    ComplaintType varchar(30),
    Description varchar(30),
    CDate Date,
    Tat INT,
    Severity INT,
    Cstatus varchar(30) DEFAULT 'PENDING'
);

-- RegisterComplaint
-- SearchComplaint 
Create Table Resolve
(
    Rid INT AUTO_INCREMENT Primary Key,
	ComplaintID INT REFERENCES Complaint(ComplaintId),
    ResolvedBy varchar(30),
    RComments varchar(30)
);


-- Once resolved that record Cstatus to be changed as 'RESOLVED'
