import java.util.ArrayList;
import java.util.Scanner;

public abstract class Course {
    private int serial_number;
    private String name;
    private int _maxNumber;
    private ArrayList<Student> listOfStudets;


    public Course(int serial_umber, String name,int maxNumber) throws Exception {  // create the Course
//        if(person==null){throw  new Exception("the person that create the course is null");}
//        if(!(person instanceof Lecturer) || ! (person instanceof Practitioner)){
//            throw  new Exception("only Lecturer and Practitioner can create course");
//        }
        this.serial_number = serial_number;
        this.name = name;
        _maxNumber=maxNumber;
        listOfStudets=new ArrayList<>();
    }

    public int getSerialNumber() {
        return serial_number;
    }

    public String getName() {
        return name;
    }
    public void add(Student student) throws Exception {
        if(student==null){throw new Exception("student is null");}
        if(listOfStudets.size()<_maxNumber){
            if (listOfStudets.contains(student)){throw new Exception("student is already in the course");}
            listOfStudets.add(student);
        }
        else { // option to regester for be observer
            System.out.println("there is no places is this course. do you like to be notify if there is a place? Y/N");
            Scanner scanner=new Scanner(System.in);
           String ans= scanner.nextLine();
           while (!ans.equals("Y") && !ans.equals("N")){
               System.out.println("choose Y/N");
               ans=scanner.nextLine();
           }
           if(ans.equals("Y")){
               //observer pattren to be added
           }



        }

    }

    public void remove(Student student) throws Exception {
        if(student==null){throw new Exception("student is null");}
        if (!listOfStudets.contains(student)){throw new Exception("student not in the course");}
        else {
            listOfStudets.remove(student);
            //notifiction to the other observer;
        }
    }
}

