-- ----------------------------
--  Table structure for `User`
-- ----------------------------
DROP DATABASE IF EXISTS Books1; 
CREATE DATABASE Books1;-- 
USE Books1;

CREATE TABLE `User` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Address1` varchar(50) DEFAULT NULL,
  `Address2` varchar(50) NOT NULL,
  `City` varchar(50) DEFAULT NULL,
  `State` varchar(50) DEFAULT NULL,
  `zipcode` int(11) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
);

INSERT INTO User(FirstName,LastName,Email,Address1, Address2, City,State,zipcode, Country)
VALUES("John","Doe","john.doe@outlook.com","9201 University BLVD","9201 University BLVD","Charlotte","NC","22012","USA"),
("Edson","Sierra","esierra1@outlook.com","9002 North University Terrace","9201 University BLVD","Charlotte","NC","22012","USA");


-- ----------------------------
--  Table structure for `Product`
-- ----------------------------

CREATE TABLE `Product` (
  `ProductCode` varchar(11) NOT NULL DEFAULT '0',
  `ProductName` varchar(50) DEFAULT NULL,
  `CategoryCode` int(11) DEFAULT NULL,
  `CatalogCategory` varchar(50) DEFAULT NULL,
  `Description` varchar(1000) DEFAULT NULL,
  `Price` float(11,0) DEFAULT NULL,
  `ImageURL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ProductCode`)
);  
INSERT INTO Product(ProductCode,ProductName,CategoryCode,CatalogCategory,Description,Price,ImageURL)
VALUES("1","The Emperator's Soul",1,"Bestsellers","When Shai is caught replacing the Moon Scepter with her nearly flawless forgery, she must bargain for her life. An assassin has left the Emperor Ashravan without consciousness, a circumstance concealed only by the death of his wife ",22.0,"includes/img/13578175.jpg"),
("2","Longbourn",1,"Bestsellers","While Elizabeth Bennet and her sisters fuss over balls and husbands, Sarah, their orphaned housemaid, is beginning to chafe against the boundaries of her class. ",17.0,"includes/img/long.jpg"),
("3","The Last Chinese Chef",1,"Bestsellers"," When widowed American food writer Maggie McElroy is hit by a paternity claim against her husband’s estate, she has to go to China immediately. She asks her magazine for time off. ",22.0,"includes/img/42-p13-LastChineseChef.jpg"),
("4","The Flame Throwers",2,"New","The year is 1975 and Reno—so-called because of the place of her birth—has come to New York intent on turning her fascination with motorcycles and speed into art. Her arrival coincides with an explosion of activity in that world—artists. have colonized a deserted and industrial SoHo and are blurring the line between life and art",21.0,"includes/img/flame.jpg"),
("5","Broken Monsters",2,"New","''Scary as hell and hypnotic. I couldn't put it down...I'd grab it if I were you.'"" —Stephen King A criminal mastermind creates violent tableaus in abandoned Detroit warehouses in Lauren Beukes's new genre-bending novel of suspense. ",18.0,"includes/img/BrokenMonsters.JPG"),
("6","Personal",2,"New","Jack Reacher returns in the latest fast-moving, action-packed, suspenseful book from #1 New York Times bestselling author Lee Child. You can leave the army, but the army doesn’t leave you. Not always. Not completely, notes Jack Reacher—and sure enough, the retired military cop is soon pulled back into service. This time, for the State Department and the CIA ",16.0,"includes/img/LeeChildPersonal.JPG");



CREATE TABLE `Orders` (
`OrderNumber` int(50) NOT NULL AUTO_INCREMENT,
 `Date` varchar(50) NOT NULL,
 `User` varchar(50) NOT NULL,
 `TaxRate` double(11,0) NOT NULL,
 `Cost` double(50,0) NOT NULL,
 `HasPaid` boolean NOT NULL,
 PRIMARY KEY (`OrderNumber`)
  -- FOREIGN KEY (User) REFERENCES User(UserID) 
);

CREATE TABLE `OrderItem` (
 `OrderNumber` int(50) NOT NULL,
 `ProductCode` varchar(50) NOT NULL,
 `Quantity` int(11) NOT NULL,
 PRIMARY KEY (`OrderNumber`,`ProductCode`)
 --  FOREIGN KEY (OrderNumber) REFERENCES Orders(OrderNumber)
);
CREATE TABLE UserPass (
  Username varchar(15) NOT NULL PRIMARY KEY,
  Password varchar(15) NOT NULL
);
  
INSERT INTO UserPass VALUES ('admin', 'admin'),
                            ('anne', 'sesame');
                          
CREATE TABLE UserRole (   
  Username VARCHAR(15) NOT NULL,
  Rolename VARCHAR(15) NOT NULL,

  PRIMARY KEY (Username, Rolename)
);
  
INSERT INTO UserRole VALUES ('andrea', 'service'),
                            ('andrea', 'programmer'),
                            ('admin', 'programmer');

