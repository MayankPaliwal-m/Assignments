package interface2;

public class DatabaseConnectionMain {
    public static void main(String[] args) {
        DatabaseConnection selectedConnection = letsSelectConnection();

        selectedConnection.connect("Some connection details");
        selectedConnection.checkConnectionStatus();
        String result = selectedConnection.fireQuery("Test");
        System.out.println(result);
        selectedConnection.disconnect();
        selectedConnection.checkConnectionStatus();
        result = selectedConnection.fireQuery("Test");
        System.out.println(result);


    }

    private static DatabaseConnection letsSelectConnection() {

        DatabaseConnection connection1 = new OracleDatabaseConnection();
        DatabaseConnection connection2 = new SybaseDatabaseConnection();
        return connection1;
    }


}
