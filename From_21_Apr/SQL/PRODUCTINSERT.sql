USE wileyclassic;
/*
create table supplierproducts
( supplierid int,
 productid int,
 primary key(supplierid, productid));
 */
DELIMITER $$

CREATE PROCEDURE insertproduct(
   IN insupplierid INT,
   IN inproductid INT
)
BEGIN 
  DECLARE supplierid INT;
  DECLARE productid INT;
  
  DECLARE EXIT HANDLER FOR 1062
  BEGIN
    SELECT CONCAT('found (', supplierid, ',', productid, ')');
  END;

  -- INSERTING NEW ROW
  INSERT INTO supplierproducts VALUES (insupplierid, inproductid);

  -- return value
  SELECT COUNT(*) INTO supplierid
  FROM supplierproducts
  WHERE supplierid = insupplierid;

  SELECT supplierid;

END $$

DELIMITER ;


CALL insertproduct(1,1);
CALL insertproduct(1,2);
-- print error msg
CALL insertproduct(1,1);



--



     