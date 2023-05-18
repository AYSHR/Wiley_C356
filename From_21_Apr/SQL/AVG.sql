-- avg queries

SELECT 
    AVG(buyPrice) AS 'Average Price of classic cars'
FROM 
    products
WHERE
    productLine= 'Classic Cars';


-- FORMAT UPTO 2 DCECIMAL PLACES
SELECT 
    FORMAT(AVG(buyPrice), 2) AS 'Average Price of classic cars' 
FROM 
    products;
    
    
   -- 
   SELECT 
    productLine,
    AVG(buyPrice) AS 'Average Price' 
FROM 
    products
GROUP BY productLine
HAVING AVG(buyPrice) > 50;

--
-- Q.CALCULATE the average buy price of the average buy prices of product lines;

SELECT AVG(avg_price) AS 'AVERAGE PRICE'
 FROM 
(  SELECT AVG(buyprice) AS avg_price 
FROM products 
GROUP BY productline
)avgtable;

--
-- Q. pl_avg,:- 45, 67, 56, NULL, 45, 89
SELECT
    AVG( IF(productLine = 'Classic Cars', 
            buyPrice, 
            NULL)) / AVG(buyPrice) 'Classic Cars / Products' 
FROM 
    products;
    
    
    -- case if , ifnull
    
    SELECT
    AVG( IFNULL(productLine = 'Classic Cars', 
            buyPrice )) / AVG(buyPrice) 'Classic Cars / Products' 
FROM 
    products;
--

--

