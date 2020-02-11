/*
Navicat MySQL Data Transfer

Source Server         : teacher
Source Server Version : 50562
Source Host           : localhost:3308
Source Database       : rcpq

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-02-11 20:04:03
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` varchar(36) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(36) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('5c461ebb-4a5c-11ea-b70f-9c5c8e07bf21', '1234', '1234', '11');
INSERT INTO `account` VALUES ('5ce8897f-4a5c-11ea-b70f-9c5c8e07bf21', '1234', '1234', '11');
INSERT INTO `account` VALUES ('e5ecb0f3-4962-11ea-b70f-9c5c8e07bf21', '123', '123', '123');

-- ----------------------------
-- Table structure for `business`
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `Bid` int(10) NOT NULL,
  `Busername` varchar(255) NOT NULL,
  `Bpassword` varchar(255) NOT NULL,
  `Bname` varchar(255) NOT NULL,
  `Baddress` varchar(255) NOT NULL,
  `Btime` varchar(255) NOT NULL,
  `Bservice` varchar(255) NOT NULL,
  `Bphoto` varchar(255) DEFAULT NULL,
  `Bjob` varchar(255) DEFAULT NULL,
  `Bother` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Bid`),
  KEY `Bid` (`Bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES ('1', '111111', '123456', '一号公司', '湖南省长沙市五一大道', '2020/2/1', '运输', null, null, null);
INSERT INTO `business` VALUES ('2', '111112', '123456', '二号公司', '湖南省长沙市五一大道', '2020/2/1', '工厂加工', null, null, null);
INSERT INTO `business` VALUES ('3', '111113', '123456', '三号公司', '湖南省长沙市五一大道', '2020/2/1', '运输', null, null, null);

-- ----------------------------
-- Table structure for `contract`
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `Cid` int(10) NOT NULL,
  `Cname` varchar(255) NOT NULL,
  `Ccontent` varchar(255) NOT NULL,
  `Bid` int(10) DEFAULT NULL,
  `Tid` int(10) DEFAULT NULL,
  `Cother` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Cid`),
  KEY `Bid` (`Bid`),
  KEY `Tid` (`Tid`),
  CONSTRAINT `contract_ibfk_1` FOREIGN KEY (`Bid`) REFERENCES `business` (`Bid`),
  CONSTRAINT `contract_ibfk_2` FOREIGN KEY (`Tid`) REFERENCES `talent` (`Tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contract
-- ----------------------------
INSERT INTO `contract` VALUES ('1', '一号公司2020年二季度人才聘用合同', '先写着', '1', null, null);
INSERT INTO `contract` VALUES ('2', '二号公司2020年二季度人才聘用合同', '先写着', '2', null, null);
INSERT INTO `contract` VALUES ('3', '大哥2020年二季度合同', '先写着', null, '1', null);
INSERT INTO `contract` VALUES ('4', '大哥2020年三季度合同', '想象中', null, '1', null);
INSERT INTO `contract` VALUES ('5', '大哥2020年四季度合同', '先写着', null, '1', null);
INSERT INTO `contract` VALUES ('6', '大哥2020年四季度合同', '等等', '1', null, null);

-- ----------------------------
-- Table structure for `experience`
-- ----------------------------
DROP TABLE IF EXISTS `experience`;
CREATE TABLE `experience` (
  `Eid` int(10) NOT NULL,
  `Tid` int(10) DEFAULT NULL,
  `Bid` int(10) NOT NULL,
  `Ejob` varchar(255) NOT NULL,
  `Etime` varchar(255) NOT NULL,
  `Esco` int(10) DEFAULT NULL,
  `Eother` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Eid`),
  KEY `Tid` (`Tid`),
  KEY `Bid` (`Bid`),
  CONSTRAINT `experience_ibfk_1` FOREIGN KEY (`Tid`) REFERENCES `talent` (`Tid`),
  CONSTRAINT `experience_ibfk_2` FOREIGN KEY (`Bid`) REFERENCES `business` (`Bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of experience
-- ----------------------------
INSERT INTO `experience` VALUES ('1', null, '1', '柜员', '2015/5-2016/9', null, null);
INSERT INTO `experience` VALUES ('4', null, '1', '家政', '2016/1-2016/3', '7', null);
INSERT INTO `experience` VALUES ('5', '2', '2', '家政', '2016/1-2016/3', '4', null);
INSERT INTO `experience` VALUES ('6', '2', '1', '司机', '2016/6-2017/1', null, null);
INSERT INTO `experience` VALUES ('7', null, '2', '司机', '2016/6-2017/1', null, null);
INSERT INTO `experience` VALUES ('8', null, '3', '司机', '2020/1-2020/2', null, null);
INSERT INTO `experience` VALUES ('9', '1', '1', '家政', '2019/8-2020/1', null, null);

-- ----------------------------
-- Table structure for `money`
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
  `Mid` int(10) NOT NULL,
  `Tid` int(10) NOT NULL,
  `Bid` int(10) NOT NULL,
  `Mtime` varchar(255) NOT NULL,
  `Mmoney` varchar(255) NOT NULL,
  `Mjob` varchar(255) NOT NULL,
  `Mother` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Mid`),
  KEY `Tid` (`Tid`),
  KEY `Bid` (`Bid`),
  CONSTRAINT `money_ibfk_1` FOREIGN KEY (`Tid`) REFERENCES `talent` (`Tid`),
  CONSTRAINT `money_ibfk_2` FOREIGN KEY (`Bid`) REFERENCES `business` (`Bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES ('1', '1', '1', '2015/1', '1500', '柜员', null);
INSERT INTO `money` VALUES ('2', '1', '1', '2015/2', '1500', '前台', null);
INSERT INTO `money` VALUES ('3', '1', '2', '2015/3', '1700', '销售', null);
INSERT INTO `money` VALUES ('4', '1', '3', '2015/4', '1700', '司机', null);
INSERT INTO `money` VALUES ('5', '2', '1', '2015/1', '2000', '服务员', null);
INSERT INTO `money` VALUES ('6', '2', '2', '2015/2', '2000', '销售', null);
INSERT INTO `money` VALUES ('7', '2', '3', '2015/3', '3000', '司机', null);

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `Sid` int(10) NOT NULL,
  `Susername` varchar(255) NOT NULL,
  `Spassword` varchar(255) NOT NULL,
  `Sother` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------

-- ----------------------------
-- Table structure for `talent`
-- ----------------------------
DROP TABLE IF EXISTS `talent`;
CREATE TABLE `talent` (
  `Tid` int(10) NOT NULL,
  `Tusername` varchar(255) NOT NULL,
  `Tpassword` varchar(255) NOT NULL,
  `Tname` varchar(255) NOT NULL,
  `Tage` int(10) NOT NULL,
  `Tsex` varchar(255) NOT NULL,
  `Tcer` varchar(255) NOT NULL,
  `Tedu` varchar(255) NOT NULL,
  `Tpro` varchar(255) NOT NULL,
  `Tsco` int(10) DEFAULT NULL,
  `Twages` varchar(255) DEFAULT NULL,
  `Tother` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Tid`),
  KEY `Tid` (`Tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of talent
-- ----------------------------
INSERT INTO `talent` VALUES ('1', '111111', '123456', '大哥', '25', '男', '英语四级', '本科', '英语', '5', null, null);
INSERT INTO `talent` VALUES ('2', '111112', '123456', '二哥', '25', '男', '英语四级', '本科', '英语', null, null, null);
