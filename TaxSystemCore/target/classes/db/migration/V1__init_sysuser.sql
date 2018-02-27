insert into SYS_USER(id,username,password) values (1,'admin','5f4dcc3b5aa765d61d8327deb882cf99');
insert into sys_user(id,username,password) values (2,'test','098f6bcd4621d373cade4e832627b4f6');


insert into sys_role(id,name) values (1,'administrator');
insert into sys_role(id,name) values (2,'user');

insert into sys_role_user(SYS_USER_ID,SYS_ROLE_ID) values (1,1);
insert into sys_role_user(SYS_USER_ID,SYS_ROLE_ID) values (2,2);

insert into sys_permission(id,name,description,url,pid) values (1,'role_home','home','/',null);
insert into sys_permission(id,name,description,url,pid) values (2,'role_admin','test','/admin',null);

insert into sys_permission_role values (1,1,1);
insert into sys_permission_role values (2,1,2);
insert into sys_permission_role values (3,2,1);
