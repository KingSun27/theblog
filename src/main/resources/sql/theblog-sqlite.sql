CREATE TABLE `blog` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  `title` varchar(45) NOT NULL,
  `content` varchar(4000) NOT NULL,
  `description` varchar(100) ,
  `create_time` TEXT(32) ,
  `update_time` TEXT(32)
);

