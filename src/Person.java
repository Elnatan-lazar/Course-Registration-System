public class Person {

    private String _name;

    public Person(String name){
        this._name=name;

    }
    public String getName() {
        return _name;
    }

    public Course createCourse(String type, int number, String name,int maxNumber) throws Exception {

        return CourseFactory.createCourse(number,name,type,maxNumber);
    }


}
