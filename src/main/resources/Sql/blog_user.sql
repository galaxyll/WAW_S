CREATE TABLE `blog_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `emil` varchar(50) NOT NULL COMMENT '邮箱',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `sex` varchar(5) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  `school` varchar(50) DEFAULT NULL,
  `college` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `signature` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='博客用户表';


20191105 CREATE BY TCH