# Weather Observation Station 6

[https://www.hackerrank.com/challenges/weather-observation-station-6](https://www.hackerrank.com/challenges/weather-observation-station-6/problem)

Query the list of *CITY* names starting with vowels (i.e., `a`, `e`, `i`, `o`, or `u`) from **STATION**. Your result *cannot* contain duplicates.

![](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg)

<br>

## My Code

~~~sql
SELECT      DISTINCT(city)
FROM        station
WHERE       substr(city,0,1) IN ('A', 'E', 'O', 'I', 'U');
~~~

**output**

~~~
Irvington
Aliso Viejo
Osage City
Andover
Atlantic Mine
Eureka Springs
Onaway
Archie
...
~~~

<br>

## Review

원래 아래의 코드로 문제를 풀었다가 '더 효율적인 방법이 없을까'하고 구글링하다가 발견해서 위의 코드로 문제를 해결했다.

~~~sql
SELECT      DISTINCT(city)
FROM        station
WHERE       city LIKE 'A%' 
        OR city LIKE 'E%' 
        OR city LIKE 'I%' 
        OR city LIKE 'O%' 
        OR city LIKE 'U%';
~~~

정규식으로 해결하는게 Best인것 같아서 정규식 쿼리도 아카이빙해둔다.

~~~sql
SELECT		DISTINCS(city)
FROM		station
WHERE		city REGEXP '^[AEIOU]';
~~~

