use wileyclassic;

-- $$
DELIMITER //  CREATE PROCEDURE getcustomer() begin
 select customername, state , city
  from customers;
end //
delimiter;


call getcustomer();

--
  DELIMITER $$
CREATE PROCEDURE getProducts()
BEGIN
  SELECT *
  FROM products;
END $$
DELIMITER ;

CALL getproducts();

--
DELIMITER //
CREATE PROCEDURE getcustomer()
BEGIN
  SELECT customername, state, city
  FROM customers;
END //
DELIMITER ;

--
--
DELIMITER $$
USE `WILEYCLASSIC` $$
 CREATE PROCEDURE getprod()
  BEGIN
      SELECT *
  FROM products;
END $$
DELIMITER ;

--
CALL getprod();
--
-- delete procedure
DROP PROCEDURE IF EXISTS getprod;

--
-- input and output
 DELIMITER $$
USE `WILEYCLASSIC` $$
CREATE PROCEDURE getcount(IN orderstatus VARCHAR(255), OUT total INT)
BEGIN
  SELECT COUNT(ordernumber)
  INTO total
  FROM orders
  WHERE orderstatus = orderstatus;
END $$
DELIMITER ;

 

-- 
-- CALL getcount('Shipped', @total);
CALL getcount('in process', @total);
SELECT  @totaL AS total_in_process;

--





-- to list all procedures
 SHOW PROCEDURE STATUS; 

SHOW PROCEDURE STATUS WHERE db='wileyclassic'; 

SHOW PROCEDURE STATUS LIKE '%order%';

--
DELIMITER $$
CREATE PROCEDURE getofficesbycountry(IN countryname VARCHAR(255))
BEGIN
  SELECT *
  FROM offices
  WHERE country=coutryname;
END $$
DELIMITER ;
 
 --
 CALL getofficesbycountry('FRANCE');
 
 --
 