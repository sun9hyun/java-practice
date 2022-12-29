package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	
   public static Connection getConnection() {
      Connection connection = null;
      try {
//         연결에 필요한 정보
    	   String url = "jdbc:mysql://localhost:3306/customer";
    	   String username = "root";
    	   String password = "1234";
         
//         드라이버를 메모리에 할당
    	   Class.forName("com.mysql.cj.jdbc.Driver");
         
//         정보를 전달하여 연결 객체 가져오기
         connection = DriverManager.getConnection(url, username, password);
         
         System.out.println("연결 성공");
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("드라이버 로딩 실패");
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 실패");
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("알 수 없는 오류");
      }
      
      return connection;
   }
}