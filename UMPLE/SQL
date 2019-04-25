//%% NEW FILE Stand BEGINS HERE %%

-- PLEASE DO NOT EDIT THIS CODE
-- This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!



CREATE TABLE IF NOT EXISTS `stand`
(
  /*------------------------*/
  /* MEMBER VARIABLES       */
  /*------------------------*/
  
  /*stand Attributes*/
  navn VARCHAR(255),
  PRIMARY KEY(navn)

);






//%% NEW FILE Vote BEGINS HERE %%

-- PLEASE DO NOT EDIT THIS CODE
-- This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!



CREATE TABLE IF NOT EXISTS `vote`
(
  /*------------------------*/
  /* MEMBER VARIABLES       */
  /*------------------------*/

  /*vote Associations*/
  stand_navn VARCHAR(255),
  
  /*vote Attributes*/
  brukerid VARCHAR(255),
  standid BLOB,
  stemmevekt INT,
  PRIMARY KEY(brukerid)

);


ALTER TABLE `vote` ADD CONSTRAINT `fk_vote_stand_navn` FOREIGN KEY (`stand_navn`) REFERENCES `stand`(`navn`);




//%% NEW FILE AverageStandScore BEGINS HERE %%

-- PLEASE DO NOT EDIT THIS CODE
-- This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!



CREATE TABLE IF NOT EXISTS `average_stand_score`
(
  /*------------------------*/
  /* MEMBER VARIABLES       */
  /*------------------------*/
  
  /*average_stand_score Attributes*/
  stand_navn VARCHAR(255),
  vote DOUBLE,
  amount INT,
  PRIMARY KEY(stand_navn)

);
