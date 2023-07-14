CREATE ROLE postgres WITH
	SUPERUSER
	CREATEDB
	CREATEROLE
	INHERIT
	LOGIN
	REPLICATION
	BYPASSRLS
	CONNECTION LIMIT -1;

CREATE SCHEMA "vv-schema" AUTHORIZATION postgres;

create table if not exists customers (
	id int4 NOT NULL,
	"name" varchar(255) NOT NULL,
	CONSTRAINT "Customer_pkey" PRIMARY KEY (id)
);