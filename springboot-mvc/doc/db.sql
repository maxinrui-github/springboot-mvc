/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50518
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50518
File Encoding         : 65001

Date: 2019-06-12 08:53:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(64) NOT NULL,
  `parent_id` varchar(64) NOT NULL,
  `name` varchar(50) NOT NULL,
  `href` varchar(1000) DEFAULT NULL,
  `sort` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('15aa1-22sq-9839-070d0c58b5f3', '0', '系统管理', '/', '0');
INSERT INTO `sys_permission` VALUES ('78dd1-22sq-9839-070d0c58b5f3', '15aa1-22sq-9839-070d0c58b5f3', '用户管理', '/sys/user/list', '0');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(64) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('f9d3e07d-5aa1-22sq-9839-070d0c58b5f3', 'ROLE_ADMIN');
INSERT INTO `sys_role` VALUES ('hs21zi223-5aa1-497d-9839-070d0c58b5f3', 'ROLE_USER');

-- ----------------------------
-- Table structure for `sys_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` varchar(64) NOT NULL,
  `permission_id` varchar(64) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('f9d3e07d-5aa1-22sq-9839-070d0c58b5f3', '15aa1-22sq-9839-070d0c58b5f3');
INSERT INTO `sys_role_permission` VALUES ('f9d3e07d-5aa1-22sq-9839-070d0c58b5f3', '78dd1-22sq-9839-070d0c58b5f3');
INSERT INTO `sys_role_permission` VALUES ('hs21zi223-5aa1-497d-9839-070d0c58b5f3', '15aa1-22sq-9839-070d0c58b5f3');
INSERT INTO `sys_role_permission` VALUES ('hs21zi223-5aa1-497d-9839-070d0c58b5f3', '78dd1-22sq-9839-070d0c58b5f3');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(64) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `cn_name` varchar(10) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `telphone` varchar(15) DEFAULT NULL,
  `email` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('2dc93ebcb24540249cff1d65e39a0176', 'zhaoliu', 'aaf442145cc5e488d1eae16e3b36f485', '赵柳', '女', '12312312', '1@qq.com');
INSERT INTO `sys_user` VALUES ('83d46252c2a845a496578016de40d713', 'f', '1', '阿萨德', 'd', '11', '1@qq.com');
INSERT INTO `sys_user` VALUES ('9fc0da09c8524a8293eb2e2ec248003b', 'wangwu', 'aaf442145cc5e488d1eae16e3b36f485', '王五', '女', '123213123', '1@qq.com');
INSERT INTO `sys_user` VALUES ('d1bd07f0b0f44252a1cb34f8c1146a65', 'lisi', 'aaf442145cc5e488d1eae16e3b36f485', '李四', '女', '1355555555555', '1@qq.com');
INSERT INTO `sys_user` VALUES ('f9d3e07d-5aa1-497d-9839-070d0c58b432', 'admin', 'aaf442145cc5e488d1eae16e3b36f485', '管理员', '男', '13888888888', '1@qq.com');
INSERT INTO `sys_user` VALUES ('f9d3e07d-5aa1-497d-9839-070d0c58b5f3', 'maxinrui', 'aaf442145cc5e488d1eae16e3b36f485', '马新瑞', '男', '13777777777', '2@qq.com');

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` varchar(64) NOT NULL,
  `role_id` varchar(64) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `fk_role_id` (`role_id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('f9d3e07d-5aa1-497d-9839-070d0c58b432', 'f9d3e07d-5aa1-22sq-9839-070d0c58b5f3');
INSERT INTO `sys_user_role` VALUES ('f9d3e07d-5aa1-497d-9839-070d0c58b5f3', 'hs21zi223-5aa1-497d-9839-070d0c58b5f3');
