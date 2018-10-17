CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '数据库主键',
  `name` varchar(10) NOT NULL DEFAULT '' COMMENT 'name',
  `insert_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '插入时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='Student';


CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '数据库主键',
  `name` varchar(10) NOT NULL DEFAULT '' COMMENT 'name',
  `insert_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '插入时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='Teacher';