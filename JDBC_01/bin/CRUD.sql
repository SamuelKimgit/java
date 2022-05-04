-- INSERT (1111,'ȫ�浿',10)
INSERT INTO sawon (
    empno,
    ename,
    hiredate,
    deptno
) VALUES (
    :v0,
    :v1,
    sysdate,
    :v3
);
COMMIT;

-- DELETE
DELETE FROM sawon
WHERE empno = :v0;

-- UPDATE (,'ȫu',20)
UPDATE sawon
   SET ename = :v1,
       hiredate = sysdate,
       deptno = :v3
WHERE empno = :v0;

-- SELECT_ONE
SELECT
    empno,
    ename,
    TO_CHAR(hiredate,'YYYY/MM/DD HH24:MI:SS') AS hiredate,
    deptno
FROM sawon
WHERE empno = :V0
;

-- ���̺� ���� - ���� ���̺� INSERT/UPDATE(ó�����̺�� 
-- ������ ������ �־� UPDATE,INSERT�� ���ǰ� ���̺��� ����.)
MERGE INTO sawon ta
USING ( SELECT  -- param���� �޾� �ϳ��� ���̺� tb �ϼ�
            :empno  AS empno,
            :ename  AS ename,
            SYSDATE AS hiredate,
            :deptno AS deptno
        FROM dual
) tb 
ON ( ta.empno = tb.empno )
WHEN MATCHED THEN
    UPDATE SET ta.ename    = tb.ename,
               ta.hiredate = tb.hiredate,
               ta.deptno   = tb.deptno
WHEN NOT MATCHED THEN
    INSERT (ta.empno,ta.ename,ta.hiredate,ta.deptno) 
    VALUES (tb.empno,tb.ename,tb.hiredate,tb.deptno);