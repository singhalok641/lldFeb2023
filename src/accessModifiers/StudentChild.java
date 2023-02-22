package accessModifiers;

public class StudentChild extends Student{
    public void doSomething(){
        // name is private. Not accessible
        batchId = 123; // default
        psp = 98;
        universityName = "xyz";
    }
}