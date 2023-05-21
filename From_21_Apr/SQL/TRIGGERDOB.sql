USE wileyclassic;
 /*
CREATE TABLE members(
name varchar(35) not null,
email varchar(25) not null,
dob   datetime not null
);

*/

/*CREATE TABLE missing(
id int not null,
memeberid int not null,
msg varchar(30) not null
);
*/

ALTER TABLE memebers ADD id INT;
DELIMITER $$
CREATE TRIGGER missing
    AFTER INSERT ON members
     FOR EACH ROW
     BEGIN
        IF new.dob IS NULL THEN
        INSERT INTO missing(member_id, msg)
        VALUES (new.ID, 'UPDATE YOUR DOB');
        END IF;
	END $$
    DELIMITER ;
  



/*
DELIMITER $$

CREATE PROCEDURE insertdata(
   IN inname varchar(35),
   IN inemail varchar(25),
   IN  indob datetime
)
BEGIN 
  DECLARE EXIT HANDLER FOR 1062
  BEGIN
    SET dob=CONCAT('dob is missing for given ', inname);
    SELECT dob;
  END;

  -- INSERTING NEW ROW
  INSERT INTO members VALUES (inname, inemail, indob);

  -- return value
  SELECT * from members;

END $$

DELIMITER ;
*/

-- CALL insertdata('mary1','mary@gmail.com', '2002-11-11');
-- CALL insertdata('mary','mary@gmail.com');
