 -- show databases;
 
 use wileyclassic;
 
select * from customers;

select contactLastName, contactFirstName from customers order by contactLastName desc, contactFirstName asc limit 5;

select orderNumber, orderlinenumber, quantityOrdered * priceEach as subtotal from orderdetails order by subtotal desc limit 5;

 select orderNumber, orderlinenumber, quantityOrdered * priceEach as subtotal from orderdetails group by orderNumber order by subtotal  limit 5;
 
 -- field function
 select
     orderNumber,
    status
from
    orders
order by field(status,"In process","on hold","cancelled","resolved","disputed","shipped");

-- 
select lastName, firstName, jobTitle from employees where jobTitle="Sales Rep" and officeCode=1 order by lastName;

--
select firstName from employees where lastName like "%son" order by firstName;

--
 select * from employees where lastName like "%son" order by firstName and officeCode between 1 and 3;
 
 --
 select distinct state, city from customers where state is not null order by state ;
 
 --
 
 select customerName, country,state, creditLimit from customers where country="USA" AND state="CA" AND creditLimit>100000;
 
 --
 