USE wileyclassic;

DELIMITER $$
CREATE PROCEDURE gettotalorder()
BEGIN
  DECLARE totalorder INT DEFAULT 0;
  SELECT COUNT(*) INTO totalorder FROM orders;
  SELECT totalorder;
END $$
DELIMITER ;

CALL gettotalorder();

    

    