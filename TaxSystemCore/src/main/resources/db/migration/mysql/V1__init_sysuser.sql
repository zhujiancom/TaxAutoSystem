CREATE TABLE if not exists `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL,
  `createdate` datetime DEFAULT NULL,
  `createman` varchar(255) DEFAULT NULL,
  `updatedate` datetime DEFAULT NULL,
  `updateman` varchar(255) DEFAULT NULL,
  `enable` bit(1) DEFAULT NULL,
  `login_count` int(11) DEFAULT NULL,
  `login_status` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into SYS_USER(id,username,password,version) values (1,'admin','5f4dcc3b5aa765d61d8327deb882cf99',0);
insert into sys_user(id,username,password,version) values (2,'test','098f6bcd4621d373cade4e832627b4f6',0);

CREATE TABLE if NOT EXISTS `sys_role` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` int(11) NOT NULL,
 `createdate` datetime DEFAULT NULL,
 `createman` varchar(255) DEFAULT NULL,
 `updatedate` datetime DEFAULT NULL,
 `updateman` varchar(255) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert into sys_role(id,name,version) values (1,'administrator',0);
insert into sys_role(id,name,version) values (2,'user',0);

CREATE TABLE IF NOT EXISTS `sys_role_user` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` int(11) NOT NULL,
 `sys_role_id` bigint(20) DEFAULT NULL,
 `sys_user_id` bigint(20) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert into sys_role_user(SYS_USER_ID,SYS_ROLE_ID,version) values (1,1,0);
insert into sys_role_user(SYS_USER_ID,SYS_ROLE_ID,version) values (2,2,0);

CREATE TABLE if not EXISTS `sys_permission` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` int(11) NOT NULL,
 `createdate` datetime DEFAULT NULL,
 `createman` varchar(255) DEFAULT NULL,
 `updatedate` datetime DEFAULT NULL,
 `updateman` varchar(255) DEFAULT NULL,
 `description` varchar(255) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 `pid` bigint(20) DEFAULT NULL,
 `url` varchar(255) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert into sys_permission(name,description,url,pid,version) values ('role_home','home','/',null,0);
insert into sys_permission(name,description,url,pid,version) values ('role_admin','test','/admin',null,0);

CREATE TABLE IF NOT EXISTS `sys_permission_role` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` int(11) NOT NULL,
 `permission_id` bigint(20) DEFAULT NULL,
 `role_id` bigint(20) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into sys_permission_role(permission_id,role_id,version) values (1,1,0);
insert into sys_permission_role(permission_id,role_id,version) values (1,2,0);
insert into sys_permission_role(permission_id,role_id,version) values (2,1,0);
