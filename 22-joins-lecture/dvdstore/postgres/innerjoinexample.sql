--SELECT title, category_id      --columns in result
--FROM film f, film_category fc  --tables with data
--WHERE f.film_id = fc.film_id   --join condition-- w/o join condition = catersian product                               

--BOTH are the same

--SELECT title, category_id      --columns in result
--FROM film f                    --one of the tables with rows you want
--        INNER JOIN             --type of join
--        film_category fc       --the next table with the rows you want
--ON f.film_id = fc.film_id      --join condition

SELECT f.title, fc.category_id 
FROM film f
        INNER JOIN
        film_category fc
     ON f.film_id = fc.film_id
        INNER JOIN
        category cat
     ON fc.category_id = cat.category_id   
WHERE release_year between 2000 and 2018 
--between is inclusive in the WHERE condition
        


