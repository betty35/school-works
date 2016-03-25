/*
Navicat MySQL Data Transfer

Source Server         : myconnection
Source Server Version : 50627
Source Host           : 127.0.0.1:3306
Source Database       : b2cweb

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2015-11-10 11:32:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for deliveryaddress
-- ----------------------------
DROP TABLE IF EXISTS `deliveryaddress`;
CREATE TABLE `deliveryaddress` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `userId` int(4) DEFAULT NULL,
  `linkman` varchar(100) NOT NULL,
  `linkphone` varchar(20) NOT NULL,
  `zipcode` varchar(6) NOT NULL,
  `sheng` varchar(20) NOT NULL,
  `shi` varchar(30) NOT NULL,
  `address` varchar(200) NOT NULL,
  `see` int(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_userId` (`userId`) USING BTREE,
  CONSTRAINT `fk_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deliveryaddress
-- ----------------------------
INSERT INTO `deliveryaddress` VALUES ('1', '2', '小明', '12345678999', '100036', '北京', '北京', '沙河高教园区中央财经大学', '1');
INSERT INTO `deliveryaddress` VALUES ('2', '2', '小明的同学', '99999988776', '102200', '北京', '北京', '沙河高教园区中央财经大学', '1');
INSERT INTO `deliveryaddress` VALUES ('3', '1', 'ZBQ', '13661222222', '102201', '北京', '北京', '昌平区沙河高教园区中央财经大学', '1');
INSERT INTO `deliveryaddress` VALUES ('4', '1', '某人', '1234567', '100036', '北京', '北京', '某个地址', '1');
INSERT INTO `deliveryaddress` VALUES ('5', '1', 'aaa', '1234567', '102200', '某省', '某市', '是个地址', '1');
INSERT INTO `deliveryaddress` VALUES ('6', '6', '小兰', '18810390000', '102201', '某省份', '某市', '小兰家', '1');
INSERT INTO `deliveryaddress` VALUES ('7', '2', '小明的亲戚', '1234567777', '100010', '河北省', '某市', '小明亲戚家', '1');

-- ----------------------------
-- Table structure for firstcategory
-- ----------------------------
DROP TABLE IF EXISTS `firstcategory`;
CREATE TABLE `firstcategory` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of firstcategory
-- ----------------------------
INSERT INTO `firstcategory` VALUES ('1', '冲饮');
INSERT INTO `firstcategory` VALUES ('2', '直饮');
INSERT INTO `firstcategory` VALUES ('3', '水杯&壶');

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `orderId` int(4) NOT NULL,
  `productId` int(4) NOT NULL COMMENT '其实填写specId',
  `productName` varchar(50) NOT NULL,
  `kind` varchar(30) NOT NULL COMMENT 'specName',
  `unitPrice` float NOT NULL,
  `quantity` int(4) NOT NULL,
  `grade` int(4) DEFAULT NULL,
  `comment` varchar(400) DEFAULT NULL,
  `commentTime` date DEFAULT NULL,
  `anonymous` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_order` (`orderId`),
  KEY `productId` (`productId`),
  CONSTRAINT `fk_order` FOREIGN KEY (`orderId`) REFERENCES `theorder` (`orderId`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO `orderitem` VALUES ('4', '5', '4', '菊花', '桶装花茶', '10', '1', '3', '不错不错', '2015-11-08', '1');
INSERT INTO `orderitem` VALUES ('5', '5', '7', '普洱茶', '月光白', '10', '1', '2', '真心不好翘……', '2015-11-08', '1');
INSERT INTO `orderitem` VALUES ('6', '6', '8', '可可粉', '大包装1000g', '28', '1', '3', '不错', '2015-11-08', '1');
INSERT INTO `orderitem` VALUES ('7', '6', '9', '草莓粉', '冻干草莓粉50g袋装', '9.9', '1', '2', '一般般', '2015-11-08', '0');
INSERT INTO `orderitem` VALUES ('8', '7', '1', '甜菊叶', '10g装', '3.1', '1', '3', '好甜', '2015-11-10', '0');
INSERT INTO `orderitem` VALUES ('9', '7', '7', '普洱茶', '月光白', '10', '2', '3', '好喝', '2015-11-10', '0');
INSERT INTO `orderitem` VALUES ('10', '11', '2', '甜菊叶', '50g装', '5', '1', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('11', '11', '3', '菊花', '散装花茶', '5', '1', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('12', '11', '9', '草莓粉', '冻干草莓粉50g袋装', '9.9', '2', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('13', '12', '8', '可可粉', '大包装1000g', '28', '1', '3', '味道不错', '2015-11-09', '1');
INSERT INTO `orderitem` VALUES ('14', '12', '9', '草莓粉', '冻干草莓粉50g袋装', '9.9', '2', '3', '好喝', '2015-11-09', '1');
INSERT INTO `orderitem` VALUES ('15', '13', '6', '普洱茶', '易武山', '5.1', '1', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('16', '13', '7', '普洱茶', '月光白', '10', '3', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('17', '14', '16', '果茶', '山楂片50g', '5', '2', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('18', '14', '5', '立顿红茶', '15袋装', '7.3', '1', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('19', '14', '21', '可口可乐', '可口可乐汽水香草口味355ml×6', '43.8', '1', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('20', '14', '10', '花茶', '茉莉花50g', '4.5', '2', null, null, null, '0');
INSERT INTO `orderitem` VALUES ('21', '14', '15', '果茶', '柠檬片50g', '2.5', '1', null, null, null, '0');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `specId` int(4) NOT NULL AUTO_INCREMENT,
  `specName` varchar(40) NOT NULL,
  `productId` int(4) DEFAULT NULL,
  `price` float NOT NULL,
  `brand` varchar(40) NOT NULL,
  `imagePath` varchar(500) NOT NULL,
  `stock` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`specId`),
  KEY `fk_productId` (`productId`) USING BTREE,
  CONSTRAINT `fk_productId` FOREIGN KEY (`productId`) REFERENCES `productlist` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '10g装', '9', '3.1', '某厂商', 'tianJuYe.jpg', '9');
INSERT INTO `product` VALUES ('2', '50g装', '9', '5', '某厂商', 'tianJuYe.jpg', '4');
INSERT INTO `product` VALUES ('3', '散装花茶', '18', '5', '某厂', 'juHua.jpg', '14');
INSERT INTO `product` VALUES ('4', '桶装花茶', '18', '10', '杭菊行家', 'juHuaTong.jpg', '4');
INSERT INTO `product` VALUES ('5', '15袋装', '1', '7.3', '立顿', 'liDun.jpg', '11');
INSERT INTO `product` VALUES ('6', '易武山', '2', '5.1', '吉顺号', 'puErYWS.jpg', '22');
INSERT INTO `product` VALUES ('7', '月光白', '2', '10', '吉顺号', 'puErYGB.jpg', '21');
INSERT INTO `product` VALUES ('8', '大包装1000g', '7', '28', '东具牌', 'keKe.jpg', '21');
INSERT INTO `product` VALUES ('9', '冻干草莓粉50g袋装', '6', '9.9', '龙海优联食品有限公司', 'dongganCMF50.jpg', '37');
INSERT INTO `product` VALUES ('10', '茉莉花50g', '20', '4.5', '亳州市万花堂药业', 'moLi.jpg', '30');
INSERT INTO `product` VALUES ('11', '平阴玫瑰50g', '20', '3', '亳州市万花堂药业', 'pingYinMeiGui.jpg', '45');
INSERT INTO `product` VALUES ('12', '金盏菊50g', '20', '4', '亳州市万花堂药业', 'jinZhanJu.jpg', '27');
INSERT INTO `product` VALUES ('13', '洛神花50g', '20', '3.5', '亳州市万花堂药业', 'luoShenHua.jpg', '61');
INSERT INTO `product` VALUES ('14', '洋甘菊50g', '20', '9.9', '亳州市康雅生物科技有限责任公司', 'yangGanJu.jpg', '21');
INSERT INTO `product` VALUES ('15', '柠檬片50g', '21', '2.5', '亳州市万花堂药业', 'ningMeng.jpg', '11');
INSERT INTO `product` VALUES ('16', '山楂片50g', '21', '5', '亳州市万花堂药业', 'shanZha.jpg', '4');
INSERT INTO `product` VALUES ('17', '甘草片50g', '22', '4.5', '亳州市万花堂药业', 'ganCao.jpg', '102');
INSERT INTO `product` VALUES ('18', '茯苓丁200g', '19', '9.5', '亳州市万花堂药业', 'fuLing.jpg', '35');
INSERT INTO `product` VALUES ('19', '100g', '4', '2.9', '亳州市万花堂药业', 'juemingzi.jpg', '24');
INSERT INTO `product` VALUES ('20', '百事可乐 330ml*6罐/组', '10', '11.8', '百事', 'baishiKele.jpg', '20');
INSERT INTO `product` VALUES ('21', '可口可乐汽水香草口味355ml×6', '10', '43.8', '可口可乐', 'kekouKele.jpg', '19');
INSERT INTO `product` VALUES ('22', '150g桶装', '8', '29', '余姚绿谷工坊食品有限公司', 'moCha3.jpg', '10');
INSERT INTO `product` VALUES ('23', '整箱', '23', '26', '统一', 'xianChengDuo.jpg', '20');
INSERT INTO `product` VALUES ('24', '明治400g', '5', '16', '明治', 'wuTangSuanNai.jpg', '32');
INSERT INTO `product` VALUES ('25', '蓝色款', '11', '8.3', 'Luminarc/乐美雅', 'BoLiBeiL.jpg', '10');
INSERT INTO `product` VALUES ('26', '粉色款', '11', '7.6', 'Luminarc/乐美雅', 'boLibeiF.jpg', '9');
INSERT INTO `product` VALUES ('27', '东方树叶500ml*15瓶/箱', '24', '48.6', '东方树叶', 'dongFangShuYe.jpg', '15');

-- ----------------------------
-- Table structure for productlist
-- ----------------------------
DROP TABLE IF EXISTS `productlist`;
CREATE TABLE `productlist` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `secondCategoryId` int(4) DEFAULT NULL,
  `detail` varchar(1000) NOT NULL DEFAULT '未输入描述',
  PRIMARY KEY (`id`),
  KEY `fk_second` (`secondCategoryId`),
  CONSTRAINT `fk_second` FOREIGN KEY (`secondCategoryId`) REFERENCES `secondcategory` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productlist
-- ----------------------------
INSERT INTO `productlist` VALUES ('1', '立顿红茶', '1', '小包的红茶');
INSERT INTO `productlist` VALUES ('2', '普洱茶', '1', '黑茶，有两种不同的规格~');
INSERT INTO `productlist` VALUES ('3', '板蓝根片', '2', '可以治疗感冒');
INSERT INTO `productlist` VALUES ('4', '决明子', '2', '降血压');
INSERT INTO `productlist` VALUES ('5', '无糖酸奶', '3', '没有加糖的酸奶');
INSERT INTO `productlist` VALUES ('6', '草莓粉', '4', '纯天然~虽然加糖了');
INSERT INTO `productlist` VALUES ('7', '可可粉', '4', '可以加入牛奶引用，也可以直接冲泡');
INSERT INTO `productlist` VALUES ('8', '抹茶粉', '4', '绿色的');
INSERT INTO `productlist` VALUES ('9', '甜菊叶', '5', '很甜，但低热量');
INSERT INTO `productlist` VALUES ('10', '可口可乐', '6', '一般的可乐');
INSERT INTO `productlist` VALUES ('11', '玻璃杯', '7', '普通的玻璃杯，易碎品，轻拿轻放');
INSERT INTO `productlist` VALUES ('12', '500ML水壶', '8', '怕热，勿加热水');
INSERT INTO `productlist` VALUES ('13', '陶瓷茶壶', '9', '一般的茶壶');
INSERT INTO `productlist` VALUES ('14', '搅拌勺', '10', '不锈钢质地');
INSERT INTO `productlist` VALUES ('15', '茉莉绿茶', '1', '其实并不是花儿');
INSERT INTO `productlist` VALUES ('18', '菊花', '1', '清火良品');
INSERT INTO `productlist` VALUES ('19', '茯苓', '2', '其实这是一种蘑菇');
INSERT INTO `productlist` VALUES ('20', '花茶', '1', '多种选择');
INSERT INTO `productlist` VALUES ('21', '果茶', '1', '柠檬、山楂等多种选择');
INSERT INTO `productlist` VALUES ('22', '甘草片', '2', '治疗嗓子有一套');
INSERT INTO `productlist` VALUES ('23', '鲜橙多', '6', '橙汁饮料');
INSERT INTO `productlist` VALUES ('24', '无糖绿茶', '3', '不含糖的哦');

-- ----------------------------
-- Table structure for secondcategory
-- ----------------------------
DROP TABLE IF EXISTS `secondcategory`;
CREATE TABLE `secondcategory` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `firstId` int(4) DEFAULT NULL,
  `categoryName` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_first` (`firstId`),
  CONSTRAINT `fk_firstCategory` FOREIGN KEY (`firstId`) REFERENCES `firstcategory` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of secondcategory
-- ----------------------------
INSERT INTO `secondcategory` VALUES ('1', '1', '茶');
INSERT INTO `secondcategory` VALUES ('2', '1', '中药饮片');
INSERT INTO `secondcategory` VALUES ('3', '2', '无糖');
INSERT INTO `secondcategory` VALUES ('4', '1', '冲饮粉类');
INSERT INTO `secondcategory` VALUES ('5', '1', '调味');
INSERT INTO `secondcategory` VALUES ('6', '2', '加糖');
INSERT INTO `secondcategory` VALUES ('7', '3', '杯子');
INSERT INTO `secondcategory` VALUES ('8', '3', '水瓶');
INSERT INTO `secondcategory` VALUES ('9', '3', '茶壶');
INSERT INTO `secondcategory` VALUES ('10', '3', '其他');

-- ----------------------------
-- Table structure for theorder
-- ----------------------------
DROP TABLE IF EXISTS `theorder`;
CREATE TABLE `theorder` (
  `orderId` int(4) NOT NULL AUTO_INCREMENT,
  `userId` int(4) NOT NULL,
  `orderCode` varchar(32) NOT NULL,
  `orderDate` date NOT NULL,
  `orderStatus` int(4) NOT NULL DEFAULT '0',
  `addressId` int(4) NOT NULL,
  `deliveryWay` varchar(20) NOT NULL,
  `paymentWay` varchar(20) NOT NULL,
  `deliveryCode` varchar(30) DEFAULT NULL,
  `finishDate` date DEFAULT NULL,
  `memo` varchar(400) DEFAULT '无',
  `honestyStar` int(2) DEFAULT NULL,
  `serviceStar` int(2) DEFAULT NULL,
  `deliveryStar` int(2) DEFAULT NULL,
  `totalPrice` float NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `fk_userId2` (`userId`),
  CONSTRAINT `fk_userId2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of theorder
-- ----------------------------
INSERT INTO `theorder` VALUES ('5', '2', '4d682936b00e40bd9393acaa6783e425', '2015-11-07', '3', '1', '邮政小包', '网上支付', 'justwannatryit', '2015-11-08', '没什么留言', '4', '5', '5', '20');
INSERT INTO `theorder` VALUES ('6', '2', '91f260ed14374548a16c026faf9833f6', '2015-11-08', '3', '2', '圆通', '货到付款', '12345677777', '2015-11-09', '请用纸箱包装，谢谢', '5', '5', '5', '37.9');
INSERT INTO `theorder` VALUES ('7', '2', '90a515d2e16747cc908f7822d26532cb', '2015-11-08', '3', '1', '邮政小包', '网上支付', 'thisisthedeliveryCode', '2015-11-08', '无', '5', '5', '5', '23.1');
INSERT INTO `theorder` VALUES ('8', '1', 'fff7a38867c04905979be2187994c282', '2015-11-09', '4', '3', '邮政小包', '网上支付', 'åè´§å¦åè´§å¦', '2015-11-09', '没什么留言的说', null, null, null, '24.5');
INSERT INTO `theorder` VALUES ('11', '6', '13c716bb019f4b14ad20eca009958d5d', '2015-11-09', '0', '6', '圆通', '网上支付', null, null, '测试测试', null, null, null, '29.8');
INSERT INTO `theorder` VALUES ('12', '1', '12316aede3594184861e101ab440e92e', '2015-11-09', '3', '3', '邮政小包', '网上支付', 'abc1234oi091', '2015-11-09', '依旧是测试', '5', '5', '5', '47.8');
INSERT INTO `theorder` VALUES ('13', '2', '0830ca0b178248f099b25920137293a2', '2015-11-10', '0', '7', '邮政小包', '网上支付', null, null, '无', null, null, null, '35.1');
INSERT INTO `theorder` VALUES ('14', '2', '4420d70a36fb4f79be0816cef00e9afe', '2015-11-10', '0', '1', '申通', '货到付款', null, null, '依旧是测试', null, null, null, '72.6');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(4) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(100) NOT NULL DEFAULT '',
  `password` varchar(30) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `email` varchar(200) NOT NULL,
  `mobile` varchar(11) NOT NULL,
  `role` varchar(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`),
  KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'betty', '123456', 'ZBQ the admin', '女', 'betty352008@yeah.net', '13669999999', 'a');
INSERT INTO `user` VALUES ('2', 'xiaomingming', 'xiaoming', '李小明', '男', 'xiaoming@163.com', '12345555555', 'b');
INSERT INTO `user` VALUES ('3', '小红', 'xiaohong', '李小红', '女', 'xiaohong@163.com', '54321111111', 's');
INSERT INTO `user` VALUES ('4', '测试', '123456', '测试', '男', 'test@163.com', '12345678911', 'b');
INSERT INTO `user` VALUES ('5', '新建试试', '123456', '全名', '女', '123@163.com', '123456789', 'b');
INSERT INTO `user` VALUES ('6', '小兰', 'xiaolan', '小兰', '女', 'xiaolan@sohu.com', '18810390000', 'b');
