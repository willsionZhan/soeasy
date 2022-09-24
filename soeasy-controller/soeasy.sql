-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.30 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 导出 soeasy 的数据库结构
DROP DATABASE IF EXISTS `soeasy`;
CREATE DATABASE IF NOT EXISTS `soeasy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `soeasy`;

-- 导出  表 soeasy.appointment 结构
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `book_id` bigint NOT NULL COMMENT '图书ID',
  `student_id` bigint NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  PRIMARY KEY (`book_id`,`student_id`),
  KEY `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='预约图书表';

-- 正在导出表  soeasy.appointment 的数据：~2 rows (大约)
DELETE FROM `appointment`;
INSERT INTO `appointment` (`book_id`, `student_id`, `appoint_time`) VALUES
	(1000, 12345678910, '2022-08-16 03:50:51'),
	(1001, 12345678910, '2022-08-16 03:50:51');

-- 导出  表 soeasy.book 结构
DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `book_id` bigint NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1034 DEFAULT CHARSET=utf8mb3 COMMENT='图书表';

-- 正在导出表  soeasy.book 的数据：~34 rows (大约)
DELETE FROM `book`;
INSERT INTO `book` (`book_id`, `name`, `number`) VALUES
	(1000, 'Java程序设计', 0),
	(1001, '数据结构', 0),
	(1002, '设计模式', 10),
	(1003, '编译原理', 10),
	(1004, '上下五千年', 3),
	(1005, '万历十五', 2),
	(1006, '西游记', 4),
	(1007, '红楼梦', 3),
	(1008, '三国演义', 2),
	(1009, '中原配发', 2),
	(1010, '水浒传', 1),
	(1011, '呐喊', 2),
	(1012, '南郭先生', 1),
	(1013, 'C++程序设计', 1),
	(1014, '围城', 1),
	(1015, '中国经济论坛', 1),
	(1016, '证券投资分析', 1),
	(1017, 'mysql解析', 1),
	(1018, '经济法', 1),
	(1019, '政治经济学', 1),
	(1020, '宏观经济概论', 1),
	(1021, '老人与海', 1),
	(1022, '阿甘正传', 1),
	(1023, '阿尔法正统', 1),
	(1024, 'SQL语法', 1),
	(1025, 'BI轻松入门', 1),
	(1026, '怎么养好牛', 1),
	(1027, '万有引力定律', 1),
	(1028, '矛盾定律', 1),
	(1029, '罗非定律', 1),
	(1030, '远程访问', 1),
	(1031, '真实的谎言', 1),
	(1032, 'this is my ts', 1),
	(1033, 'this is my ts', 1);

-- 导出  表 soeasy.hr_comp_position 结构
DROP TABLE IF EXISTS `hr_comp_position`;
CREATE TABLE IF NOT EXISTS `hr_comp_position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `compID` int DEFAULT NULL,
  `deptID` int DEFAULT NULL,
  `positionID` int DEFAULT NULL,
  `fixedNumber` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='公司职位表';

-- 正在导出表  soeasy.hr_comp_position 的数据：~0 rows (大约)
DELETE FROM `hr_comp_position`;

-- 导出  表 soeasy.hr_employee 结构
DROP TABLE IF EXISTS `hr_employee`;
CREATE TABLE IF NOT EXISTS `hr_employee` (
  `mobileNumber` varchar(20) NOT NULL,
  `empFullName` varchar(200) NOT NULL,
  `empFirstName` varchar(200) DEFAULT NULL,
  `empLastName` varchar(200) DEFAULT NULL,
  `IDCard` varchar(200) DEFAULT NULL,
  `empPWD` varchar(200) DEFAULT NULL,
  `wechatIDCode` varchar(1000) DEFAULT NULL,
  `personalEmail` varchar(200) DEFAULT NULL,
  `officeEmail` varchar(200) DEFAULT NULL,
  `currCompanyID` int DEFAULT NULL,
  `currDeptID` int DEFAULT NULL,
  `currPositionLevelID` int DEFAULT NULL,
  `empStatus` int DEFAULT NULL,
  `workingHours` int DEFAULT NULL,
  `groupHiredDate` date DEFAULT NULL,
  `hiredDate` date DEFAULT NULL,
  `probationEndDate` date DEFAULT NULL,
  `empType` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`mobileNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工表';

-- 正在导出表  soeasy.hr_employee 的数据：~1 rows (大约)
DELETE FROM `hr_employee`;
INSERT INTO `hr_employee` (`mobileNumber`, `empFullName`, `empFirstName`, `empLastName`, `IDCard`, `empPWD`, `wechatIDCode`, `personalEmail`, `officeEmail`, `currCompanyID`, `currDeptID`, `currPositionLevelID`, `empStatus`, `workingHours`, `groupHiredDate`, `hiredDate`, `probationEndDate`, `empType`) VALUES
	('16605125148', 'gene.zhan', 'gene', NULL, '429001197909150030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- 导出  表 soeasy.hr_emp_role 结构
DROP TABLE IF EXISTS `hr_emp_role`;
CREATE TABLE IF NOT EXISTS `hr_emp_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empID` int DEFAULT NULL,
  `roleID` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  soeasy.hr_emp_role 的数据：~0 rows (大约)
DELETE FROM `hr_emp_role`;

-- 导出  表 soeasy.hr_level 结构
DROP TABLE IF EXISTS `hr_level`;
CREATE TABLE IF NOT EXISTS `hr_level` (
  `levelID` int NOT NULL AUTO_INCREMENT,
  `levelPID` int DEFAULT NULL,
  `levelCode` varchar(50) DEFAULT NULL,
  `levelName` varchar(200) DEFAULT NULL,
  `levelDesc` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`levelID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='职级表';

-- 正在导出表  soeasy.hr_level 的数据：~0 rows (大约)
DELETE FROM `hr_level`;

-- 导出  表 soeasy.hr_position 结构
DROP TABLE IF EXISTS `hr_position`;
CREATE TABLE IF NOT EXISTS `hr_position` (
  `positionID` int NOT NULL AUTO_INCREMENT,
  `positionPID` int DEFAULT NULL,
  `positionCode` varchar(50) DEFAULT NULL,
  `positionName` varchar(200) DEFAULT NULL,
  `positionDesc` varchar(1000) DEFAULT NULL,
  `jobDetail` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`positionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  soeasy.hr_position 的数据：~0 rows (大约)
DELETE FROM `hr_position`;

-- 导出  表 soeasy.hr_position_level 结构
DROP TABLE IF EXISTS `hr_position_level`;
CREATE TABLE IF NOT EXISTS `hr_position_level` (
  `id` int NOT NULL AUTO_INCREMENT,
  `positionID` int DEFAULT NULL,
  `levelID` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='职位职级对应表';

-- 正在导出表  soeasy.hr_position_level 的数据：~0 rows (大约)
DELETE FROM `hr_position_level`;

-- 导出  表 soeasy.org_company 结构
DROP TABLE IF EXISTS `org_company`;
CREATE TABLE IF NOT EXISTS `org_company` (
  `companyID` int NOT NULL AUTO_INCREMENT,
  `companyPID` int DEFAULT NULL,
  `companyName` varchar(200) DEFAULT NULL,
  `companyCode` varchar(50) DEFAULT NULL,
  `companyDESC` varchar(1000) DEFAULT NULL,
  `isGroup` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`companyID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='公司架构表';

-- 正在导出表  soeasy.org_company 的数据：~1 rows (大约)
DELETE FROM `org_company`;
INSERT INTO `org_company` (`companyID`, `companyPID`, `companyName`, `companyCode`, `companyDESC`, `isGroup`) VALUES
	(1, 1, '根目录', 'ROOT', '集团公司根', 1);

-- 导出  表 soeasy.org_dept 结构
DROP TABLE IF EXISTS `org_dept`;
CREATE TABLE IF NOT EXISTS `org_dept` (
  `deptID` int NOT NULL AUTO_INCREMENT,
  `deptName` varchar(200) DEFAULT NULL,
  `deptPID` int DEFAULT NULL,
  `companyID` int DEFAULT NULL,
  `deptDesc` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`deptID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='组织架构表';

-- 正在导出表  soeasy.org_dept 的数据：~0 rows (大约)
DELETE FROM `org_dept`;

-- 导出  表 soeasy.sys_menu 结构
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE IF NOT EXISTS `sys_menu` (
  `menuID` int NOT NULL,
  `menuName` varchar(200) DEFAULT NULL,
  `url` varchar(1000) DEFAULT NULL,
  `menuPID` int DEFAULT NULL,
  `menuDesc` varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `divider` int DEFAULT '0',
  `sortID` int DEFAULT NULL,
  PRIMARY KEY (`menuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='菜单(权限)';

-- 正在导出表  soeasy.sys_menu 的数据：~11 rows (大约)
DELETE FROM `sys_menu`;
INSERT INTO `sys_menu` (`menuID`, `menuName`, `url`, `menuPID`, `menuDesc`, `divider`, `sortID`) VALUES
	(1, '后台管理', '/', 0, 'EHR系统管理员功能', 0, 10000),
	(2, '添加公司', '/addCompany', 1, '增加一家公司或集团', 0, 10200),
	(3, '公司禁用', '/stopUse', 1, '禁用一家公司或集团', 0, 10100),
	(4, '集团管理', '/', 0, '集团HRD功能', 0, 20000),
	(5, '公司架构', '/CompanyOrg', 4, '定义集团法人结构', 0, 20100),
	(6, '职位管理', '/', 4, '定认集团职位结构', 1, 20200),
	(7, '薪资项目', '/payrollItem', 4, '定义集团薪资项目', 1, 20400),
	(8, '员工类别', '/empType', 4, '定义集团员工类别', 1, 20300),
	(9, '系统日志', '/syslog', 1, '系统运行日志', 0, 10300),
	(10, '添加职位', '/position/add', 6, '添加一个职位', 0, 20201),
	(11, '删除职位', '/position/delete', 6, '删除一个职位', 0, 20202);

-- 导出  表 soeasy.sys_role 结构
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE IF NOT EXISTS `sys_role` (
  `roleID` int NOT NULL AUTO_INCREMENT,
  `roleName` varchar(200) NOT NULL,
  `roleDesc` varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  soeasy.sys_role 的数据：~2 rows (大约)
DELETE FROM `sys_role`;
INSERT INTO `sys_role` (`roleID`, `roleName`, `roleDesc`) VALUES
	(1, 'EHR系统管理员', '整个系统的后台管理(添加公司或集团)'),
	(2, '集团系统管理员', '维护整个信团的公司管理架构');

-- 导出  表 soeasy.sys_role_menu 结构
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE IF NOT EXISTS `sys_role_menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `roleID` int DEFAULT NULL,
  `menuID` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  soeasy.sys_role_menu 的数据：~9 rows (大约)
DELETE FROM `sys_role_menu`;
INSERT INTO `sys_role_menu` (`id`, `roleID`, `menuID`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(3, 1, 3),
	(4, 2, 4),
	(5, 2, 5),
	(6, 2, 6),
	(7, 2, 9),
	(8, 2, 10),
	(9, 2, 11);

-- 导出  表 soeasy.sys_user 结构
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE IF NOT EXISTS `sys_user` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `userCode` varchar(50) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `userPWD` varchar(1000) DEFAULT NULL,
  `userStatus` int DEFAULT NULL,
  `logInfo` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='系统用户表';

-- 正在导出表  soeasy.sys_user 的数据：~1 rows (大约)
DELETE FROM `sys_user`;
INSERT INTO `sys_user` (`userID`, `userCode`, `userName`, `userPWD`, `userStatus`, `logInfo`) VALUES
	(1, 'admin', 'ehr后台管理员', '123456', 1, NULL);

-- 导出  表 soeasy.sys_user_role 结构
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE IF NOT EXISTS `sys_user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userID` int DEFAULT NULL,
  `roleID` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  soeasy.sys_user_role 的数据：~2 rows (大约)
DELETE FROM `sys_user_role`;
INSERT INTO `sys_user_role` (`id`, `userID`, `roleID`) VALUES
	(1, 1, 1),
	(2, 1, 2);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
