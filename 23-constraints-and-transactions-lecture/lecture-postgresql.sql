-- INSERT

-- 1. Add Klingon as a spoken language in the USA
-- 2. Add Klingon as a spoken language in Great Britain
Insert into countrylanguage
        (COUNTRYCODE, language, isofficial, percentage)
VALUES  ('BGR',       'Klingon', false,          46);



-- UPDATE
-- 1. Update the capital of the USA to Cleveland
-- 2. Update the capital of the USA to Washington DC and the head of state
update country
set capital = 3825
where code ='USA'

-- DELETE
-- 1. Delete English as a spoken language in the USA
-- 2. Delete all occurrences of the Klingon language 
delete from countrylanguage
where countrycode =  'USA'
and language = 'English'

delete FROM countrylanguage
where  language = 'Klingon'

-- REFERENTIAL INTEGRITY
-- require every foreign key value to have an existing/matching primary key value
-- 1. Try just adding Elvish to the country language table.

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
Insert into countrylanguage
        (COUNTRYCODE, language, isofficial, percentage)
VALUES  ('ZZZ',       'English', false,          10);

-- 3. Try deleting the country USA. What happens?


-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'


-- How to view all of the constraints

--SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
--SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
--SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.

-- 2. Try updating all of the cities to be in the USA and roll it back
