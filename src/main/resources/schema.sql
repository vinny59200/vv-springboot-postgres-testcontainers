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

CREATE TABLE if not exists "vv-schema".customer (
    id int4 NOT NULL,
    "name" varchar(255) NOT NULL,
    CONSTRAINT "Customer_pkey" PRIMARY KEY (id)
);