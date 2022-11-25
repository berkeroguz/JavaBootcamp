package LMS;

import java.util.List;

public class HibernateStudentsDao implements StudentsDao{
    @Override
    public void add(List<Students> students) {
        for (Students student : students)
            {
                System.out.println(student.getName() + " isimli öğrenci Hibernate ile eklenmiştir.");
            }
    }
}
