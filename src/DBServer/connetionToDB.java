package DBServer;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConnection;


public class connetionToDB { 
    public static void main(String[] args)  {
        Connection conn;
        System.out.println("Server waiting for connection...");
        try  {

          conn  = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/Users/kheda/Desktop/cpit305-course-project/mydata");
            ServerSocket server = new ServerSocket(2000);
        
           
while(true){

    Socket socket = server.accept();
     
   //  new Sender(socket,conn).start();
     new Receiver(socket,conn).start();
    
     
       
    } 
     
} catch (SQLException e) {
    // TODO Auto-generated catch block
    System.out.println(e);
}catch( IOException e){
    System.out.println(e);
}

}
}
