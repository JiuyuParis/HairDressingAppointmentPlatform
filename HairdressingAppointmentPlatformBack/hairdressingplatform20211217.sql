CREATE DATABASE  IF NOT EXISTS `hairdressingplatform` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hairdressingplatform`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: hairdressingplatform
-- ------------------------------------------------------
-- Server version	5.7.36-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `data_dict`
--

DROP TABLE IF EXISTS `data_dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `data_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '服务类型值',
  `value` varchar(255) DEFAULT NULL COMMENT '值',
  `title` varchar(255) DEFAULT NULL COMMENT '名',
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_dict`
--

LOCK TABLES `data_dict` WRITE;
/*!40000 ALTER TABLE `data_dict` DISABLE KEYS */;
INSERT INTO `data_dict` VALUES (1,'A001','推荐','S'),(2,'A002','美甲','S'),(3,'A003','美容','S'),(4,'A004','美发','S'),(5,'A005','美睫','S');
/*!40000 ALTER TABLE `data_dict` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `id` varchar(255) NOT NULL COMMENT '服务id',
  `subject` varchar(255) DEFAULT NULL COMMENT '服务主题',
  `coverpath` varchar(255) DEFAULT NULL COMMENT '服务图片',
  `price` decimal(10,2) DEFAULT NULL COMMENT '服务价格',
  `message` text COMMENT '服务介绍',
  `service_type` varchar(255) DEFAULT NULL COMMENT '服务类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('02a83216-905d-458e-ac38-882feac1eb59','独特美甲','/images/美甲_独特美甲.jpg',800.00,'与众不同，为美而生','A002'),('230f082b-b25d-4a6a-b0f1-7fd8347c109c\r\n','独特美甲','/images/美甲_独特美甲.jpg',800.00,'与众不同，为美而生','A001'),('377655ec-d27a-4324-8529-772f6419b735','锁骨发','/images/美发_锁骨发.jpg',900.00,'这几年，霸屏的电视咖们喜欢出演大女主的戏份，像孙俪、马伊琍、海清这些演员都留着一头干净又利落的超短气质发。这款发型也是非常适合40到50岁的中年女士们，清爽又时尚，满满的国际时尚范。特别是发量少比较油性发质的中年女性选择这个发型还会更加好打理的。','A004'),('38869189-527a-4f80-bf35-35c4bf5909c7','扇形','/images/美睫_扇形.jpeg',1800.00,'扇形适合大而圆的眼睛。\r\n\r\n这种类型的眼睛通常较大但睫毛较少，\r\n\r\n这样会使眼睛看起来没有神采，我们将睫毛嫁接成像折扇一样的形状，\r\n\r\n睫毛中间长，两边短，\r\n\r\n这样会使原本就大而圆的眼睛看上去更加地大、圆\r\n\r\n而且有神，非常地芭比可爱！','A005'),('399ca86e-fde5-4b98-8494-f03ece09b226','温柔美甲','/images/美甲_温柔美甲.jpg',480.00,'有温度的美甲','A002'),('6b4f34de-f508-4039-a437-1d3cb823b372','染发','/images/美发_染发.jpg',600.00,'这个颜色是属于冷色系的一种，也可以称为闷青色，虽然没有闷青色的色度那么高，但依然是能微微看出一些青色，在阳光灯光下会明显一些，而且这个发色很显白，任何肤色染都适合。','A004'),('90960f37-b6a8-47bf-beef-91783e7f6829\r\n','削骨','/images/美容_削骨.jpeg',8000.00,'磨骨瘦脸术，即削骨瘦脸，通过手术对下颌骨进行削磨或切除，达到瘦脸的效果。','A003'),('939661b7-f618-4d9e-a509-8f31375afbba','可爱美甲','/images/美甲_可爱美甲.jpg',320.00,'超卡爱的美甲','A002'),('9ff9a2df-da30-4e08-864a-e3078ceabf51','新款长发发型','/images/美发_新款长发发型.jpg',2000.00,'长发发型是2021年最新的女性造型，搭配独特的美少女长发，华丽无比。无论从气质还是美貌，都可以带出一种范儿。总的来说，你要像女神一样留长发。就拿这组发型作为参考对象，绝对会让女生的气质得到体现，华丽搭配独特漂亮的女生长发，制作出来的效果相信会让你喜欢，闪烁出一种别样的出彩直发风格，能够让女生的气质得到体现。','A004'),('b74d863e-903a-42c5-9eb8-c0bc9ea13151\r\n','纯色美甲','/images/美甲_纯色美甲.jpg',400.00,'纯纯的美甲，又纯又欲','A002'),('bca3b073-fdff-4d8d-84d4-453cc65fa3bf','飞扬型','/images/美睫_飞扬型.jpg',700.00,'飞扬型即顺着睫毛生长的方向嫁接，睫毛数量逐渐递增，由短至长，数量的增加，在眼尾处加长，提升眼部的轮廓，展现女性的柔美，更显妩媚。','A005'),('c8ca0343-a4a1-489a-87aa-94f3d2dfd76d','隆鼻','/images/美容_隆鼻.png',8000.00,'隆鼻术（Rhinoplasty）是指通过在鼻部填充自体、异体组织或组织代用品以垫高外鼻，达到改善鼻部容貌的手术。隆鼻手术切口有鼻小柱切口、鼻腔内切两种术式，其中鼻腔内切口（靠近鼻小柱一侧）因切口隐蔽、外表看不到痕迹而被普遍采用。','A003'),('ced8f961-454c-4897-80c6-edb6469a22f1\r\n','削骨','/images/美容_削骨.jpeg',8000.00,'磨骨瘦脸术，即削骨瘦脸，通过手术对下颌骨进行削磨或切除，达到瘦脸的效果。','A001'),('dc8d5fc9-53b1-4bbd-94fe-4b3717aac377','割双眼皮','/images/美容_割双眼皮.png',4000.00,'双眼皮手术又名重睑术，亦称双眼皮成形术，是整形美容外科最常见的手术之一。一般来说，双眼皮从视觉上增大了眼的轮廓，增添了眼的立体感，使眼睛显的较大，并使睫毛上翘，给人以生动，传神之感。而单眼皮眼皮较厚，睫毛下垂，显的眼睛较小，目光呆滞，缺乏生气；加之东方人单眼皮较多，约占50%以上，故求术者甚多。手术方法有以下几类：埋线重睑法、切开重睑法、缝线重睑法/无痕翘睫法双眼皮及植皮重睑法等，目前以埋线法及切开法最为常用。','A003'),('dd0dbc64-7fda-4e9b-b5b6-e9170762f468','飞扬型','/images/美睫_飞扬型.jpg',700.00,'飞扬型即顺着睫毛生长的方向嫁接，睫毛数量逐渐递增，由短至长，数量的增加，在眼尾处加长，提升眼部的轮廓，展现女性的柔美，更显妩媚。','A001'),('e9db8dcb-aa3f-476c-b821-6231d255f5a3','大卷螺旋烫','/images/美发_大卷螺旋烫.jpg',2100.00,'大卷发的发型通常是小卷发的那种，但是这款用的是最大的粗棒，整体效果很有韵味，尤其是对于头发很长的女生!看起来很舒服!','A001'),('ed21128b-ce38-4948-a9ac-52954d32d8ce','高中生长发','/images/美发_高中生长发.jpg',800.00,'高中生长发应用发型的方法图解，简单又漂亮适合高中女生长发。发型与校园发生碰撞的时候，并不会引起什么大的轰动。但每一款校花妹妹的发型，都会引人关注，原因无他，清新的女生形象与美腻的发型，才是时尚的焦点，偏分长发发型，少发量也要不规则。','A004'),('fffa9b16-74b5-4d4b-af92-b1dda7bf6a5e','复古美甲','/images/美甲_复古美甲.jpg',450.00,'高度复古，穿越千年的爱恋','A002');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_order`
--

DROP TABLE IF EXISTS `service_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_order` (
  `id` varchar(255) NOT NULL,
  `service_id` varchar(255) DEFAULT NULL COMMENT '服务项目id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `phone` varchar(255) DEFAULT NULL COMMENT '预留手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `date` datetime DEFAULT NULL COMMENT '服务时间',
  `message` text COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_order`
--

LOCK TABLES `service_order` WRITE;
/*!40000 ALTER TABLE `service_order` DISABLE KEYS */;
INSERT INTO `service_order` VALUES ('2021112910575510','230f082b-b25d-4a6a-b0f1-7fd8347c109c\r\n',10,'13841333347','辽宁省葫芦岛市兴城市','2021-11-29 10:57:00','好看！'),('2021112910581810','377655ec-d27a-4324-8529-772f6419b735',10,'13841333347','辽宁省葫芦岛市兴城市','2021-11-29 10:58:00','可以便宜吗'),('202112191110310','dd0dbc64-7fda-4e9b-b5b6-e9170762f468',10,'13841333347','辽宁省葫芦岛市兴城市','2021-12-19 11:10:00','');
/*!40000 ALTER TABLE `service_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_type`
--

DROP TABLE IF EXISTS `service_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标url',
  `title` varchar(255) DEFAULT NULL COMMENT '服务类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='服务类型表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_type`
--

LOCK TABLES `service_type` WRITE;
/*!40000 ALTER TABLE `service_type` DISABLE KEYS */;
INSERT INTO `service_type` VALUES (1,'/images/导航_推荐.png','A001'),(2,'/images/导航_美甲.png','A002'),(3,'/images/导航_美容.png','A003'),(4,'/images/导航_美发.png','A004'),(5,'/images/导航_美睫.png','A005');
/*!40000 ALTER TABLE `service_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `image` varchar(255) DEFAULT NULL COMMENT '头像',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `height` double DEFAULT NULL COMMENT '身高',
  `weight` double DEFAULT NULL COMMENT '体重',
  `vip` int(11) DEFAULT NULL COMMENT '是否会员 1-是，0-否',
  `money` double DEFAULT NULL COMMENT '余额',
  `address1` varchar(255) DEFAULT NULL COMMENT '地址1',
  `address2` varchar(255) DEFAULT NULL COMMENT '地址2',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (10,NULL,'玖语','jiuyu',166,50,0,0,'辽宁省葫芦岛市兴城市',NULL,'13841333347'),(11,NULL,'九儿','jiuer',NULL,NULL,0,0,'兴海北街',NULL,'12345677890'),(12,NULL,'熊大','xiongda',NULL,NULL,0,0,'',NULL,'13456781234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hairdressingplatform'
--

--
-- Dumping routines for database 'hairdressingplatform'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-17 18:15:38
