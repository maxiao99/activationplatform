# 项目说明

## 表命名规范：
表名以tb_或td_开头(留个好习惯),如:菜单表:tb_menu

## JAVA目录
* bo
    基本对象,对应数据库相应的表信息。
	如:菜单表,UserBase,User两个类Base对应的是数据的各个字段信息,非Base类是对基础类的扩展.
* vo
    前端交互数据。
* dto
    扩展数据。
* dao
    持久层。
	如:UserMapper,对应mybatis文件中相应的SQL方法.UserDao,UserDaoImpl.
* service
    service层,事务配置在此.
	如:UserService，UserServiceImpl.
目前只能使用XML方式来配置事务.基本方法中增删改查为,save,update,del,find.
* web
    service层,事务配置在此.
	如:UserService，UserServiceImpl.

## XML文件
* xml文件mapper。
	如：BaseUserMapper.xml，基础XML文件，包括增删改查方法。UserMapper是XML的扩展，自定义方法放在里面。
	
## 后台分页逻辑计算
```
对应UserMapper.xml方法名findPage* 开头就能拦截分页
```

## 自动生成项目格式代码
```
1. 使用changelog/plugins下的code.war
2. tomcat部署
3. 访问主页http://ip:port/code/
```

## 编码工具
```
推荐使用IDEA，和maven有很好的集成
```

## 项目启动
```
可以打包放入tomcat，或使用集成的maven的tomcat启动
```

## 访问路径
```
http://localhost:30000
```
	