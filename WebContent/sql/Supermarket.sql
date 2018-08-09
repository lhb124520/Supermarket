create database Supermarket;
show databases;
-- drop database userinfo; 
use Supermarket;
-- 员工用户信息
create table UserInfo(
UserID int PRIMARY KEY auto_increment,
UserName VARCHAR(20),
Password VARCHAR(20),
Sex varchar(6),
Phone VARCHAR(20),
Address VARCHAR(20),
position VARCHAR(10)
)engine=innodb default charset='utf8';
insert into userinfo value(1,'张三','111','男','17788990909','湖南理工学院','系统管理员');
insert into userinfo value(9,'高小姐','111','女','15576098874','湖南岳阳','收银员');
insert into userinfo value(11,'高育良','123','男','17784390909','广州芳村','采购员');
insert into userinfo value(13,'刘新建','123123','男','17767340909','深圳南山区','顾客');
--  update InGoodsInfo set GoodsNum =90 where GoodsName ='石油1吨';
-- select GoodsNum from  InGoodsInfo where GoodsName='石油1吨';
-- select * from UserInfo where UserName ="刘新建" and position="顾客";
-- select * from  UserInfo;
-- select * from UserInfo where UserID = 1 and position="系统管理员";
-- select * from UserInfo where UserID = 1;
-- drop table UserInfo;
show tables;
select * from UserInfo;

-- 供应商信息
create table Supplier(
SupplierID int PRIMARY KEY auto_increment,
SupplierName VARCHAR(20),
ContactsName VARCHAR(20),
ContactsPhone varchar(20),
SupplierAddress VARCHAR(20),
Remarks VARCHAR(20)
)engine=innodb default charset='utf8';
-- drop table Supplier;
show tables;
select * from Supplier;
-- select SupplierName from  Supplier;
-- select GoodsName from  InGoodsInfo;


-- 进货信息
create table InGoodsInfo(
GoodsID int PRIMARY KEY auto_increment,
UserName VARCHAR(20),
SupplierName VARCHAR(20),
StoreName varchar(6),
GoodsName VARCHAR(20),
GoodsInPrice float,
GoodsNum int

)engine=innodb default charset='utf8';
-- drop table InGoodsInfo;
show tables;
select * from InGoodsInfo;
-- alter table UserInfo add constraint FK_ID foreign key(UserID) REFERENCES InGoodsInfo(EmpID);

-- 销售信息
create table SaleInfo(
SaleID int PRIMARY KEY auto_increment,
UserName VARCHAR(20),-- 收银员
GoodsName VARCHAR(20),
GoodsInPrice float,
GoodsNum int,
GoodsTime VARCHAR(20)

)engine=innodb default charset='utf8';
-- drop table SaleInfo;
show tables;
select * from InGoodsInfo;

-- 退货信息
create table ReturngoodsInfo(
ReturngoodsID int PRIMARY KEY auto_increment,
UserName VARCHAR(20),
SaleID int,
ReturnGoodsInPrice float,
ReturnGoodsNum int,
ReturnGoodsReason VARCHAR(20),
advice VARCHAR(20)

)engine=innodb default charset='utf8';
-- drop table ReturngoodsInfo;
show tables;
select * from ReturngoodsInfo;

-- 库存信息
create table StockInfo(
StockID int PRIMARY KEY auto_increment,
GoodsName VARCHAR(20),
SupplierName VARCHAR(20),
StoreName VARCHAR(20),
StoreNum int,
WarnNum int
)engine=innodb default charset='utf8';
-- drop table StockInfo;
show tables;
select * from StockInfo;