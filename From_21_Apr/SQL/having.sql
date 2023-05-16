
-- use of having 
select orderNumber, SUM(quantityOrdered) as itemcount, SUM(quantityOrdered*priceEach) as totalsale from orderDetails group by ordernumber having totalsale>1000 AND itemcount>600 limit 25;

select orderNumber, SUM(quantityOrdered) as itemcount, SUM(quantityOrdered*priceEach) as totalsale from orderDetails group by ordernumber;

-- both will yield same result
select orderNumber,status , SUM(quantityOrdered*priceEach) as totalsale from orders inner join orderDetails using(orderNumber) where status="shipped" group by  ordernumber having  totalsale>1000 limit 20;

select orderNumber,status , SUM(quantityOrdered*priceEach) as totalsale from orderDetails inner join orders using(ordernumber) group by ordernumber,status having status="shipped" and totalsale>1000 limit 20;


-- creating a table from an existing table
create table sales
  select ordernumber, year(orderdate) year, SUM(quantityOrdered*priceEach) as totalsale
  from orderdetails 
  inner join
      orders using(ordernumber)
   group by 
    ordernumber, year;
    
    -- 
    create table productsales
  select productline, year(orderdate) year, SUM(quantityOrdered*priceEach) as totalsale
  from orders 
  inner join
      products using(productcode)
   group by 
    productlin, year;
    
    
  -- grouping set
  select ordernumber, sum(orderValue) totalordervalue from sales group by ordernumber;
  
  
  -- ROLL UP CONCEPT
  select ordernumber, sum(totalsale) totalordervalue from sales group by ordernumber with rollup;
  
  select ordernumber,year , sum(totalsale) totalordervalue from sales group by ordernumber, year with rollup;
  
  select year , ordernumber,sum(totalsale) totalordervalue from sales group by year, ordernumber with rollup;
    
