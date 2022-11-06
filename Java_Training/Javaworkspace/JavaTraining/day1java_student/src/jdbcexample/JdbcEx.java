package jdbcexample;
import java.sql.*;
public class JdbcEx {
	public static void main(String args[]){
		
		// step1: register Driver class with DriverManager

		try
		{
		Class.forName("driverclassname");  // it will look and register means find some class
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		// step2: ask SQL Connection from Driver Manager class, providing connection url,username,password
		// es try statement m auto closable content h
		/*try(Connection con = DriverManger.getConnection("http://localhost:portno/dbname","piyush","piyush");)
		{
		
			// step3: get statement object from computer
			Statement st = con.createStatement(); // return the object of that class which is implementing Statement class

			// step4: fire/execute on Statement object and collect the ResultSet object
			ResultSet rs = st.executeQuery("SELECT studid,studname,studsurname FROM STUDENT"); // return the object of that class which is implementing ResultSet class
			
			// step5: Iterate through the ResultSet top getch the rows
			// fetch the result
			while(rs.next()){

				// step6: use resultSet, getxxx(column no) to fetch particular column value	
				int id = rs.getInt(1); //studid type int
				String name = rs.getString(2);
				String surname = rs.getString(3);
				System.out.println("id="+id+", name="+name+", surname"+surname);
				
			}

			rs.close();
			st.close();
			// step6: connection is auto closed as u r using try with resources		
			
		}
		catch(SQLException e)
		{
			e.printStrackTrace();	
		}
	}
	*/
	}
}
