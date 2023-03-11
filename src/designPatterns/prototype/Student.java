package designPatterns.prototype;

public class Student {
    private int age;
    private String name;
    private double studentPsp;
    private String batch;
    private double averageBatchPsp;

    public Student(){

    }

    public Student(Student student){
        this.age = student.age;
        this.studentPsp = student.studentPsp;
        this.batch = student.batch;
        this.name = student.name;
        this.averageBatchPsp = student.averageBatchPsp;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public String getBatch() {
        return batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public Student clone(){
        return new Student(this);
    }
}
