BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "supplrecord" (
	"pname"	TEXT,
	"qnty"	NUMERIC,
	"price"	INTEGER
);
CREATE TABLE IF NOT EXISTS "membrecord" (
	"name"	VARCHAR,
	"surname"	VARCHAR,
	"fname"	VARCHAR,
	"contact"	VARCHAR,
	"address"	VARCHAR,
	"address1"	VARCHAR,
	"image"	BLOB,
	"gender"	CHAR,
	"fees"	VARCHAR
);
CREATE TABLE IF NOT EXISTS "Audit" (
	"audit_id"	INTEGER,
	"emp_id"	INTEGER,
	"date"	VARCHAR,
	"status"	VARCHAR,
	PRIMARY KEY("audit_id")
);
CREATE TABLE IF NOT EXISTS "Users" (
	"id"	INTEGER,
	"username"	VARCHAR,
	"password"	VARCHAR,
	"division"	VARCHAR
);
INSERT INTO "Audit" ("audit_id","emp_id","date","status") VALUES (1,0,'12:28:19 / 27 Jun, 2020','Added Record');
INSERT INTO "Audit" ("audit_id","emp_id","date","status") VALUES (2,0,'12:31:28 / 27 Jun, 2020','Added Record');
COMMIT;
