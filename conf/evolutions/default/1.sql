# Tasks schema

# --- !Ups

CREATE SEQUENCE trans_id_seq start with 1000;
CREATE TABLE trans (
    id integer NOT NULL DEFAULT nextval('trans_id_seq'),
    user_id varchar(255) NOT NULL,
    credit_amount decimal(12,8) default 0,
    credit_account int(8) NOT NULL,
    debit_amount decimal(12,8) DEFAULT 0,
    debit_account int(8) NOT NULL,
    note varchar(255),
    external_id varchar (255),
    created_date timestamp NOT NULL
);

-- CREATE SEQUENCE user_id_seq start with 1000;
-- CREATE TABLE user (
--     id integer NOT NULL DEFAULT nextval('user_id_seq'),
--     userId varchar(255)
--    name varchar (255)
--    email varchar (255)user
--    password varchar (255)
-- );

# --- !Downs

DROP TABLE trans;
DROP SEQUENCE trans_id_seq;