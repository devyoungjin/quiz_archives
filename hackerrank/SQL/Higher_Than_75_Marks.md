# Higher Than 75 Marks

[https://www.hackerrank.com/challenges/more-than-75-marks](https://www.hackerrank.com/challenges/more-than-75-marks/problem)

Query the *Name* of any student in **STUDENTS** who scored higher than  *Marks*. Order your output by the *last three characters* of each name. If two or more students both have names ending in the  same last three characters (i.e.: Bobby, Robby, etc.), secondary sort  them by ascending *ID*.

![](https://s3.amazonaws.com/hr-challenge-images/12896/1443815243-94b941f556-1.png)

<br>

## My Code

~~~sql
SELECT       name
FROM 		students 
WHERE 		marks>75 
ORDER BY 	substr(name,-3), id;
~~~

**output**

~~~
Studart
Kristeen
Christene
Admina
Aamina
...
~~~

<br>

## Review

문제를 제대로 이해를 못해서 해맸던 문제이다. 지금도 일단 해결은 했지만, 대체 무슨 의도로 이런 문제를 만들었는지 모르겠다..ㅋ