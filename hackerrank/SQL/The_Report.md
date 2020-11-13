# The Report

[https://www.hackerrank.com/challenges/the-report](https://www.hackerrank.com/challenges/the-report/problem)

*Ketty* gives *Eve* a task to generate a report containing three columns: *Name*, *Grade* and *Mark*. *Ketty* doesn't want the NAMES of those students who received a grade lower than *8*. The report must be in descending order by grade -- i.e.  higher grades  are entered first. If there is more than one student with the same grade (8-10) assigned to them, order those particular students by their name  alphabetically. Finally, if the grade is lower than 8, use "NULL" as  their name and list them by their grades in descending order. If there  is more than one student with the same grade (1-7) assigned to them,  order those particular students by their marks in ascending order.

  <img src="https://s3.amazonaws.com/hr-challenge-images/12891/1443818166-a5c852caa0-1.png"/>

  <img src="https://s3.amazonaws.com/hr-challenge-images/12891/1443818137-69b76d805c-2.png"/>

<br>

## My Code

~~~sql
-- with JOIN
SELECT      CASE WHEN g.grade < 8 THEN NULL ELSE s.name 
            END as name
            , g.grade, s.marks
FROM        students s
JOIN        grades g
ON          s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY    g.grade DESC, s.name, s.marks;

-- without JOIN
SELECT      CASE WHEN g.grade < 8 THEN NULL ELSE s.name 
            END as name
            , g.grade, s.marks
FROM        students s, grades g
WHERE       s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY    g.grade DESC, s.name, s.marks;
~~~

**output**

~~~
Britney 10 95
Heraldo 10 94
Julia 10 96
Kristeen 10 100
Stuart 10 99
Amina 9 89
Christene 9 88
Salma 9 81
...
~~~

<br>

## Review

문제를 잘 이해를 하지못해서 결국 스스로 해결못하고, 다른 사람의 해결법을 통해 풀 수 있었다.

내가 풀지 못한 부분은 2가지이다. 하나는 조건에 따라 이름을 `NULL`로 처리하는 것이고, 또 하나는 정렬조건을 이해하지 못했다.

~~~sql
SELECT CASE WHEN g.grade < 8 THEN s.name = "NULL"
~~~

이렇게 쿼리를 작성하니까 계속 첫번째 쿼리부터 조회되지 않았다. 조건에 따라 `NULL` 처리하는 것을 알지못해 발생한 문제였다.

마지막 정렬 조건도 이해를 못해서 이걸 `CASE WHEN` 구절에 넣는 어처구니 없는 짓도 해봤다...

``NULL` 처리를 하지못하니 `ORDER BY` 조건이 3개나 주어지는지도 이해를 하지 못했다.

일단 등급별로 정렬을 한 후에 이름을 정렬 조건으로 추가한 이유는, `grade < 8` 일 경우, 이름이 `NULL` 이 되므로 등급이 같을 경우 발생하는 두번째 정렬조건(name)에서도 정렬되지 않을 수 있다. 이 때 세번째 정렬조건 `marks`로 모든 로우를 정렬하는 조건이다.