
CREATE TABLE worker (
    worker_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    salary NUMERIC(10, 2),
    joining_date DATE,
    department VARCHAR(50)
);

INSERT INTO worker (worker_id, first_name, last_name, salary, joining_date, department)
VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'ADMIN'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'ADMIN'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'ADMIN'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'ACCOUNT'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'ACCOUNT'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'ADMIN');


CREATE TABLE bonus (
    worker_ref_id INT PRIMARY KEY,
    bonus_amount NUMERIC(10, 2),
    bonus_date DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);


INSERT INTO bonus (worker_ref_id, bonus_amount, bonus_date)
VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');



CREATE TABLE title (
    worker_ref_id INT PRIMARY KEY,
    worker_title VARCHAR(50),
    affected_from DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);


INSERT INTO title (worker_ref_id, worker_title, affected_from)
VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(3, 'Lead', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11');




SELECT 
    w.first_name,
    w.salary,
    t.worker_title
FROM 
    worker w
JOIN 
    title t ON w.worker_id = t.worker_ref_id;
	
	
	
CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INT AS $$
DECLARE
    nth_highest_salary NUMERIC;
    worker_count INT;
BEGIN
    -- Get the nth highest salary
    SELECT DISTINCT salary
    INTO nth_highest_salary
    FROM worker
    ORDER BY salary DESC
    LIMIT 1 OFFSET n - 1;

    -- Count the number of workers with that salary
    SELECT COUNT(*)
    INTO worker_count
    FROM worker
    WHERE salary = nth_highest_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;
	
	
