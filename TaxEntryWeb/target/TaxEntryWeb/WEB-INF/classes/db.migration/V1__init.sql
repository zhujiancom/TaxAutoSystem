use SCHEMA tax_auto_system;
insert into tax_auto_system.t_login_account(login_name,password,login_status,enable,version)
values ('admin','password','offline',1,0);
COMMIT ;