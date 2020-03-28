package Java2_07;

import java.sql.*;
public class Exercise1 {
    public static void main(String[] args) {
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
//            String updatePrice = "Update books set price = price + price*50/100 where author= 'Vuong Ngoc Khanh'";
////            System.out.println("The SQL statement is: " + updatePrice + "\n");
////            int counUpdate = stmt.executeUpdate(updatePrice);

            String updateQty = "Update books set qty = 0 where author = 'Vuong Ngoc Khanh'";
            System.out.println("The SQL Statement is: " + updateQty);
            int counUpdate2 = stmt.executeUpdate(updateQty);

            String selectAll ="select * from books where author = 'Vuong Ngoc Khanh'";
            System.out.println("The SQL statement is: " + selectAll + "\n");
            ResultSet rset = stmt.executeQuery(selectAll);

            while (rset.next()){
                System.out.println(rset.getInt("id")
                        + ", " + rset.getString("title")
                        + ", " + rset.getString("author")
                        + ", " + rset.getDouble("price")
                        + ", " + rset.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
