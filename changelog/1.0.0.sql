CREATE DATABASE `tyj_demo`;

USE `tyj_demo`;

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` VARCHAR(255) NOT NULL COMMENT '用户名',
  `password` VARCHAR(1000) NOT NULL COMMENT '用户密码',
  `email` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '邮箱',
  `phone` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '手机号',
  `role_id` INT(11) NOT NULL COMMENT '用户角色',
  `sex` TINYINT(3) NOT NULL DEFAULT '1' COMMENT '性别，1:男，2:女',
  `status` TINYINT(3) NOT NULL DEFAULT '1' COMMENT '状态，1:未删除，2:已删除',
  `create_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`Id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户表';
insert  into `tb_user`(`name`,`password`,`email`,`phone`,`role_id`,`sex`,`status`,`create_time`) values
('admin','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test1','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test2','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test3','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test4','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test5','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test6','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test7','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test8','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test9','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test10','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test11','21232f297a57a5a743894a0e4a801fc3','123456@qq.com','18611714798',1,1,1,now()),
('test12','e10adc3949ba59abbe56e057f20f883e','123456@qq.com','18611714798',1,1,1,now());

DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` VARCHAR(20) NOT NULL COMMENT '角色名',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='角色表';
INSERT INTO `tb_role`(`name`, `create_time`) VALUES ('管理员', NOW()), ('测试', NOW());

DROP TABLE IF EXISTS `td_composite_dictionary`;
CREATE TABLE `td_composite_dictionary` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
  `dic_id` INT(11) NOT NULL COMMENT '字典ID',
  `dic_name` VARCHAR(100) NOT NULL COMMENT '字典名称',
  `dic_type` INT(11) NOT NULL COMMENT '类型',
  `status` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '字典状态:1:启用,0:禁用',
  `dic_desc` VARCHAR(1000) NOT NULL DEFAULT '' COMMENT '字典描述',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='字典表';
insert  into `td_composite_dictionary`(`id`,`dic_id`,`dic_name`,`dic_type`,`status`,`dic_desc`) values (1,1,'男',1,1,'性别'),(2,2,'女',1,1,'性别'),(3,1,'可用',2,1,'状态'),(4,2,'禁用',2,1,'状态');

