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

public class OracleDatabaseConnection implements DatabaseConnection {

    String connectionDetails;

    Boolean isConnectionAlive = false;
//    OracleDatabaseConnection connectionDetail(String connectionDetail1) {
//        this.connectionDetails = connectionDetails;
//    }

    @Override
    public void connect(String connectionDetail) {
        this.connectionDetails = connectionDetail;
        System.out.println("Connection Established");
        isConnectionAlive = true;
//        if (connectionDetail.equals("Active Connection")) {
//            isConnectionAlive = true;
//        }


    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting Connection");
        isConnectionAlive = false;
    }

    @Override
    public String fireQuery(String query) {
        if (isConnectionAlive) {
            return "Result of your query is :";
        } else {
            return "You are Disconnected Please connect to some Database first";
        }
    }


    @Override
    public void checkConnectionStatus() {
        // Boolean isConnectionAlive;

        if (isConnectionAlive) {
            System.out.println("Connection is Alive");
        } else {
            System.out.println("Connection is not Alive");

        }


    }
}

//        if(connectionDetail.equals("Strong Bandwidth")) {
//            isConnectionAlive = true;
//        }else {
//            isConnectionAlive = false;
//        }