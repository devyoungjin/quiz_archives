# Asian Population

Given the **CITY** and **COUNTRY** tables, query the sum of the populations of all cities where the *CONTINENT* is *'Asia'*.

**Note:** *CITY.CountryCode* and *COUNTRY.Code* are matching key columns.

  <img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg"/>
  <img src="https://s3.amazonaws.com/hr-challenge-images/8342/1449769013-e54ce90480-Country.jpg"/>

<br>

## My Code

~~~sql
SELECT  sum(c1.population) 
FROM    city c1
JOIN    country c2
ON      c2.code = c1.countrycode
WHERE   c2.continent = 'Asia';
~~~

**output**

~~~
27028484
~~~

