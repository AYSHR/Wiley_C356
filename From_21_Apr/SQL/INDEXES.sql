SELECT employeeNumbers, lastName, firstname from employees where jobtitle="Sales Rep";

-- 
-- query cost - 2.5
EXPLAIN SELECT employeeNumber, lastName, firstname from employees where jobtitle="Sales Rep"; 

--
-- \G WILL LET US DISPLAY RESULT VERTICALLY 
 EXPLAIN SELECT employeeNumber, lastName, firstname from employees where jobtitle="Sales Rep" \G;
 --
 
 -- DROP
 -- 1. ALGORITHM_OPTION - a. copy:- table will be copied on new table(row-by-row) then drop index will be done on the copied table 
 -- b.inflex : table is rebuilt intead of copying
 -- 2. lock_option - default/ shared/ none- read/write allowed / exclusive- only exclusive access allowed
 /*
 The lock_option controls the level of concurrent reads and writes on the table while the index is being removed
 */
 -- dropping index on tablw while some read/write operation is going on then:-
 -- 
 --
 CREATE TABLE leads(
    lead_id INT AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    information_source VARCHAR(255),
    INDEX name(first_name,last_name),
    UNIQUE email(email),
    PRIMARY KEY(lead_id)
);
--
drop index `PRIMARY` on table_name;
--
 drop index idx_email on leads algorithm=inplace lock=default;
 --
 
 -- list all indexes
 show indexes from employees;
 
 -- when we haven't connected any indexes then we will used this-
 show indexes from employees in database_name;
  show indexes from database_name.employees;
  or
 -- key is synonym of indexes
 show keys from employees in databse_name
 
 
 
 CREATE TABLE contacts(
    contact_id INT AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    PRIMARY KEY(contact_id),
    UNIQUE(email),
    INDEX phone(phone) INVISIBLE,
    INDEX name(first_name, last_name) comment 'By first name and/or last name'
);

show indexes from contacts where visible= 'no';
--
-- VISIBLE/INVISIBLE INDEX
--
CREATE INDEX IDXBUYPRICE ON PRODUCTS(BUYPRICE);

 
 --
 CREATE INDEX idxjobtitle ON employees(jobtitle);
 --
 SHOW INDEXES FROM employees;
 
 --
 -- CARDINALITY: no. of unique rows
 
 -- NOTES:-
 /*
 -- Important features of indexes in MySQL
Creating indexes        – introduces you to the index concept and shows you how to create an index for one or more columns of a table.
Removing indexes        – shows you how to remove an existing index of a table.
Listing table indexes   – provides you with a statement to list all indexes or specific indexes of a table.
Unique indexes          – uses the unique indexes to ensure distinct values stored in a column.
Prefix indexes          – shows you how to use the prefix index to create an index for a character string column.
Invisible indexes       – covers the index visibility and shows you how to make an index visible or invisible.
Descending indexes      –  shows you how to use descending indexes to increase query performance.
Composite indexes       – illustrates the application of composite indexes and shows you when to use them to speed up your queries.
Clustered indexes       – explains the clustered indexes in InnoDB tables.
Index cardinality       – explains the index cardinality and shows you how to view it using the show indexes command.
USE INDEX hint          –  shows you how to use the USE INDEX hint to instruct the query optimizer to use the only list of specified indexes to find rows in a table.
FORCE INDEX hint        – shows you how to use the FORCE INDEX hint to force the query optimizer to use specified indexes to select data from a table.

 
 */
 
 
 