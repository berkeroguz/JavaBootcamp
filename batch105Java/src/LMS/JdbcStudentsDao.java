package LMS;

import java.util.List;

public class JdbcStudentsDao implements StudentsDao{
    @Override
    public void add(List<Students> students) {
        for (Students student : students)
        {

            System.out.println(student.getName() + " isimli öğrenci JDBC ile eklenmiştir.");
        }
    }
}
