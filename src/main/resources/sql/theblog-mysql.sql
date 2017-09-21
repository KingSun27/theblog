CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL COMMENT '标题',
  `content` varchar(4000) DEFAULT NULL COMMENT '内容',
  `description` varchar(100) DEFAULT NULL,
  `create_time` timestamp(6) NULL DEFAULT NULL,
  `update_time` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

