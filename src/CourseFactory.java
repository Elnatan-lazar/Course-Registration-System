import java.util.ArrayList;

public class CourseFactory {

    private static CourseFactory instance;

    public static CourseFactory getInstance() {
        if (instance == null) {
            instance = new CourseFactory();

        }
        return instance;
    }





    public static Course createCourse( int number, String name, String type,int maxNumber) throws Exception {
        switch (type.toLowerCase()) {
            case "mandatory":
                return new MandatoryCourse(number, name,maxNumber);
            case "non mandatory":
                return new NonMandatoryCourse(number, name,maxNumber);
            case "seminar":
                return new SeminarCourse(number, name,maxNumber);
            default:
                throw new IllegalArgumentException("Invalid course type: " + type);
        }
    }
}
