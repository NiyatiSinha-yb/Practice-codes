# Write your MySQL query statement below
#1741. Find Total Time Spent by Each Employee
#https://leetcode.com/problems/find-total-time-spent-by-each-employee/

Select event_day as day, emp_id, SUM(out_time-in_time) as total_time From Employees group by event_day, emp_id;
#Select event_day as day, emp_id, total_time From Employees;
