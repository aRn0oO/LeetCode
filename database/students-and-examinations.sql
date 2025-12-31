# Write your MySQL query statement below
select s.student_id, s.student_name, sub.subject_name, count(e.student_id) attended_exams
from Students s
cross join subjects sub 
left join examinations e
    on s.student_id = e. student_id And sub.subject_name = e.subject_name

GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, s.student_name, sub.subject_name
;
