/* login in root account */

use mysql;

select user, host, password from user;

/* create application database */
create database spring;
/* create user 'spring' and grant privileges */
grant all privileges on spring.* to 'spring'@'localhost' identified by 'spring';

/* create unit-test database */
create database spring_test;
/* grant privileges to user 'spring' */
grant all privileges on spring_test.* to 'spring'@'localhost';


