CREATE TABLE user (
                       id bigint(20) NOT NULL AUTO_INCREMENT,
                       email varchar(100) NOT NULL unique,
                       first_name varchar(50) NOT NULL,
                       last_name varchar(50) DEFAULT NULL,
                       PRIMARY KEY (id),
                       UNIQUE KEY UK_email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;