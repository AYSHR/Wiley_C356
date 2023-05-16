use wileyclassic;

--  
explain select customername,customername from customers where customernumber in(select customernumber from customers);

--
explain select customername,customername from customers where exists (select 1 from orders where orders.customernumber=orders.customernumber);