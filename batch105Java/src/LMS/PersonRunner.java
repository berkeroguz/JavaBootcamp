package LMS;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    private List<Students> students = new ArrayList<>();
    public PersonRunner (List<Students> students)
    {
        this.students=students;
    }

    public void add()
    {
        for (Students student : students)
        {
            //iş kuralları doğru ise database nesnesi çağırılacak.
            System.out.println(student.getName() + " isimli öğrenci eklendi.");
        }
    }
    public void listeleme()
    {
        for (Students student : students)
        {
            System.out.println(student.getOgrenciNo() + ". No'lu öğrenci = " + student.getName() + " isimli öğrenci.");

        }
    }

}
