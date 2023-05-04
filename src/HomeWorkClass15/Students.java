package HomeWorkClass15;

public class Students {
    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for
each object
Print out  total number of students
     */

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.name="Peter";
        obj1.ID="stu1234";
        numberOfStudents++;

        Students obj2=new Students();
        obj2.name="Uros";
        obj2.ID="stu6465";
        numberOfStudents++;

        Students obj3=new Students();
        obj3.name="Mark";
        obj3.ID="stu0001";
        numberOfStudents++;

        System.out.println("total number of"+ Students.numberOfStudents);
    }


}
