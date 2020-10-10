# African Cities

Given the **CITY** and **COUNTRY** tables, query the names of all cities where the *CONTINENT* is *'Africa'*. 

**Note:** *CITY.CountryCode* and *COUNTRY.Code* are matching key columns.

  <img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg"/>
  <img src="https://s3.amazonaws.com/hr-challenge-images/8342/1449769013-e54ce90480-Country.jpg"/>

<br>

## My Code

~~~sql
SELECT  c1.name
FROM    city c1
JOIN    country c2
ON      c1.countrycode  = c2.code
WHERE   c2.continent    = 'Africa';
~~~

**output**

~~~
Qina
Warraq al-Arab
Kempton Park
Alberton
Klerksdorp
Uitenhage
Brakpan
Libreville
~~~

