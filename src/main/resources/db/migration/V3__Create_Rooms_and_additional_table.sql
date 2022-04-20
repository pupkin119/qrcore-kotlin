CREATE TABLE room (
        id bigint(20) NOT NULL AUTO_INCREMENT,
        name varchar(100) NOT NULL,
        number varchar(50) NOT NULL,
        description varchar(400) DEFAULT NULL,
        PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE department (
        id bigint(20) NOT NULL AUTO_INCREMENT,
        name varchar(100) NOT NULL,
        description varchar(400) DEFAULT NULL,
        PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE queue (
        id bigint(20) NOT NULL AUTO_INCREMENT,
        room_id bigint(20) NOT NULL,
        department_id bigint(20) NOT NULL,
        user_id bigint(20) NOT NULL,
        description varchar(400) DEFAULT NULL,
        create_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;