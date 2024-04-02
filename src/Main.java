// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Person s=PersonFactory.createPerson("sas","student");
        Person l=PersonFactory.createPerson("sass","Lecturer");
        MainSystem m= new MainSystem();
        m=m.getInstance();
       // m.CreateCourse(s,1,"asd","mandatory",1);
        m.CreateCourse(l,1,"asd","mandatory",1);
    }
}