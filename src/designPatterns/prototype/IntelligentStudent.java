package designPatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent student){
        super(student); // fill in all the generic attributes
        this.iq = student.iq; // fill in attributes specific to child class
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
