USE wileyclassic;
--
DELIMITER $$
CREATE PROCEDURE seTCOUNTER(INOUT counter INT, IN inc INT)
BEGIN
  SET counter = counter + inc;
END $$
DELIMITER ;

  
  SET @COUNTER=1;

CALL seTCOUNTER(@counter, 1); 
CALL seTCOUNTERr(@counter, 1); 
CALL seTCOUNTER(@counter, 7);
SELECT @counter; 