package Java2_06.GiftController;


import Java2_06.GiftModel.Gift;
import java.sql.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GiftControler {
    Scanner sc = new Scanner(System.in);
//------Hiển thị toàn bộ thông tin các bảng trong database
    public void selectAll(){
    try (
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root",
                    "");
            Statement stmt = conn.createStatement();
    ){
        String selectAll = "select * from gift";
        System.out.println("The SQL statement is: " + selectAll);
        ResultSet rset = stmt.executeQuery(selectAll);

        while (rset.next()){
            int id = rset.getInt("id");
            String name = rset.getString("name");
            double price = rset.getDouble("price");
            int qty = rset.getInt("qty");
            System.out.println(id + ", " + name + ", " + price + ", " + qty);
        }
    }catch (SQLException ex){
        ex.printStackTrace();
    }
}


//---------Nhập vào thông tin đầy đủ của các bảng trong database từ bàn phím
    public void InsertGift(Gift gift){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String Insert = "Insert into gift value (" + gift.getId()
                    + ", '"+ gift.getName()
                    +"' , " + gift.getPrice()
                    + ", " + gift.getQty() + ")";
            int count = stmt.executeUpdate(Insert);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

//----------Xóa tất cả thông tin của hàng theo id
    public void Delete(int newId){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String delete = "DELETE FROM gift where id =" + newId;
            int count = stmt.executeUpdate(delete);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }



}
