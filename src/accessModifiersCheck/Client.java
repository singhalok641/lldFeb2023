package accessModifiersCheck;

import accessModifiers.Student;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        // student.name = // private
        // student.batchId
        // student.psp

        student.universityName = "ABC";
    }
}
