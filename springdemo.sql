CREATE TABLE notices(
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(60) NOT NULL,
  texts TEXT NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
