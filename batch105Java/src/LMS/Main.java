package LMS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Öğrenci eklenecek, öğrenci listelenecek.
    //SOLID
    // HER CLASS YALNIZCA 1 iş yapar.

    // öğrenci girişi için 1 basnı
    // öğrenci listelemek içn 2 yebasın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean durum = true;
        int input;
        GirisEkrani();

    }
    public static void GirisEkrani()
    {
        boolean durum = true;
        while(durum)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen yapmak istediğiniz işlemi giriniz.");
            System.out.println("1. Öğrenci eklemek için 1'e basınız.");
            System.out.println("2. Öğrenci listelemek için 2'ye basınız.");
            int input = scan.nextInt();
            if(input==1)
            {
                OgrenciEkle();
            }
            else if(input ==2)
            {
                listeleme();
            }
            else{

            }
        }


    }
    public static List<Students> mainStudents = new ArrayList<>();
    public static void OgrenciEkle()
    {

        boolean durum=true;
        int ogrenciNo=1;
        do {
            List<Students> students = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            //Öğrenci ekleme işlemi...
            Students student = new Students();
            System.out.println("");

            System.out.println("Lütfen öğrenci tc no'sunu giriniz.");
            student.setIdenity(scan.nextLine());

            System.out.println("");

            System.out.println("Lütfen öğrenci adını giriniz.");
            student.setName(scan.nextLine());

            System.out.println("");

            System.out.println("Lütfen öğrenci yaşını giriniz.");
            student.setAge(scan.nextInt());
            scan.nextLine();

            System.out.println("");

            System.out.println("Lütfen öğrenci email giriniz.");
            student.setEmail(scan.nextLine());

            System.out.println("");

            System.out.println("Lütfen öğrenci cinsiyet giriniz.");
            student.setSex(scan.nextLine());
            ogrenciNo++;
            student.setOgrenciNo(ogrenciNo);
            mainStudents.add(student);

            System.out.println("Başka öğrenci eklemek için 1'e anamenüye dönmek için 2'ye basınz....");
            int a = scan.nextInt();
            if(a==1)
            {

            }
            else if(a==2)
            {
                StudentsRunner studentsRunner = new StudentsRunner(mainStudents, new JdbcStudentsDao());
                studentsRunner.add(mainStudents);
                GirisEkrani();
            }
        }
        while(durum);

    }
    public static void listeleme()
    {
        StudentsRunner studentsRunner = new StudentsRunner(mainStudents, new HibernateStudentsDao());
        studentsRunner.listeleme();
    }
}







