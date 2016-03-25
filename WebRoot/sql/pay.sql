/*
SQLyog Community v11.01 (32 bit)
MySQL - 5.1.55-community : Database - pay
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pay` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pay`;

/*Table structure for table `pay_order` */

DROP TABLE IF EXISTS `pay_order`;

CREATE TABLE `pay_order` (
  `id` bigint(20) NOT NULL COMMENT '交易主键（采用算法生成）',
  `bussiness_id` bigint(20) NOT NULL COMMENT '客户端（PC、H5）传过来的业务订单号',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `state` varchar(32) DEFAULT NULL COMMENT '当前状态',
  `payment_method` varchar(32) DEFAULT NULL COMMENT '支付成功后的状态',
  `value` decimal(12,2) DEFAULT NULL COMMENT '未更新该字段的值，请勿使用这个字段的值',
  `tax_value` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique` (`bussiness_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Order的总表，当前状态表';

/*Data for the table `pay_order` */

insert  into `pay_order`(`id`,`bussiness_id`,`modify_time`,`create_time`,`state`,`payment_method`,`value`,`tax_value`) values (16012100796418049,10000001,'2016-01-21 22:07:56','2016-01-21 22:07:21','3',NULL,30000.00,0.00),(16012800792850868,10000002,'2016-01-28 22:01:42','2016-01-28 22:01:25','3',NULL,30000.00,0.00);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
