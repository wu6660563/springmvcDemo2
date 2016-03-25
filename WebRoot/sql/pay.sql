/*
SQLyog Community v11.01 (32 bit)
MySQL - 5.1.55-community 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `pay_order` (
	`id` bigint (20),
	`bussiness_id` bigint (20),
	`modify_time` timestamp ,
	`create_time` timestamp ,
	`state` varchar (96),
	`payment_method` varchar (96),
	`value` Decimal (14),
	`tax_value` Decimal (14)
); 
