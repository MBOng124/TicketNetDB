-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ticketnetdb
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email_address` varchar(45) NOT NULL,
  `salutation` varchar(45) NOT NULL,
  `street_address` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `postal_code` int(11) NOT NULL,
  `phone_number` int(20) NOT NULL,
  `payment_info_id` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `fk_customers_payment_infos1_idx` (`payment_info_id`),
  CONSTRAINT `fk_customers_payment_infos1` FOREIGN KEY (`payment_info_id`) REFERENCES `payment_infos` (`payment_info_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'test','ok','yes','mr','magatsalamat','qc','qc','ph',1900,99999999,7),(2,'yes','ok','nc','mr','magatsalamat','qc','qc','ph',1900,99999999,8),(3,'YES','OK','test','mr','magatslamat','qc','qc','ph',1900,999999999,9),(4,'1','2','tesr@.yc','123','123','567','567','567',567,567,8);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(45) NOT NULL,
  `schedule_id` int(11) NOT NULL,
  `venue_id` int(11) NOT NULL,
  PRIMARY KEY (`event_id`),
  KEY `fk_event_schedules1_idx` (`schedule_id`),
  KEY `fk_event_venue1_idx` (`venue_id`),
  CONSTRAINT `fk_event_schedules1` FOREIGN KEY (`schedule_id`) REFERENCES `schedules` (`schedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_event_venue1` FOREIGN KEY (`venue_id`) REFERENCES `venues` (`venue_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
INSERT INTO `events` VALUES (1,'Foster The People',1,1),(2,'LANY Live in Manila',2,2),(3,'BLOOM IN LOVE WITH DO JIHAN LIVE IN MANILA',3,1),(4,'JOHN LEGEND DARKNESS AND LIGHT TOUR',4,2),(5,'NOTHING BUT THIEVES',5,1);
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_infos`
--

DROP TABLE IF EXISTS `payment_infos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_infos` (
  `payment_info_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_number` int(11) NOT NULL,
  `expiration_date` varchar(45) NOT NULL,
  `security_code` int(11) NOT NULL,
  PRIMARY KEY (`payment_info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_infos`
--

LOCK TABLES `payment_infos` WRITE;
/*!40000 ALTER TABLE `payment_infos` DISABLE KEYS */;
INSERT INTO `payment_infos` VALUES (1,3646,'0.148148148',5463),(2,3646,'0.148148148',5463),(3,3646,'0.148148148',5463),(4,3646,'0.148148148',5463),(5,4675,'0.142857142',3645),(6,3545,'0.142857142',1231),(7,4564,'0.142857142',1231),(8,4656,'0.250000000',1231),(9,3545,'0.178571428',1231);
/*!40000 ALTER TABLE `payment_infos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedules`
--

DROP TABLE IF EXISTS `schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedules` (
  `schedule_id` int(11) NOT NULL AUTO_INCREMENT,
  `day` varchar(15) NOT NULL,
  `datetime` datetime NOT NULL,
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedules`
--

LOCK TABLES `schedules` WRITE;
/*!40000 ALTER TABLE `schedules` DISABLE KEYS */;
INSERT INTO `schedules` VALUES (1,'Friday','2018-01-26 19:00:00'),(2,'Thursday','2018-04-05 20:00:00'),(3,'Saturday','2018-01-20 19:00:00'),(4,'Wednesd','2018-03-21 21:00:00'),(5,'Sunday','2018-01-21 20:00:00');
/*!40000 ALTER TABLE `schedules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seats`
--

DROP TABLE IF EXISTS `seats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seats` (
  `seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `section` varchar(10) NOT NULL,
  `venue_id` int(11) NOT NULL,
  PRIMARY KEY (`seat_id`),
  KEY `fk_seats_venues1_idx` (`venue_id`),
  CONSTRAINT `fk_seats_venues1` FOREIGN KEY (`venue_id`) REFERENCES `venues` (`venue_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats` WRITE;
/*!40000 ALTER TABLE `seats` DISABLE KEYS */;
INSERT INTO `seats` VALUES (0,'',0),(1,'VIP',1),(2,'VIP',1),(3,'VIP',1),(4,'VIP',1),(5,'VIP',1),(6,'VIP',1),(7,'VIP',1),(8,'VIP',1),(9,'VIP',1),(10,'VIP',1),(11,'ORCHESTRA',1),(12,'ORCHESTRA',1),(13,'ORCHESTRA',1),(14,'ORCHESTRA',1),(15,'ORCHESTRA',1),(16,'ORCHESTRA',1),(17,'ORCHESTRA',1),(18,'ORCHESTRA',1),(19,'ORCHESTRA',1),(20,'ORCHESTRA',1),(21,'LOGE',1),(22,'LOGE',1),(23,'LOGE',1),(24,'LOGE',1),(25,'LOGE',1),(26,'LOGE',1),(27,'LOGE',1),(28,'LOGE',1),(29,'LOGE',1),(30,'BALCONY',1),(31,'BALCONY',1),(32,'BALCONY',1),(33,'BALCONY',1),(34,'BALCONY',1),(35,'BALCONY',1),(36,'BALCONY',1),(37,'BALCONY',1),(38,'BALCONY',1),(39,'BALCONY',1),(40,'BALCONY',1),(41,'BALCONY',1),(42,'BALCONY',1),(43,'BALCONY',1),(44,'BALCONY',1),(45,'BALCONY',1),(46,'BALCONY',1),(47,'BALCONY',1),(48,'BALCONY',1),(49,'BALCONY',1),(50,'BALCONY',1),(51,'VIP',2),(52,'VIP',2),(53,'VIP',2),(54,'VIP',2),(55,'VIP',2),(56,'VIP',2),(57,'VIP',2),(58,'VIP',2),(59,'VIP',2),(60,'VIP',2),(61,'PATRON',2),(62,'PATRON',2),(63,'PATRON',2),(64,'PATRON',2),(65,'PATRON',2),(66,'PATRON',2),(67,'PATRON',2),(68,'PATRON',2),(69,'PATRON',2),(70,'PATRON',2),(71,'BOX',2),(72,'BOX',2),(73,'BOX',2),(74,'BOX',2),(75,'BOX',2),(76,'BOX',2),(77,'BOX',2),(78,'BOX',2),(79,'BOX',2),(80,'GA',2),(81,'GA',2),(82,'GA',2),(83,'GA',2),(84,'GA',2),(85,'GA',2),(86,'GA',2),(87,'GA',2),(88,'GA',2),(89,'GA',2),(90,'GA',2),(91,'GA',2),(92,'GA',2),(93,'GA',2),(94,'GA',2),(95,'GA',2),(96,'GA',2),(97,'GA',2),(98,'GA',2),(99,'GA',2),(100,'GA',2);
/*!40000 ALTER TABLE `seats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seats_ranges`
--

DROP TABLE IF EXISTS `seats_ranges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seats_ranges` (
  `range_to` varchar(12) NOT NULL,
  `range_from` varchar(12) NOT NULL,
  `seat_id` int(11) NOT NULL,
  KEY `fk_seats_range_seats1_idx` (`seat_id`),
  CONSTRAINT `fk_seats_range_seats1` FOREIGN KEY (`seat_id`) REFERENCES `seats` (`seat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats_ranges`
--

LOCK TABLES `seats_ranges` WRITE;
/*!40000 ALTER TABLE `seats_ranges` DISABLE KEYS */;
/*!40000 ALTER TABLE `seats_ranges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tickets` (
  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(45) NOT NULL,
  `price` double NOT NULL,
  `customer_id` int(11) NOT NULL,
  `event_id` int(11) NOT NULL,
  `seat_id` int(11) NOT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `fk_tickets_customers_idx` (`customer_id`),
  KEY `fk_ticket_event1_idx` (`event_id`),
  KEY `fk_tickets_seats1_idx` (`seat_id`),
  CONSTRAINT `fk_ticket_event1` FOREIGN KEY (`event_id`) REFERENCES `events` (`event_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tickets_customers` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tickets_seats1` FOREIGN KEY (`seat_id`) REFERENCES `seats` (`seat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (1,'Foster the people',1299,3,1,1);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venues`
--

DROP TABLE IF EXISTS `venues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venues` (
  `venue_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address/location` text NOT NULL,
  PRIMARY KEY (`venue_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venues`
--

LOCK TABLES `venues` WRITE;
/*!40000 ALTER TABLE `venues` DISABLE KEYS */;
INSERT INTO `venues` VALUES (1,'KIA Theatre','Araneta Center, Quezon City, Philippines'),(2,'Smart Araneta Coliseum','General Roxas Ave, Cubao, Quezon City, 1109 Metro Manila');
/*!40000 ALTER TABLE `venues` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-15  7:21:52
