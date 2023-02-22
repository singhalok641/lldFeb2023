package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Chandan";
        student.batchId = 123;
        student.psp = 99.98;
        student.universityName = "Scaler";
    }
}
