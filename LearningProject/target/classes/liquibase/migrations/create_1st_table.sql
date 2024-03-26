
--liquibase formatted sql

--changeset sparsh:create_1st_table.sql

create table first_table(
    id int,
    name varchar(255),
    full_name varchar(255)
);