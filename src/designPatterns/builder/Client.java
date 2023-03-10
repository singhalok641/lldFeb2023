package designPatterns.builder;

public class Client {

    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setAge(21);
//        builder.setGradYear(2023);
//        builder.setName("Alok");
//
//        Student st = new Student(builder);

        Student st = Student.getBuilder()
                        .setAge(12)
                        .setName("Alok")
                        .setGradYear(2023)
                        .build();

        System.out.println("DEBUG");
    }


}
