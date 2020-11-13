# Weather Observation Station 5

[https://www.hackerrank.com/challenges/weather-observation-station-5](https://www.hackerrank.com/challenges/weather-observation-station-5/problem)

Query the two cities in **STATION** with the shortest and longest *CITY* names, as well as their respective lengths (i.e.: number of characters  in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically. 

![](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg)

<br>

## My Code

~~~sql
SELECT      city, length
FROM    (
    SELECT      city, length(city) as length
    FROM        station
    ORDER BY    length(city) ASC, city ASC
)
WHERE   ROWNUM=1
UNION
SELECT      city, length
FROM    (
    SELECT      city, length(city) as length
    FROM        station
    ORDER BY    length(city) DESC, city ASC
)
WHERE   ROWNUM=1;
~~~

**output**

~~~
Amo 3
Marine On Saint Croix 21
~~~

<br>

## Review

SQL 쿼리를 더 많이 연습해야겠다는 생각을 하게해주는 문제였다. 처음엔 단순히 `LIMIT` 키워드로 풀려고 했는데, 이걸로는 자꾸 쿼리 에러가 발생했다. `LIMIT` 절을 사용한 절에서 SQL 구문 오류가 발생하는데 아직 이유를 모르겠다.

`LIMIT`을 묻는 문제인지 알았는데, 알고보니 <span style="color: red;">서브쿼리</span>를 묻는 문제였다.

`FROM` 절에서 서브쿼리로 먼저 문자열 길이 순으로 정렬된 `ROW`를 가져오고, 이 가져온 결과에서 `ROWNUM=1`이라는 `WHERE` 조건으로 반환하는 문제이다.