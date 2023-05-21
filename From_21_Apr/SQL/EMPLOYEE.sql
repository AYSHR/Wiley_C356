use wileyclassic;
CREATE TABLE employeeaudit (
  id INT AUTO_INCREMENT,
  employeeNumber INT NOT NULL,
  lastname VARCHAR(20) NOT NULL,
  changedat DATETIME DEFAULT NULL,
  ACTION VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (id)
);


--
 CREATE TRIGGER before_employee_AUDIT
     BEFORE UPDATE ON employees
     FOR EACH row
  INSERT INTO employeeaudit
SET action= 'update',
employeenumber=OLD.employeenumber,
lastname=OLD.lastname,
changedat=now();

--
update EMPLOYEES set lastname='alpha' where employeenumber=1056;


--
SHOW TRIGGERS;
-- DROP trigger IF EXISTS DBNAME.TRIGNMAE;