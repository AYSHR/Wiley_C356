-- view
/*
a view is a virtual table based on the result-set of an SQL statement.
A view contains rows and columns, just like a real table. 
The fields in a view are fields from one or more real tables in the database.
*/
-- create view view_name as select col from table where condn;
CREATE VIEW paymentsbycustomer AS  SELECT customername, checknumber, paymentdate, amount from customers inner join payments using(customernumber);
--
-- to display view content
SELECT * FROM paymentsbycustomer;