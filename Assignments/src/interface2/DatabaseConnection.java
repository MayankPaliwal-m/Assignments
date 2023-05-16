//Create interface called DatabaesConnection which will have below methods
//	connect method which will take string connection detail argument
//	disconnect method which will not take anything
//	fireQuery method which will take query and return string result
//	checkConnectionStatus method which will show the connectin status
//		(hint for this method, create boolean variable called isConnectionAlive and toggle it in connect and disconnect method)
//
//Create two child implementer of th
//Create two child implementer of this interface, OracleDatabaesConnection, and SybaseDatabaseConnnection and implement those methods.

package interface2;

public interface DatabaseConnection {
    public void connect(String connectionDetail);
    public void disconnect();
    public String fireQuery(String query);
    public void checkConnectionStatus();

}

