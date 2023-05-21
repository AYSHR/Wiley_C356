USE wileyclassic;
/*
CREATE TABLE  customers(
id int ,
name varchar(40),
email varchar(35),
phone varchar(10),
extra_payment int,
emi_amount int
);
*/ 
DELIMITER $$
CREATE TRIGGER before_additional_payment
BEFORE UPDATE ON customers
FOR EACH ROW
BEGIN
    DECLARE monthly_emi INT;
    DECLARE max_extra_payment INT;
    SET monthly_emi = 10000;
    SET max_extra_payment = monthly_emi * 2;
    
    IF NEW.extra_payment > max_extra_payment THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'EXTRA PAYMENT ERROR';
    END IF;
END $$
DELIMITER ;

