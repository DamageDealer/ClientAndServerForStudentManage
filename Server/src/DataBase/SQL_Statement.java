package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Statement {
	
	public static  Statement statement =null;
	
	public static void main(String [] args){
		statement = (new MySQL_JDBC()).statement;
		
		ResultSet result;
		try {
			result = statement.executeQuery("select *from student");
			while(result.next()){
				System.out.println(result.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
