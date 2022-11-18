package LMS;

public class Person { // Kişi denen şey, bana göre bu özelliklere sahip biridir.
    private String name;
    private String Idenity;
    private String email;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdenity() {
        return Idenity;
    }

    public void setIdenity(String idenity) {
        Idenity = idenity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
