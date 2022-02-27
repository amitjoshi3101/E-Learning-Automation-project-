-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: elearning_project
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `elearning_project`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `elearning_project` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `elearning_project`;

--
-- Table structure for table `coordinator_table`
--

DROP TABLE IF EXISTS `coordinator_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coordinator_table` (
  `coordinator_id` int NOT NULL AUTO_INCREMENT,
  `coordinator_fname` varchar(255) DEFAULT NULL,
  `coordinator_is_active` bit(1) DEFAULT NULL,
  `coordinator_lname` varchar(255) DEFAULT NULL,
  `coordinator_password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT 'ROLE_COORDINATOR',
  `coordinator_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`coordinator_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coordinator_table`
--

LOCK TABLES `coordinator_table` WRITE;
/*!40000 ALTER TABLE `coordinator_table` DISABLE KEYS */;
INSERT INTO `coordinator_table` VALUES (1,'Amar',_binary '','Choudhary','amar@123','co-ordinator','amar@gmail.com'),(2,'Anil',_binary '','Shah','anil@123','facilitator','anil@gmail.com'),(3,'Ashok',_binary '','Kadam','ashok@123','staff incharge','ashok@gmail.com'),(4,'Arvind',_binary '','Kale','arvind@123','administrator','arvind@gmail.com'),(5,'Akash',_binary '','Patil','akash@123','administrator','akash@gmail.com');
/*!40000 ALTER TABLE `coordinator_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty_info_table`
--

DROP TABLE IF EXISTS `faculty_info_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `faculty_info_table` (
  `faculty_id` int NOT NULL AUTO_INCREMENT,
  `faculty_address` varchar(255) DEFAULT NULL,
  `faculty_city` varchar(255) DEFAULT NULL,
  `faculty_education` varchar(255) DEFAULT NULL,
  `faculty_experience_in_years` varchar(255) DEFAULT NULL,
  `faculty_fname` varchar(255) DEFAULT NULL,
  `faculty_image` longblob,
  `faculty_lname` varchar(255) DEFAULT NULL,
  `faculty_mobile_no` varchar(255) DEFAULT NULL,
  `faculty_password` varchar(255) DEFAULT NULL,
  `faculty_pincode` int DEFAULT NULL,
  `role` varchar(255) DEFAULT 'ROLE_FACULTY',
  `faculty_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`faculty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty_info_table`
--

LOCK TABLES `faculty_info_table` WRITE;
/*!40000 ALTER TABLE `faculty_info_table` DISABLE KEYS */;
INSERT INTO `faculty_info_table` VALUES (1,'Abc park ,Pune-12548','Pune','Btech-IT','15','Sunil',_binary '12345','Patil','9958745632','sunil@123',12548,'faculty','sunil@gmail.com'),(2,'Sara villa ,Pimpri-412547','Pune','Btech-IT','17','Sanjay',_binary '12345','Maske','7412458741','sanjay@123',412547,'faculty','sanjay@gmail.com'),(3,'Ashok Plaza ,Chinchwad-411019','Pune','Btech-ENTC','12','Seema',_binary '12345','Rao','7885412745','seema@123',411019,'faculty','seema@gmail.com'),(4,'Lotus Heritage ,Laxmi road, Pune-411011','Pune','Btech-ENTC','19','Sharad',_binary '12345','Rathi','7741254112','sharad@123',411011,'faculty','sharad@gmail.com'),(5,'Mohan villa ,Katraj, Pune-411012','Pune','Btech-IT','23','Rajesh',_binary '12345','Ramchandani','7741254852','rajesh@123',411012,'faculty','rajesh@gmail.com');
/*!40000 ALTER TABLE `faculty_info_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback_table`
--

DROP TABLE IF EXISTS `feedback_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback_table` (
  `feedback_id` int NOT NULL,
  `feedback` varchar(255) DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  PRIMARY KEY (`feedback_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `feedback_table_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info_table` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback_table`
--

LOCK TABLES `feedback_table` WRITE;
/*!40000 ALTER TABLE `feedback_table` DISABLE KEYS */;
INSERT INTO `feedback_table` VALUES (1,'Session was good',1),(2,'Theory session conducted need more examples',2),(3,'Faculty explanation was good',3),(4,'Session extended as compared to actual timings',4),(5,'Theory explanation was good',5);
/*!40000 ALTER TABLE `feedback_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `module_table`
--

DROP TABLE IF EXISTS `module_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `module_table` (
  `module_id` int NOT NULL AUTO_INCREMENT,
  `module_details` varchar(255) DEFAULT NULL,
  `module_houres` varchar(255) DEFAULT NULL,
  `module_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module_table`
--

LOCK TABLES `module_table` WRITE;
/*!40000 ALTER TABLE `module_table` DISABLE KEYS */;
INSERT INTO `module_table` VALUES (1,'Technical knowledge regarding advance concepts in JAVA','85 hrs','Advanced Java'),(2,'Structural working of operating systems of computer','70 hrs','Operating System'),(3,'Detail study of OOPS concepts ','75 hrs','Core JAVA'),(4,'Coding sessions for placement purpose','40 hrs','Placement oriented Grooming'),(5,'Basic and web application using Microsoft .net','80 hrs','MS.Net');
/*!40000 ALTER TABLE `module_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice_table`
--

DROP TABLE IF EXISTS `notice_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice_table` (
  `notice_id` int NOT NULL AUTO_INCREMENT,
  `notice_date` date DEFAULT NULL,
  `notice_description` varchar(255) DEFAULT NULL,
  `notice_file` longblob,
  `notice_data` varchar(255) DEFAULT NULL,
  `notice_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice_table`
--

LOCK TABLES `notice_table` WRITE;
/*!40000 ALTER TABLE `notice_table` DISABLE KEYS */;
INSERT INTO `notice_table` VALUES (1,'2022-01-05','Feedback for running Model',_binary '11245','Feeedback notice','Posted'),(2,'2022-02-15','Lab Exam schedule details for DBT Model',_binary '11245','Lan Exam notice','Posted'),(3,'2022-02-19','Mentoring session by Previous batch students ',_binary '11245','Mentoring session notice','Posted'),(4,'2022-02-24','MS.Net schedule timings changes',_binary '11245','Module time change notice','Posted'),(5,'2022-02-27','Extra lab session conucted on Sunday',_binary '11245','Lab session notice','Posted');
/*!40000 ALTER TABLE `notice_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session_schedule_table`
--

DROP TABLE IF EXISTS `session_schedule_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `session_schedule_table` (
  `session_id` int NOT NULL,
  `session_enable_recording` bit(1) DEFAULT NULL,
  `session_start_time` time DEFAULT NULL,
  `session_end_time` time DEFAULT NULL,
  `session_attendance` varchar(255) DEFAULT NULL,
  `session_date` date DEFAULT NULL,
  `session_details` varchar(255) DEFAULT NULL,
  `session_invitation_details` varchar(255) DEFAULT NULL,
  `session_recording_link` varchar(255) DEFAULT NULL,
  `session_status` varchar(255) DEFAULT NULL,
  `faculty_id` int DEFAULT NULL,
  `module_id` int DEFAULT NULL,
  `zoom_id` int DEFAULT NULL,
  `feedback_id` int DEFAULT NULL,
  PRIMARY KEY (`session_id`),
  KEY `faculty_id` (`faculty_id`),
  KEY `module_id` (`module_id`),
  KEY `zoom_id` (`zoom_id`),
  KEY `feedback_id` (`feedback_id`),
  CONSTRAINT `session_schedule_table_ibfk_1` FOREIGN KEY (`module_id`) REFERENCES `module_table` (`module_id`),
  CONSTRAINT `session_schedule_table_ibfk_2` FOREIGN KEY (`zoom_id`) REFERENCES `zoom_account_table` (`zoom_id`),
  CONSTRAINT `session_schedule_table_ibfk_3` FOREIGN KEY (`faculty_id`) REFERENCES `faculty_info_table` (`faculty_id`),
  CONSTRAINT `session_schedule_table_ibfk_4` FOREIGN KEY (`feedback_id`) REFERENCES `feedback_table` (`feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_schedule_table`
--

LOCK TABLES `session_schedule_table` WRITE;
/*!40000 ALTER TABLE `session_schedule_table` DISABLE KEYS */;
INSERT INTO `session_schedule_table` VALUES (1,_binary '','09:30:00','12:30:00','78','2022-02-01','Advanced Java theory session','ADV JAVA Therory session dated 01 feb 2022','hdbckjdc@google drive','Active',1,1,447,1),(2,_binary '','13:30:00','16:30:00','100','2022-02-03','Oprerating system theory session','Operating system Therory session dated 03 feb 2022','hdbckjdc@google drive','Active',2,2,456,2),(3,_binary '','15:30:00','17:30:00','100','2022-02-05','POG theory session','POG Therory session dated 03 feb 2022','hdbckjdc@google drive','Active',3,4,660,5),(4,_binary '','10:30:00','13:30:00','100','2022-02-07','MS.NET theory session','MS.NET Therory session dated 07 feb 2022','hdbckjdc@google drive','Active',4,5,660,3),(5,_binary '','12:30:00','14:30:00','77','2022-02-09','MS.NET theory session','MS.NET Therory session dated 09 feb 2022','hdbckjdc@google drive','Active',5,5,660,5);
/*!40000 ALTER TABLE `session_schedule_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info_table`
--

DROP TABLE IF EXISTS `student_info_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_info_table` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_address` varchar(255) DEFAULT NULL,
  `student_city` varchar(255) DEFAULT NULL,
  `student_date_of_birth` date DEFAULT NULL,
  `student_education` varchar(255) DEFAULT NULL,
  `student_fname` varchar(255) DEFAULT NULL,
  `student_gender` varchar(255) DEFAULT NULL,
  `student_image` longblob,
  `student_lname` varchar(255) DEFAULT NULL,
  `student_mobile_no` varchar(255) DEFAULT NULL,
  `student_password` varchar(255) DEFAULT NULL,
  `student_pincode` int DEFAULT NULL,
  `student_prn_no` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT 'ROLE_STUDENT',
  `student_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info_table`
--

LOCK TABLES `student_info_table` WRITE;
/*!40000 ALTER TABLE `student_info_table` DISABLE KEYS */;
INSERT INTO `student_info_table` VALUES (1,'Ram Appartment, Pune-411201','Pune','1998-02-01','BE-IT','Siddhart','Male',_binary '12345','Shah','9954785214','Sid@123',411201,'2145110100','student','sid@gmail.com'),(2,'RajLaxmi Appartment, Nasik-466584','Nasik','1999-03-21','BE-IT','Reena','Female',_binary '12345','Gupta','9654712310','reena@123',466584,'2145110103','student','reena@gmail.com'),(3,'Vitthal Heritage, Nagpur-412142','Nagpur','1995-06-15','BE-Mech','Ashish','Male',_binary '12345','Raut','9663254122','ashish@123',412142,'2145110105','student','ashish@gmail.com'),(4,'ABC society, Mumbai-41105','Mumbai','1997-05-15','BE-Mech','Geeta','Female',_binary '12345','Patil','9663134547','geeta@123',412105,'2145110107','student','geeta@gmail.com'),(5,'Reyansh Appartment, Solapur-411236','Solapur','1999-04-22','BE-EE','Ashok','Male',_binary '12345','Das','9663224125','das@123',411236,'2145110110','student','das@gmail.com');
/*!40000 ALTER TABLE `student_info_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zoom_account_table`
--

DROP TABLE IF EXISTS `zoom_account_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zoom_account_table` (
  `zoom_id` int NOT NULL AUTO_INCREMENT,
  `zoom_account_details` varchar(255) DEFAULT NULL,
  `zoom_password` varchar(255) DEFAULT NULL,
  `zoom_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`zoom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=790 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zoom_account_table`
--

LOCK TABLES `zoom_account_table` WRITE;
/*!40000 ALTER TABLE `zoom_account_table` DISABLE KEYS */;
INSERT INTO `zoom_account_table` VALUES (123,'Rajesh Ramchandani','rajes112457','rajesh44587'),(447,'Rajiv Kumar','rajiv@123','rajiv5214'),(456,'Shekar Singh','shekar@123','shekhar11475'),(660,'Sameer Yadav','sameer@123','sameer1142'),(789,'Sharat Thakur','sharat@456','shaarat3369');
/*!40000 ALTER TABLE `zoom_account_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zoom_acesstoken_tbl`
--

DROP TABLE IF EXISTS `zoom_acesstoken_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zoom_acesstoken_tbl` (
  `token_id` int NOT NULL,
  `access_token` longtext,
  `token_expires_in` bigint DEFAULT NULL,
  `refresh_token` longtext,
  PRIMARY KEY (`token_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zoom_acesstoken_tbl`
--

LOCK TABLES `zoom_acesstoken_tbl` WRITE;
/*!40000 ALTER TABLE `zoom_acesstoken_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `zoom_acesstoken_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-27 21:59:49
