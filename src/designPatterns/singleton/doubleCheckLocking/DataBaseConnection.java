package designPatterns.singleton.doubleCheckLocking;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(String env){

    }

    public static DataBaseConnection getInstance(String env){
        if(dataBaseConnection == null){ // t1, t2
            synchronized (DataBaseConnection.class){ // t1, t2
                if(dataBaseConnection == null){ // t1, t2
                    dataBaseConnection = new DataBaseConnection(env);// t1, creates a db connection instance
                }
            }
        }
        return dataBaseConnection;
    }
}
