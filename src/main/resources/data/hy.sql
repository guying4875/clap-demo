
DROP TABLE IF EXISTS hy_base_resource;

CREATE TABLE hy_base_resource (
  id int(11) NOT NULL,
  name varchar(45) DEFAULT NULL,
  url varchar(45) DEFAULT NULL,
  level varchar(45) DEFAULT NULL,
  parent_id int(11) DEFAULT NULL,
  is_menu int(11) DEFAULT NULL COMMENT '是否为菜单',
  state int(11) DEFAULT '1',
  create_time date DEFAULT NULL,
  modify_time date DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';

--
-- Dumping data for table hy_base_resource
--

LOCK TABLES hy_base_resource WRITE;
INSERT INTO hy_base_resource VALUES (1,'角色管理','role/list.htm','2',1,0,1,'2017-11-18','2017-11-18'),(2,'角色管理','role/list.htm','2',1,0,1,'2017-11-18','2017-11-18'),(4,'角色管理','role/list.htm','2',1,0,1,'2017-11-18','2017-11-18'),(5,'角色管理','role/list.htm','2',1,0,1,'2017-11-18','2017-11-18');
UNLOCK TABLES;

--
-- Table structure for table hy_base_role
--

DROP TABLE IF EXISTS hy_base_role;
CREATE TABLE hy_base_role (
  id int(11) NOT NULL,
  name varchar(45) DEFAULT NULL,
  commont varchar(100) DEFAULT NULL,
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  modify_time date DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table hy_base_role
--

--
-- Table structure for table hy_base_role_resource
--

DROP TABLE IF EXISTS hy_base_role_resource;
CREATE TABLE hy_base_role_resource (
  id int(11) NOT NULL,
  role_id int(11) NOT NULL,
  res_id int(11) DEFAULT NULL,
  create_time varchar(45) DEFAULT 'now()',
  modify_time varchar(45) DEFAULT 'now()',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源表';

--
-- Dumping data for table hy_base_role_resource
--

--
-- Table structure for table hy_base_user
--

DROP TABLE IF EXISTS hy_base_user;
CREATE TABLE hy_base_user (
  id int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';


--
-- Table structure for table hy_base_user_role
--

DROP TABLE IF EXISTS hy_base_user_role;
CREATE TABLE hy_base_user_role (
  id int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


