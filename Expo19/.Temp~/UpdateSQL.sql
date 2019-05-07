-- Stand [ent2]
create table "stand" (
   "standid"  int4  not null,
   "navn"  varchar(255),
  primary key ("standid")
);


-- Vote [ent3]
create table "vote" (
   "brukerid"  int4  not null,
   "standid"  int4  not null,
   "vekt"  int4,
  primary key ("brukerid", "standid")
);


