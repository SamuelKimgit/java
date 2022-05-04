--BOARD:CRUD

--INSERT
INSERT INTO board (
    seq,
    title,
    contents,
    read_cnt,
    reg_id,
    mod_id
) VALUES (
    :seq,
    :title,
    :contents,
    :read_cnt,
    :reg_id,
    :mod_id
);

--DELETE
DELETE FROM board
WHERE seq = 1;

--doSelectOne
SELECT
    seq,
    title,
    contents,
    read_cnt,
    TO_CHAR(reg_dt,'YYYY/DD/MM HH24:MI:SS') AS reg_dt,
    reg_id,
    TO_CHAR(mod_dt,'YYYY/DD/MM HH24:MI:SS') AS mod_dt,
    mod_id
FROM board
WHERE seq = :seq;

--UPDATE
UPDATE board
SET title = :title,
    contents = :contents,
    mod_dt = SYSDATE,
    mod_id = :mod_id
WHERE seq = :seq;

--조회건수 증가
UPDATE board
SET read_cnt = read_cnt +1
WHERE seq = :seq;

--목록조회
ALTER SESSION SET STATISTICS_LEVEL = ALL;
SELECT 
    A.seq,
    A.rnum AS NUM,
    A.title,
    TO_CHAR(A.mod_dt,'YYYY/MM/DD') AS mod_dt,
    A.mod_id
FROM(
    SELECT ROWNUM AS RNUM, t1.*
    FROM(
        SELECT *
        FROM board
        --검색조건
        ORDER BY mod_dt DESC
    )t1
    WHERE ROWNUM <= 10
)A
WHERE RNUM >=1
;
SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(NULL,NULL,'ALLSTATS LAST -ROWS +PREDICATE'));

--임의 데이터 생성
TRUNCATE TABLE board;
INSERT INTO board 
SELECT
    LEVEL AS seq,
    '제목'|| LEVEL AS title,
    '내용'|| LEVEL AS contents,
    0 AS read_cnt,
    SYSDATE - (ROWNUM/(60*60)) AS reg_dt,
    'ADMIN' AS reg_id,
    SYSDATE - (ROWNUM/(60*60)) AS mod_dt,
    'ADMIN' AS mod_id
FROM dual
CONNECT BY LEVEL <= 900000;
COMMIT;


--전체건수 조회
SELECT COUNT(*) AS total_cnt
FROM board;
--검색조건

SELECT * FROM board;