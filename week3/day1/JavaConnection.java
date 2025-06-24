package week3.day1;

public class JavaConnection implements DataBaseConnection {
	
	public void connect() {
        System.out.println("Connect is: Connecting from the Java database");
    }
	
	
	public void disconnect() {
        System.out.println("Disconnect is: Disconnecting from the Java database");
    }

    @Override
    public void executeUpdate() {
        System.out.println("ExecuteUpdate is: Executing update statement in Java database");
    }

    
    public static void main(String[] args) {
        JavaConnection db = new JavaConnection();  

        db.connect();         // Calls connect
        db.executeUpdate();   // Calls executeUpdate
        db.disconnect();      // Calls disconnect
    }
}

	
	

	


