
--liquibase formatted sql

--changeset sparsh:create_1st_table.sql

create table first_table(
    id int,
    name varchar(255),
    full_name varchar(255),
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    updated_by bigint,
    ip_address VARCHAR(25);
);