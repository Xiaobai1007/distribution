drop database if exists logisticsDB;
create database logisticsDB;

use logisticsDB;

#用户组
create table ecs_usergroup
(
	usergroup_id varchar(10) primary key comment '用户组ID',
	usergroup_name varchar(10) comment '用户组名称',
	remark varchar(50) comment '备注'
) default charset = utf8;

insert into ecs_usergroup values('10070926','这个题目真的很烦','我不想录数据');

#消费者
create table ecs_consumer
(
	consumer_id varchar(10) primary key comment '消费者ID',
	consumer_name varchar(10) comment '姓名',
	consumer_sex int comment '性别',
	usergroup_id varchar(10) comment '用户组ID',
	`password` varchar(10) comment '密码',
	consumer_phone varchar(20) comment '联系电话',
	birthday datetime comment '出生日期',
	address varchar(50) comment '地址',
	remark varchar(50) comment '备注',
	foreign key(usergroup_id) references ecs_usergroup(usergroup_id)
) default charset = utf8;

insert into ecs_consumer values('10250926','郭世棋',1,'10070926','Qi1007','18370622009','1999-10-07','江西省吉安市青原区','我不想录数据');

#订单
create table ecs_order
(
	order_id varchar(10) primary key comment '订单ID',
	order_type int comment '订单类型',
	handover_id varchar(10) comment '交接单编号',
	goods_name varchar(20) comment '货物名称',
	goods_weight int comment '货物重量',
	mailer varchar(20) comment '邮寄人',
	mailing_address varchar(50) comment '邮寄地址',
	receiving_address varchar(50) comment '收货地址',
	order_status int comment '订单状态',
	mailer_phone varchar(20) comment '邮寄人电话',
	consignee varchar(20) comment '收货人',
	consignee_phone varchar(20) comment '收货人电话',
	start_city varchar(10) comment '起始城市',
	midpoint_city varchar(10) comment '中点城市',
	end_city varchar(10) comment '终点城市',
	shipping_price decimal(18,0) comment '运送价格',
	distribution_price decimal(18,0) comment '配送价格',
	transpory_price decimal(18,0) comment '运输价格',
	total_price varchar(10) comment '总价格',
	vehicle_id varchar(10) comment '车辆',
	remark varchar(50) comment '备注'
) default charset = utf8;

insert into ecs_order values('1000001',1,'100001','我不想录数据',20000,'郭小白','江西省吉安市青原区','江西省吉安市青原区',0,'18370622009','陶欣','13684860787','青原区','青原区','青原区',1000,1000,1000,'1000','不想录数据','我不想录数据');

#省份
create table ecs_province
(
	province_id varchar(10) primary key comment '省份ID',
	province_name varchar(10) comment '名称'
) default charset = utf8;
insert into ecs_province values('343009','江西省');

#城市
create table ecs_city
(
	city_id varchar(10) primary key comment '城市ID',
	city_name varchar(10) comment '城市名称',
	province_id varchar(10) comment '省份ID',
	foreign key(province_id) references ecs_province(province_id)
) default charset = utf8;
insert into ecs_city values('343000','吉安市','343009');

#城市区域
create table ecs_region
(
	region_id varchar(10) primary key comment '区域ID',
	region_name varchar(50) comment '区域名称',
	city_id varchar(50) comment '城市ID',
	foreign key(city_id) references ecs_city(city_id)	
) default charset = utf8;
insert into ecs_region values('110001','青原区','343000');

#路线
create table ecs_route
(
	route_id varchar(10) primary key comment '路线编号',
	route_name varchar(10) comment '路线名称',
	start_province_id varchar(10) comment '起始省份编号',
	start_city_id varchar(10) comment '起始城市编号',
	midpoint_province_id varchar(10) comment '中点省份编号',
	midpoint_city_id varchar(10) comment '中点城市编号',
	end_province_id varchar(10) comment '终点省份编号',
	end_city_id varchar(10) comment '终点城市编号',
	transport_price decimal(18,0) comment '运输价格',
	remark varchar(50) comment '备注',
	foreign key(start_province_id) references ecs_province(province_id),
	foreign key(start_city_id) references ecs_city(city_id),
	foreign key(midpoint_province_id) references ecs_province(province_id),
	foreign key(midpoint_city_id) references ecs_city(city_id),
	foreign key(end_province_id) references ecs_province(province_id),
	foreign key(end_city_id) references ecs_city(city_id)
) default charset = utf8;
insert into ecs_route values('111111','昌吉赣','343009','343000','343009','343000','343009','343000',10000,'我不想录数据');

#车辆
create table ecs_vehicle
(
	vehicle_id varchar(10) primary key comment '车辆编号',
	vehicle_model varchar(10) comment '车辆型号',
	producing_area varchar(20) comment '产地',
	route_id varchar(10) comment '路线编号',
	manufacture_date datetime comment '生产日期',
	purchasing_date datetime comment '购买日期',
	remark varchar(50) comment '备注',
	foreign key(route_id) references ecs_route(route_id)
) default charset = utf8;
insert into ecs_vehicle values('110011','东风','江西','111111','2018-10-07','2018-10-19','我不想录数据');

#管理员
create table ecs_admin
(
	admin_id varchar(10) primary key comment '管理员编号',
	admin_name varchar(10) comment '姓名',
	admin_sex int comment '性别',
	usergroup_id varchar(10) comment '用户组编号',
	admin_status int comment '状态',
	location varchar(10) comment '所在城市',
	address varchar(10) comment '地址',
	`password` varchar(10) comment '密码',
	admin_phone varchar(20) comment '联系电话',
	remark varchar(50) comment '备注',
	foreign key(usergroup_id) references ecs_usergroup(usergroup_id)
) default charset = utf8;
insert into ecs_admin values('101010','郭世棋',1,'10070926',0,'江西省','吉安市','10070926','18370622009','我不想录数据'); 

#交接单
create table ecs_handover
(
	start_city varchar(10) primary key comment '起点城市',
	end_city varchar(10) comment '终点城市',
	garden_city varchar(10) comment '已到城市',
	handover_status int comment '状态',
	rise_time datetime default now() comment '生成时间',
	remark varchar(50) comment '备注'
) default charset = utf8;
insert into ecs_handover values('吉安','吉安','吉安',1,'2018-09-09','我不想录数据');

#配送点
create table ecs_distribution
(
	distribution_id int primary key comment '配送点ID',
	distribution_name varchar(10) comment '配送点名称',
	province_id varchar(10) comment '省份ID',
	city_id varchar(10) comment '城市ID',
	admin_id varchar(10)comment '管理员ID',
	distribution_phone varchar(20) comment '联系电话',
	distribution_address varchar(50) comment '地址',
	remark varchar(50) comment '备注',
	foreign key(province_id) references ecs_province(province_id),
	foreign key(city_id) references ecs_city(city_id),
	foreign key(admin_id) references ecs_admin(admin_id)	
) default charset = utf8;
insert into ecs_distribution values('100000','南昌','343009','343000','101010','18370622009','江西省吉安市青原区','我不想录数据');

#配送范围
create table ecs_distributionScope
(
	distribution_area int primary key comment '配送区域ID',
	distribution_area_name varchar(10) comment '配送区域名称',
	distribution_price decimal comment '配送价格',
	owned_city_id varchar(10) comment '所属城市ID',
	remark varchar(50) comment '备注',
	foreign key(owned_city_id) references ecs_city(city_id)
) default charset = utf8;
insert into ecs_distributionScope values(1,'我不想告诉你',10000,'343000','我不想录数据');

