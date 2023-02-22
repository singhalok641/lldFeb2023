package constructors;

public class Student {
    String name;
    int age;
    double psp;
    String univName;

    public Student(String studentName, String universityName){
        System.out.println(age);
        name = studentName;
        univName = universityName;
        age = 31;
        System.out.println(age);
    }

    public Student(String studentName, int age){

    }

    public Student(int age, String studentName){

    }

    public Student(){
        System.out.println("I am a 2nd constructor");
    }
}
