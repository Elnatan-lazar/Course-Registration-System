import java.util.ArrayList;

public class PersonFactory {

    private static PersonFactory instance;

    public static PersonFactory getInstance() {
        if (instance == null) {
            instance = new PersonFactory();

        }
        return instance;
    }





    public static Person createPerson(String name,String type) {
        switch (type.toLowerCase()) {
            case "student":
                return new Student(name);
            case "practitioner":
                return new Practitioner(name);
            case "lecturer":
                return new Lecturer(name);
            default:
                throw new IllegalArgumentException("Invalid Person type: " + type);
        }
    }
}
