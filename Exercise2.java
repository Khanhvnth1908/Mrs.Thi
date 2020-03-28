package Java2_07;

import java.sql.*;

public class Exercise2 {
    public static void main(String[] args) {
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/norwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            //<--------------CateGories----------------->//

            String updateCategory = "Update categories set CategoryName='SeaFood VN' where CategoryName='Seafood'";
            System.out.println("The SQl statement is: " + updateCategory + "\n");
            int counUpdate = stmt.executeUpdate(updateCategory);

            String selectAll = "select * from categories where Categoryname='SeaFood VN'";
            System.out.println("The SQL statement is: " + selectAll + "\n");
            ResultSet rset = stmt.executeQuery(selectAll);

            while (rset.next()){
                System.out.println(rset.getInt("CategoryID")
                        + ", " + rset.getString("CategoryName")
                        + ", " + rset.getString("Description"));
//                        + ", " + rset.getString("Picture"));
            }

            //<---------------Customer--------------->//

            String updateCustomer = "update customers set Address ='1A-Yet Kieu HaNoi' where CustomerID = 'FRANK'";
            System.out.println("The SQl statement is: " + updateCustomer + "\n");
            counUpdate = stmt.executeUpdate(updateCustomer);

            String selectAll2 = "select * from customers where CustomerID='FRANK'";
            System.out.println("The SQl statement is: " + selectAll2 + "\n");
            ResultSet rset1 = stmt.executeQuery(selectAll2);

            while (rset1.next()){
                System.out.println(rset1.getString("CustomerID")
                        + ", " + rset1.getString("CompanyName")
                        + ", " + rset1.getString("ContactName")
                        + ", " + rset1.getString("ContactTitle")
                        + ", " + rset1.getString("Address")
                        + ", " + rset1.getString("City")
                        + ", " + rset1.getString("Region")
                        + ", " + rset1.getString("Region")
                        + ", " + rset1.getString("PostalCode")
                        + ", " + rset1.getString("Country"));
            }
            //<------------------Products-------------->//
            String updateProducts = "update products set UnitPrice = UnitPrice * 10/100 where ProductID = 5 Or ProductID = 6 Or ProductID = 7";
            System.out.println("The SQl statement is: " + updateProducts + "\n");
            counUpdate = stmt.executeUpdate(updateProducts);

            String selectAll3 = "select * from products where  ProductID = 5 Or ProductID = 6 Or ProductID = 7";
            System.out.println("The SQL statement is: " + selectAll3 +"\n");
            ResultSet rset2 = stmt.executeQuery(selectAll3);

            while (rset2.next()){
                System.out.println(rset2.getInt("ProductID") + ", " + rset2.getString("ProductName") + ", "
                                    + rset2.getInt("SupplierID") + ", " + rset2.getInt("CategoryID") + ", "
                                    + rset2.getString("QuantityPerUnit") + ", " + rset2.getDouble("UnitPrice") + ", "
                                    + rset2.getInt("UnitPrice") + ", " + rset2.getInt("UnitsinStock") + ", "
                                    + rset2.getInt("UnitsOnOrder") + ", " + rset2.getInt("ReorderLevel") + ", "
                                    + rset2.getInt("Discontinued"));
            }

            //<--------------------ODERs-------------------->//
            String updateOder = "update orders set ShipVia = 3 where OrderID = 10313";
            System.out.println("The SQL statement is: " + updateOder +"\n");
            counUpdate = stmt.executeUpdate(updateOder);

            String selectOrder = " select * from orders where OrderID = 10313";
            System.out.println("The SQL statement is: " + selectOrder +"\n");
            ResultSet rset3 = stmt.executeQuery(selectOrder);

            while (rset3.next()){
                System.out.println(rset3.getInt("OrderID") + ", " + rset3.getString("CustomerID") + ", "
                         + rset3.getInt("EmployeeID") + ", " + rset3.getString("OrderDate") + ", "
                        + rset3.getString("RequiredDate") + ", " + rset3.getString("ShippedDate") + ", "
                        + rset3.getInt("ShipVia") + ", " + rset3.getDouble("Freight") + ", "
                        + rset3.getString("ShipName") + ", "
                        + rset3.getString("ShipAddress") + ", " + rset3.getString("ShipCity") + ", "
                        + rset3.getString("ShipRegion") + ", " + rset3.getString("ShipPostalCode") + ", "
                        + rset3.getString("ShipCountry"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
