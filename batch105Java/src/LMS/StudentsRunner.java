package LMS;

import java.util.ArrayList;
import java.util.List;

public class StudentsRunner {
private List<Students> students;
private StudentsDao studentsDao;
    public StudentsRunner(List<Students> students,StudentsDao studentsDao)
    {
        this.students=students;
        this.studentsDao = studentsDao;
        //SOLID ( Yazılım geliştirme prensibleri )
    }
    public StudentsRunner()
    {

    }
    public void add(List<Students> student) //Burası gerçek ekleme işlemi buradan geçecek.
    {
        //İş kuralları burada olacak, iş kuralları sıkıntısız ise databaseNesnesi çağırılacak.
        // StudentsDao studentsDao = new JdbcStudentsDao();
        this.studentsDao.add(student); //Data Access Object   JDBC  Hibernate

    }
    public void listeleme() //Listeleme işlemine sonra bakıcaz inşallah :D
    {
        for (Students student : this.students)
        {
            System.out.println(student.getOgrenciNo()+ "no'lu " + student.getName() + " İsimli " +
                    student.getEmail() +" mailli öğrenci kayıtlarımızda mevcuttur.");

        }
    }







}
