--liquibase formatted sql

--changeset sparsh:update_first_table_1.sql

alter table first_table drop column created_at;
alter table first_table drop column updated_at;
alter table first_table drop column updated_by;
alter table first_table drop column ip_address;


alter table first_table add column created_at TIMESTAMP DEFAULT NOW();
alter table first_table add column updated_at TIMESTAMP DEFAULT NOW();
alter table first_table add column updated_by bigint;
alter table first_table add column ip_address VARCHAR(25);