package designPatterns.prototype;

public class Client {

    private static void fillRegister(StudentRegistry studentRegistry){
        Student febBatchStudent = new Student();
        febBatchStudent.setBatch("Feb 22 LLD");
        febBatchStudent.setAverageBatchPsp(89);

        studentRegistry.register("Feb 22 LLD", febBatchStudent);

        IntelligentStudent febBatchIntelligentStudent = new IntelligentStudent();
        febBatchIntelligentStudent.iq = 180;
        febBatchIntelligentStudent.setBatch("Feb 22 LLD");
        febBatchIntelligentStudent.setAverageBatchPsp(89);

        studentRegistry.register("Feb 22 LLD intelligent", febBatchIntelligentStudent);


    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student akash = studentRegistry.get("Feb 22 LLD").clone();
        akash.setAge(23);
        akash.setName("Akash");
        akash.setStudentPsp(99);

        Student devdutt = studentRegistry.get("Feb 22 LLD intelligent").clone();
        devdutt.setName("devdutt");
        devdutt.setAge(22);
        devdutt.setStudentPsp(89);

        System.out.println("DEBUG");
    }
}
