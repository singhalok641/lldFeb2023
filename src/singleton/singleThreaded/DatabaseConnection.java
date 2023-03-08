package singleton.singleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){

    }

    // Not going to work in a concurrent env
    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){
            databaseConnection = new DatabaseConnection();
        }

        return databaseConnection;
    }
}
