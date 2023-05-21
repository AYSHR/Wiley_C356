/* DELIMITER $$

CREATE FUNCTION customerlevel(
   credit DECIMAL(10,2)
) 
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
     DECLARE customerlevel VARCHAR(20);
     
     IF credit > 50000 THEN
        SET customerlevel = 'Platinum';
     ELSEIF credit >= 10000 AND credit <= 50000 THEN
        SET customerlevel = 'Gold';
     ELSEIF credit < 10000 THEN
        SET customerlevel = 'Silver';
     END IF;

     RETURN customerlevel;
END $$

DELIMITER ;
*/
    
    --
    SHOW FUNCTION STATUS WHERE db='wileyclassic';
    
    --
     SELECT 
         CustomerName, customerlevel(creditlimit) FROM customers Group by customerNumber;   
