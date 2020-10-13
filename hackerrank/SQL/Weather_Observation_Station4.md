# Weather Observation Station 4

[https://www.hackerrank.com/challenges/weather-observation-station-4](https://www.hackerrank.com/challenges/weather-observation-station-4)

Find the difference between the total number of **CITY** entries in the table and the number of distinct **CITY** entries in the table. 

![](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg)

<br>

## My Code

~~~sql
SELECT      count(city)-count(distinct(city))
FROM        station
~~~

**output**

~~~
13
~~~

<br>

## Review

간단한 문제지만, ''이런 쿼리 문제도 나울 수 있구나'' 싶어서 기록하는 문제.