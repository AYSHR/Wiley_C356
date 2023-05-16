-- sub query
 select customerNumber, checkNumber, amount from payments where amount >(select avg(amount) from payments);
 
 -- for max
 select customerNumber, checkNumber, amount from payments where amount = (select max(amount) from payments);
 
 -- cutomers who have not palced an order
 select customerName from customers where customerName NOT IN ( select distinct customerNumber from orders);
 
 -- max,min ,avg no of items
 select max(items),min(items),floor(avg(items) ) from (select orderNumber, count(ordernumber) as items from orderdetails group by orderNumber) as lineitems;
 
 --
 select ordernumber, sum(totalsale) totalordervalue from sales group by ordernumber
union all
select
null, sum(totalsale) totalordervalue from sales;