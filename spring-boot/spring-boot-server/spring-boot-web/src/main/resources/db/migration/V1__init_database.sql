DROP TABLE IF EXISTS `active_info`;

CREATE TABLE `active_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(64) COLLATE utf8mb4_bin NOT NULL,
  `size` int(11) NOT NULL,
  `score` double(20,2) NOT NULL,
  `type` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;