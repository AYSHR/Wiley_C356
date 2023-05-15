-- distinct 
select distinct status, count(status) from orders ;
-- output 
-- Shipped	326

-- group by
select  status, count(status) from orders group by status;
/* 
Shipped	303
Resolved	4
Cancelled	6
On Hold	4
Disputed	3
*/


-- 
select status, sum(quantityOrdered * priceEach) as amount from orders inner join orderdetails using(orderNumber)
group by status;  

--
select year(orderDate) as year,sum(quantityOrdered * priceEach)  as sales from orders inner join orderdetails using(orderNumber)  group by year;

--
select year(orderDate) as year,sum(quantityOrdered * priceEach)  as sales from orders inner join orderdetails using(orderNumber)  group by year having year >2003;

select year(orderDate) as year, count(orderNumber) as ordercount from orders group by year;
--
select status, count(status) as statuscount from orders group by status order by status desc;
--
