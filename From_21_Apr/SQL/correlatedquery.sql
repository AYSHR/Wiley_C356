-- query to extract the values 
 select productName, buyPrice 
 from products p1
 where 
 buyprice > (
 select avg(buyprice) from products where productline =p1.productLine
 );
 
 --
 select ordernumber, sum(priceEach * quantityordered) from orders inner join orderdetails using(ordernumber) group  by ordernumber having  sum(priceEach * quantityordered) > 6000;
 
 --
 select  customernumber, customername from customers c where exists ( 
 select ordernumber, sum(priceEach * quantityordered) 
 from orders inner join orderdetails using(ordernumber)
 where customerNumber=c.customerNumber
 group  by ordernumber
 having  sum(priceEach * quantityordered) > 6000
 );
 
 select productname, sales
 from 
 (
 select productcode, round(sum(quantityordered*priceEach) sales
 from  orderdetails
 inner join orders using(ordernumber)
 where 
 year(shippeddate)=2003
 group by
 productcode
 order by 
 sales desc 
 limit 5
 ) top5product
 inner join product using(product code);
 
 
 --
 select customergroup, count(cg.customergroup) as groupcount
 from
 (select  customernumber, round(sum(quantityordered*priceeach)) sales , (
 case
   when sum(quantityordered*priceeach)< 10000 then "silver" 
   when sum(quantityordered*priceeach) between 10000 and 100000 then "gold"
   when sum(quantityordered*priceeach) > 100000 then "platinum"
   end) customergroup
   from orderdetails
   inner join orders using(ordernumber)
   where year(shippedDate)=2003
   group by customernumber
   )cg
   group by cg.customergroup;
   
   
   -- atleast one order
   
   select customername from customers where exists(
     select sum(ordernumber) as ordercount 
     from orderdetails
     group by ordernumber
     having ordercount>=1
   );
   
   -- not ordered anything
   select customername from customers where  exists(
     select sum(ordernumber) as ordercount 
     from orderdetails
     group by ordernumber
     having ordercount=0
   );
   
   --
   update employees  set extension=concat(extension,'1')
   where exists(
   select 1 from offices  where city='San Francisco' and offices.officeCode=employees.officeCode
   );
   
   -- 
   select employeenumber , extension from employees where exists(
   select 1 from offices  where city='San Fransisco' 
   );
   
   -- 
   delete from customers
   where exists(
   select 1
   from customerarchive a
   where a.customernumber=customers.customernumber
   );
   
   --
 insert into customerarchive
select * from customers
where not exists(
 select 1 from orders where orders.customernumber=customers.customernumber);
    