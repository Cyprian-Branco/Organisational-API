CREATE DATABASE organisational_api;
\c organisational_api;

CREATE TABLE IF NOT EXISTS users (
id SERIAL PRIMARY KEY,
username VARCHAR,
company_position VARCHAR,
role VARCHAR,
departmentid int
);

CREATE TABLE IF NOT EXISTS departments (
id SERIAL PRIMARY KEY,
deptName VARCHAR,
description VARCHAR,
noOfEmployees int
);
