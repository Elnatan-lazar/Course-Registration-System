import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Course> shoppingList;


    public Student(String name) {
        super(name);
        shoppingList=new ArrayList<>();
    }

    @Override
    public Course createCourse(String type, int number, String name,int maxNumber) throws Exception {
        throw new Exception("Student canot create courses");
    }
    public void addCourse(Course course) throws Exception {
        if(course==null){ throw new Exception("course is null");}

        if(shoppingList.contains(course)){throw new Exception("course already in the shopping list");}
        else {
            shoppingList.add(course);
        }
    }

    public void removeCourse(Course course) throws Exception {
        if(course==null){ throw new Exception("course is null");}

        if(!shoppingList.contains(course)){throw new Exception("course not in the shopping list");}
        else {
            shoppingList.remove(course);
        }
    }
}
