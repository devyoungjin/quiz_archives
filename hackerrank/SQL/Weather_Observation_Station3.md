# Weather Observation Station 3

[https://www.hackerrank.com/challenges/weather-observation-station-3](https://www.hackerrank.com/challenges/weather-observation-station-3/problem)

Query a list of **CITY** names from **STATION** for cities that have an even **ID** number. Print the results in any order, but exclude duplicates from the answer. 

![](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg)

<br>

## My Code

~~~sql
SELECT      distinct(city)
FROM        station
WHERE       mod(id,2)=0;
~~~

**output**

~~~
Glencoe
Prince Frederick
Kirkland
Palm Desert
Cherry
Delta
...
~~~

<br>

## Review

함수 mod를 아는지 물어보는 문제였다. 아직 익숙지않아서 부끄럽지만, `id%2=0` 로 쿼리를 입력하여 에러결과를 받고 다시 작성해서 푼 문제다...ㅋ