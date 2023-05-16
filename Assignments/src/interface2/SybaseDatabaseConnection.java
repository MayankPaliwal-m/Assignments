package interface2;

public class SybaseDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect(String connectionDetail) {

    }

    @Override
    public void disconnect() {

    }

    @Override
    public String fireQuery(String query) {
        return null;
    }

    @Override
    public void checkConnectionStatus() {

    }
}
