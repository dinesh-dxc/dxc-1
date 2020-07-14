use dxc

-- Display the list of tables in current database 

show tables;

-- Display information about Emp table 

DESC Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno, ename, Sal from Emp table 


SELECT
	Empno,
    Ename,
    Sal
FROM EMP;


-- WHERE Clause : Used to display the filtered records 


-- Display all records whose sal > 2000


select * from Emp 
WHERE SAL > 2000;

-- Display all records whose job is 'manager' 

select * from Emp 
where JOB='Manager';

-- Display information whose ename is 'KING' 

select * from Emp
WHERE ENAME='KING'; 

-- BETWEEN...AND : Used to display reordsd wrt Start...End 

SELECT * FROM EMP
WHERE SAL BETWEEN 1000 AND 3000;

SELECT * FROM EMP 
WHERE SAL NOT BETWEEN 1000 AND 3000;

select * from EMP
WHERE HIREDATE BETWEEN '1980-01-01' AND '1981-12-12';


select * from EMP
WHERE NOT HIREDATE BETWEEN '1980-01-01' AND '1981-12-12';

-- IN Clause : Used to display specific column records 


-- Display all records whose job is CLERK OR ANALYST 

SELECT * FROM EMP 
WHERE JOB IN('CLERK','ANALYST','MANAGER');

SELECT * FROM EMP 
WHERE JOB NOT IN('CLERK','ANALYST');


-- Like : Used to display data w.r.t. Wildcards 

-- Display all records whose name starts with 's' 

select * from Emp where ENAME LIKE 'S%';

-- DISPLAY All records whose name ends with 'G' 

SELECT * FROM EMP WHERE ENAME LIKE '%G';



