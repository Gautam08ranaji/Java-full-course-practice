package OOPS.ClassAndObjects;

public class StudentDriver {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name="GAUTAM RANA";
        s1.age=24;
        s1.rollno= 8;
        s1.course ="MCA";

        s2.name="PRASHANT RANA";
        s2.age=30;
        s2.rollno= 28;
        s2.course ="BTECH";

        s3.name="ADITYA RANA";
        s3.age=21;
        s3.rollno=16;
        s3.course ="BCA";


        System.out.println("STUDENT DETAILS-------------------");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.course);
        s1.read();
        s1.write();
        s1.speak();
        s1.play();

        System.out.println("STUDENT DETAILS---------------------");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollno);
        System.out.println(s2.course);
        s2.read();
        s2.write();
        s2.speak();
        s2.play();

        System.out.println("STUDENT DETAILS-----------------------");
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.rollno);
        System.out.println(s3.course);
        s3.read();
        s3.write();
        s3.speak();
        s3.play();

    }
}
