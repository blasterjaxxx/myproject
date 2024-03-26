--liquibase formatted sql

--changeset sparsh:alter_and_drop_table.sql


alter table first_table add primary key (`id`);
alter table first_table MODIFY id int AUTO_INCREMENT;