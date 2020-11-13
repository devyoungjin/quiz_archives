# Average Population of Each Continent

[https://www.hackerrank.com/challenges/average-population-of-each-continent](https://www.hackerrank.com/challenges/average-population-of-each-continent/problem)

Given the **CITY** and **COUNTRY** tables, query the names of all the continents (*COUNTRY.Continent*) and their respective average city populations (*CITY.Population*) rounded *down* to the nearest integer.

**Note:** *CITY.CountryCode* and *COUNTRY.Code* are matching key columns.

  <img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg"/>
  <img src="https://s3.amazonaws.com/hr-challenge-images/8342/1449769013-e54ce90480-Country.jpg"/>

<br>

## My Code

~~~sql
-- with JOIN
SELECT      c2.continent, floor(avg(c1.population))
FROM        city c1
JOIN        country c2
ON          c1.countrycode = c2.code
GROUP BY    c2.continent;

-- without JOIN
SELECT			c2.continent, floor(avg(c1.population)) 
FROM				city c1, country c2
WHERE				c1.countrycode = c2.code
GROUP BY 		c2.continent;
~~~

**output**

~~~
Oceania 109189
South America 147435
Europe 175138
Africa 274439
Asia 693038
~~~

