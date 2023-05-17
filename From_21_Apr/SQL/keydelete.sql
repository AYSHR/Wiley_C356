/* create table devices(
id int auto_increment primary key,
name varchar(100)
);

--
insert into devices(name) values( "switch 1"),( "switch 2"),("watch"); */
--
insert into devices(name) values( "printer");
insert into devices values( 4,"printer") on duplicate key update name="my printer";

--
create table subscriber(
id int auto_increment primary key,
email varchar(100) not null unique 
);

--
insert into subscriber(email) values ("a123@gmail.com");

 insert into subscriber(email) values ("a123@gmail.com"),("wed@gmail.com");
 
 insert ignore into subscriber(email) values ("a123@gmail.com"),("wed@gmail.com");
 
 update employees set email=replace(email,"@classicmodelcars","@wileyedge.com");

update employees set email=replace(email,"@wileyedge.com","@classicmodelcars");

update employees inner join merits on employees.performance=merits.performance set salary= salary+ salary*percentage;

CREATE TABLE buildings (
    building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE rooms (
    room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT NOT NULL,
    FOREIGN KEY (building_no)
        REFERENCES buildings (building_no)
        ON DELETE CASCADE
);

INSERT INTO buildings(building_name,address)
VALUES('ACME Headquaters','3950 North 1st Street CA 95134'),
      ('ACME Sales','5000 North 1st Street CA 95134');
      
