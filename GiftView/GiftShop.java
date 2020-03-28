package Java2_06.GiftView;

import Java2_06.GiftController.GiftControler;
import Java2_06.GiftModel.Gift;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        GiftControler giftControler = new GiftControler();
        do {
            do{
                System.out.println("<!----------Yêu Cầu của bạn---------!>" + "\n");
                System.out.println("1.Hiển thị toàn bộ đồ uống trong database \n"
                        +"2.Nhập thêm đồ uống \n"
                        +"3.Xóa đồ uống theo ID \n");
                System.out.print("Nhập n: ");
                n = sc.nextInt();
            }while (n<0 || n>3);
            switch (n) {
                case 1:
                    giftControler.selectAll();
                    break;
                case 2:
                    int idNew;
                    System.out.print("Nhập id: " + "\n");
                    idNew = sc.nextInt();
                    System.out.print("Nhập tên: " + "\n");
                    String nameNew = sc.nextLine();
                    nameNew = sc.nextLine();
                    System.out.print("Nhập giá: " + "\n");
                    Double priceNew = sc.nextDouble();
                    System.out.print("Nhập số lượng: " + "\n");
                    int qtyNew = sc.nextInt();
                    Gift g1 = new Gift(idNew,nameNew,priceNew,qtyNew);
                    giftControler.InsertGift(g1);
                    break;
                case 3:
                    int newId;
                    System.out.print("Nhập ID bạn muốn xóa: ");
                    newId = sc.nextInt();
                    giftControler.Delete(newId);
            }
        }while (n != 0);
    }

}

