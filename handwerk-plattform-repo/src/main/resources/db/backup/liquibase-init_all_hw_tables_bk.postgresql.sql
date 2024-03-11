-- liquibase formatted sql

-- changeset Alex:1710100913837-1
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='days_of_week';
CREATE TABLE "days_of_week" ("day" SMALLINT, "offer" BIGINT NOT NULL);

-- changeset Alex:1710100913837-2
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='offer';
CREATE TABLE "offer" ("active" BOOLEAN, "currency" SMALLINT, "price" FLOAT8, "time_from" time(6) WITHOUT TIME ZONE, "time_to" time(6) WITHOUT TIME ZONE, "cat_id" BIGINT NOT NULL, "creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "master_id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "valid_by" TIMESTAMP WITHOUT TIME ZONE, "activity" VARCHAR(255), "description" VARCHAR(255), "title" VARCHAR(255), "unit" VARCHAR(255), CONSTRAINT "offer_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-3
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='add_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "add_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-4
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='cat_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "cat_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-5
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='cert_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "cert_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-6
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='ct_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "ct_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-7
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='cust_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "cust_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-8
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='emp_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "emp_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-9
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='ms_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "ms_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-10
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='of_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "of_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-11
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='pf_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "pf_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-12
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.sequences WHERE sequence_name='rev_id_seq'
CREATE SEQUENCE  IF NOT EXISTS "rev_id_seq" AS bigint START WITH 1 INCREMENT BY 50 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset Alex:1710100913837-13
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='address';
CREATE TABLE "address" ("creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "city" VARCHAR(255), "country" VARCHAR(255), "postcode" VARCHAR(255), "street_name" VARCHAR(255), "street_nr" VARCHAR(255), CONSTRAINT "address_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-14
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='category';
CREATE TABLE "category" ("creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "classification_id" VARCHAR(255), "description" VARCHAR(255), "name" VARCHAR(255), "parent_cat" VARCHAR(255), CONSTRAINT "category_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-15
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='certificate';
CREATE TABLE "certificate" ("score" FLOAT8, "cat_id" BIGINT NOT NULL, "creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "master_id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "activity" VARCHAR(255), "authority" VARCHAR(255), "description" VARCHAR(255), "title" VARCHAR(255), CONSTRAINT "certificate_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-16
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='contact';
CREATE TABLE "contact" ("creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "master_id" BIGINT, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "email" VARCHAR(255), "phone_number" VARCHAR(255), CONSTRAINT "contact_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-17
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='customer';
CREATE TABLE "customer" ("active" BOOLEAN, "creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "name" VARCHAR(255), "photo_src" VARCHAR(255), "second_name" VARCHAR(255), "type" VARCHAR(255), CONSTRAINT "customer_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-18
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='employee';
CREATE TABLE "employee" ("creation_date" TIMESTAMP WITHOUT TIME ZONE, "employer_id" BIGINT, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "staff_id" BIGINT, CONSTRAINT "employee_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-19
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='master';
CREATE TABLE "master" ("active" BOOLEAN, "creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "name" VARCHAR(255), "photo_src" VARCHAR(255), "surname" VARCHAR(255), CONSTRAINT "master_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-20
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='portfolio';
CREATE TABLE "portfolio" ("creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "offer_id" BIGINT, "description" VARCHAR(255), "media_src" VARCHAR(255), "title" VARCHAR(255), CONSTRAINT "portfolio_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-21
--preconditions onFail:MARK_RAN onError:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables where table_name='review';
CREATE TABLE "review" ("avg_rating" FLOAT8, "rating" INTEGER, "creation_date" TIMESTAMP WITHOUT TIME ZONE, "id" BIGINT NOT NULL, "master_id" BIGINT, "modification_date" TIMESTAMP WITHOUT TIME ZONE, "description" VARCHAR(255), "title" VARCHAR(255), CONSTRAINT "review_pkey" PRIMARY KEY ("id"));

-- changeset Alex:1710100913837-22
ALTER TABLE "certificate" ADD CONSTRAINT "fk90vxlf2bop5xvp3dnwu2i422" FOREIGN KEY ("cat_id") REFERENCES "category" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-23
ALTER TABLE "contact" ADD CONSTRAINT "fk962olklr4qs05j8ak5bewk1jy" FOREIGN KEY ("master_id") REFERENCES "master" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-24
ALTER TABLE "offer" ADD CONSTRAINT "fka9c1ayc9rtwldoh6uxxcdmsdb" FOREIGN KEY ("cat_id") REFERENCES "category" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-25
ALTER TABLE "offer" ADD CONSTRAINT "fketdngg231qbf5lhinbwyomyj9" FOREIGN KEY ("master_id") REFERENCES "master" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-26
ALTER TABLE "review" ADD CONSTRAINT "fkh053si4xjlku592nrnboq92sq" FOREIGN KEY ("master_id") REFERENCES "master" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-27
ALTER TABLE "portfolio" ADD CONSTRAINT "fkiracfcepi2p2r1l30sfm0yxh4" FOREIGN KEY ("offer_id") REFERENCES "offer" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-28
ALTER TABLE "days_of_week" ADD CONSTRAINT "fkjubswinpssv22ykxagcsqww19" FOREIGN KEY ("offer") REFERENCES "offer" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-29
ALTER TABLE "certificate" ADD CONSTRAINT "fkodbyuqe3oneu1fs5sm7sbdt5l" FOREIGN KEY ("master_id") REFERENCES "master" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset Alex:1710100913837-30
ALTER TABLE "employee" ADD CONSTRAINT "fkt62dsnsgqvurqt2xvgnx4nk43" FOREIGN KEY ("employer_id") REFERENCES "customer" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

