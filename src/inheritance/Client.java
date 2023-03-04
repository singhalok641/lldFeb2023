package inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor i = new Instructor();

        i.avgRating = 4.5;
        i.login();
        i.username = "Alok";
        i.scheduleClass();


        User u = new User();
        u.login();

//        u.scheduleClass();// Not possible
    }
}
