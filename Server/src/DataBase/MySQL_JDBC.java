package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_JDBC {
	
	public static void main(String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver"); //����MYSQL JDBC��������
			System.out.println("Success Loading Mysql Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","DamageDealer","answer");
			//����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������
			
			System.out.println("Success connect Mysql Server");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select *from student");
			
			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
