package designPatterns.builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    long phoneNumber;

    // Not a good approach
//    Student(String name, int age .....){
//
//    }

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.gradYear = builder.getGradYear();
        this.name = builder.getName();
        this.age = builder.getAge();
    }


    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private long phoneNumber;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getPsp() {
            return psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public String getBatch() {
            return batch;
        }

        public long getId() {
            return id;
        }

        public int getGradYear() {
            return gradYear;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public void setId(long id) {
            this.id = id;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Student build(){
            //validations start
            if(getGradYear() > 2022){
                throw new IllegalArgumentException("Grad year can't be greater than 2022");
            }
            // validations end

            return new Student(this);
        }
    }
}
