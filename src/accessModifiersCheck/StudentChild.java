package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {
    public void doSomething(){
        psp = 91.0;
        universityName = "College ABC";

        // name = ""; Error
        // batchId = Error
    }
}
