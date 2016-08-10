-- TABLE company - BEGIN
CREATE SEQUENCE seq_company_id
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;

-- {"id":"1", "name":"CityMobile","full_name":"Mobile city"}
CREATE TABLE IF NOT EXISTS company (
  id         BIGINT NOT NULL DEFAULT nextval('seq_company_id' :: REGCLASS),
  name       VARCHAR(21),
  full_name  VARCHAR(255),
  additional TEXT,
  CONSTRAINT company_pkey PRIMARY KEY (id)
);
-- Not to create duplicate records
CREATE UNIQUE INDEX IF NOT EXISTS company_unique_name ON company (name);
-- TABLE company - END

INSERT INTO company (name, full_name) VALUES
  ('CityMobile', 'Mobile city'),
  ('RushMan', 'Man Rush'),
  ('Test', 'Testing');
