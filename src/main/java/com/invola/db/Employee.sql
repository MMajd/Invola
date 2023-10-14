-- We don't from or give the inner query an alias to get the null 
SELECT
    (
        SELECT DISTINCT Salary 
        FROM Employee 
        ORDER BY salary DESC LIMIT 1 OFFSET 1
) as Salary;