--추가 수당 '해당 사항 없음', '추가 수당 없음', '추가 수당 xx'
SELECT ENAME, COMM,
CASE 
WHEN COMM IS NULL THEN '해당사항 없음'
WHEN COMM = 0 THEN '수당 없음'
ELSE CONCAT('추가 수당 : ',TO_CHAR(COMM))
END AS NEW_COMM
FROM EMP;

SELECT EMPNO, ENAME,
CASE
WHEN COMM IS NULL THEN '해당사항 없음'
WHEN COMM = 0 THEN '수당 없음'
WHEN COMM > 0 THEN '추가 수당 : ' || COMM
END AS NEW_COMM
FROM EMP;

--EMP 테이블과 DEPT 테이블에서 공통으로 있는 부서번호 출력
SELECT DEPTNO
FROM DEPT
INTERSECT
SELECT DEPTNO
FROM EMP;

-- SELECT 절 하나 사용하기
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
ORDER BY D.DEPTNO, E.EMPNO;

SELECT E.EMPNO, E.ENAME, DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC
FROM EMP E
INNER JOIN DEPT ON E.DEPTNO = DEPT.DEPTNO
ORDER BY DEPT.DEPTNO, E.EMPNO;

--연도별 부서별 인원수
SELECT TO_CHAR(HIREDATE, 'YYYY') AS HIRE_YEAR, DEPTNO, COUNT(*) AS CNT
FROM EMP
GROUP BY GROUPING SETS(TO_CHAR(HIREDATE, 'YYYY'), DEPTNO);

--각 부서별, 직업별, 그룹화된 부서 + 각 직업별, 전체 인원수, 급여 총액 (그룹화된 부서 : GROUP_DEPT, 그룹화된 직업 : GROUP_JOB)
SELECT DECODE(GROUPING(DEPTNO), 1, 'GROUP_DEPT', DEPTNO) AS DEPTNO,
       DECODE(GROUPING(JOB), 1, 'GROUP_JOB', JOB) AS JOB,
       COUNT(*), SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

SELECT E.ENAME, DEPT.DNAME
FROM EMP E
FULL OUTER JOIN DEPT ON E.DEPTNO = DEPT.DEPTNO
ORDER BY DEPT.DEPTNO, E.EMPNO;

-- EMP 테이블에서 자신의 상급자 이름을 더해서 출력
-- EMP 테이블 2개 합쳐보기, EMPNO, ENAME
SELECT *
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO;

SELECT E.ENAME, S.GRADE
from EMP E, SALGRADE S
WHERE E.SAL >= S.LOSAL AND E.SAL <= S.HISAL;

SELECT*
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

SELECT *
FROM EMP E1 
LEFT OUTER JOIN EMP E2 ON E1.MGR = E2.EMPNO;

SELECT *
FROM EMP E1 
RIGHT OUTER JOIN EMP E2 ON E1.MGR = E2.EMPNO;

SELECT*
FROM EMP E1
NATURAL JOIN EMP E2;

SELECT E.EMPNO, E.ENAME, E.MGR, DEPTNO, D.DNAME, D.LOC
from EMP E 
NATURAL JOIN DEPT D;

SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC
FROM EMP E NATURAL JOIN DEPT D
ORDER BY DEPTNO, E.EMPNO;

SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC
FROM EMP E 
JOIN DEPT D USING(DEPTNO)
ORDER BY DEPTNO, E.EMPNO;

-- SALGRADE - HISAL을 받는 사람의 인원 수를 등급별로 출력해보기
SELECT S.GRADE, COUNT(*) AS TOTAL_COUNT
FROM EMP E, SALGRADE S
WHERE E.SAL = S.HISAL
GROUP BY S.GRADE;

-- EMP 테이블에서 DEPT 테이블과 공통된 'DEPTNO' 값을 가지지 않은 부서 이름과 위치를 출력해보기
SELECT R.DEPTNO, R.DNAME, R.LOC
FROM DEPT R
LEFT OUTER JOIN EMP L ON L.DEPTNO = R.DEPTNO
WHERE L.DEPTNO IS NULL;

-- EMP와 DEPT 결합해서 JOB이 MANAGER인 애들 출력해보기
SELECT *
FROM EMP
NATURAL JOIN DEPT
WHERE JOB = 'MANAGER';

SELECT *
FROM EMP
JOIN DEPT USING(DEPTNO)
WHERE JOB = 'MANAGER';

-- 그룹별 최고 급여 직원 출력
SELECT *
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);

SELECT *
FROM EMP
WHERE SAL = ANY(SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);

-- 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사람들 출력하기
SELECT*
FROM EMP
WHERE SAL < (SELECT MAX(SAL) FROM EMP WHERE DEPTNO = 30);

SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
FROM (SELECT* FROM EMP WHERE DEPTNO = 10) E10, (SELECT* FROM DEPT) D
WHERE E10.DEPTNO = D.DEPTNO;

WITH E10 AS (SELECT* FROM EMP WHERE DEPTNO = 10), D AS (SELECT* FROM DEPT)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
FROM E10, D
WHERE E10.DEPTNO = D.DEPTNO;

--EMP 테이블에서 가장 높은 급여를 받는 직원의 이름과 급여를 출력
SELECT ENAME, SAL
FROM EMP
WHERE SAL = (SELECT MAX(SAL) FROM EMP);

SELECT MAX(SAL)
FROM EMP;

--DEPT 테이블에서 각 부서별로 속한 직원의 수와 평균 급여를 출력
SELECT DEPTNO, (SELECT COUNT(*) FROM EMP WHERE DEPT.DEPTNO = EMP.DEPTNO GROUP BY DEPTNO) AS AVG_COUNT, 
               (SELECT ROUND(AVG(SAL)) FROM EMP WHERE DEPT.DEPTNO = EMP.DEPTNO GROUP BY DEPTNO) AS AVG_SAL
FROM DEPT;

SELECT AVG(SAL) FROM EMP GROUP BY DEPTNO;

--EMP 테이블에서 각 직원의 이름과 급여를 조회하고, 해당 직원의 급여가 부서 평균 급여보다 높은 경우에만 출력
SELECT ENAME, SAL
FROM EMP E1, (SELECT AVG(SAL) AS AVG_SAL, DEPTNO FROM EMP GROUP BY DEPTNO) E2
WHERE E1.SAL > E2.AVG_SAL AND E1.DEPTNO = E2.DEPTNO; 

--EMP 테이블에서 부서 번호가 10인 부서에 속한 직원들 중에서 급여가 3000 이상인 직원의 이름과 급여를 출력
SELECT DEPTNO, COUNT(*) AS EMPCNT, MAX(SAL) AS MAXSAL
FROM EMP
GROUP BY DEPTNO
HAVING MAX(DEPTNO) = 10 AND MAX(SAL) > 3000;

SELECT ENAME, SAL
FROM EMP
WHERE DEPTNO = 10 AND SAL >= 3000;

SELECT ENAME, SAL
FROM (SELECT* FROM EMP WHERE DEPTNO = 10 AND SAL>=3000);