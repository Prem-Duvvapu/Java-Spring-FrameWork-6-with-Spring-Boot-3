//import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            1. Import packages
            2. Load driver
            3. Register driver
            4. Create connection
            5. Create statement
            6. Execute statement
            7. Close connection
         */

        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="password333";

       String sqlQuery1="select * from students where sid=1";
//        String sqlQuery2="select * from students";
//        String sqlQuery3="insert into students values (4,'Nami',80)";
//        String sqlQuery4="update students set smarks=65 where sid=3";
//        String sqlQuery5="delete from students where sid=2";

//        Load and register driver(not mandatory)
//        Class.forName("org.postgresql.Driver");
//
//        Create connection
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection established...");

//        Create statement
        Statement stat=con.createStatement();

        ResultSet rs=stat.executeQuery(sqlQuery1);
        rs.next();
        String name=rs.getString("sname");
        System.out.println("Student name is: "+name);

//        ResultSet rs=stat.executeQuery(sqlQuery2);
//        while (rs.next()) {
//            int id=rs.getInt(1);
//            String name=rs.getString(2);
//            int marks=rs.getInt(3);
//
//            System.out.println(id+" - "+name+" - "+marks);
//        }

//        boolean status=stat.execute(sqlQuery3);
//        System.out.println(status);

//        boolean status=stat.execute(sqlQuery4);
//        System.out.println(status);

//        boolean status=stat.execute(sqlQuery5);
//        System.out.println(status);k

//        Prepared Statement
        // int id=5;
        // String name="Chopper";
        // int marks=50;

        // String sqlQuery6="insert into students values (?,?,?)";
        // PreparedStatement prepStat=con.prepareStatement(sqlQuery6);
        // prepStat.setInt(1,id);
        // prepStat.setString(2,name);
        // prepStat.setInt(3,marks);

        // prepStat.execute();

        con.close();
        System.out.println("Connection closed");
    }
}