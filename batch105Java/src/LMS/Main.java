package LMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Öğrenci eklenecek, öğrenci listelenecek.
    //SOLID
    // HER CLASS YALNIZCA 1 iş yapar.
    public static void main(String[] args) {

        Students student1 = new Students();
        student1.setOgrenciNo("1");
        student1.setName("Ahmet");
        student1.setAge(30);
        student1.setIdenity("123456");
        student1.setEmail("abc@gmail.com");
        student1.setSex("E");

        Students student2 = new Students();
        student2.setOgrenciNo("12");
        student2.setName("Mehmet");
        student2.setAge(34);
        student2.setIdenity("12345623");
        student2.setEmail("absdc@gmail.com");
        student2.setSex("E");

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        PersonRunner personRunner = new PersonRunner(students); //BANA 1 tane liste ver, o listeyle ilgili ne istiyosan sana yapıcam...

        personRunner.add();
        System.out.println("~~~~~~~~~~~~~~~~");

        personRunner.listeleme();


    }
}
