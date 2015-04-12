
/* drop table if exists user; */

create table user (
	id integer not null auto_increment,
	login_id varchar(50) not null,
	passwd varchar(255) not null,
	name varchar(50) not null,
	email varchar(50) null,
	primary key(id)
) engine=innodb default charset=utf8;


insert into user(login_id, passwd, name, email) values ('admin', '1234', 'Administrator', 'admin@niad.kr');