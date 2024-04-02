import java.util.ArrayList;

public class MainSystem {
    private ArrayList<Person> listPerson;
    private ArrayList<Course> listOfCourse;
    private CourseFactory courseFactory;
    private PersonFactory personFactory;

    private static MainSystem instance;

    public MainSystem getInstance() { // singleton
        if (instance == null) {
            instance = new MainSystem();
            listPerson = new ArrayList<>();
            listOfCourse = new ArrayList<>();
            courseFactory = CourseFactory.getInstance();
            personFactory = PersonFactory.getInstance();


        }
        return instance;
    }

    public void CreateCourse(Person creator, int serial_number, String courseName, String type, int maxPeapole) throws Exception {

        Course course = creator.createCourse(type, serial_number, courseName, maxPeapole);
        listOfCourse.add(course); // add the method that check if the course already excite;

    }

    public void singUp(String name, String type) throws Exception {
        Person person = PersonFactory.createPerson(name, type);

        if (listPerson.size() < 100) {
            if (listPerson.contains(person)) {
                throw new Exception(person.getName() + " already signUp");
            }
        } else {
            System.out.println("no more places available");
        }
    }

        public void logOut(Person person) throws Exception {
            if (person == null) {
                throw new Exception("this Person is null");
            }
            if (!listPerson.contains(person)) {
                throw new Exception("the Person not singUp to the system");
            } else {
                listPerson.remove(person);
            }
        }
    }

