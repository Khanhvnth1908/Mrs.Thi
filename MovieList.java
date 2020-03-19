package Java2_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> film = new ArrayList<>();
        String nameFilm;
        Boolean check;
        Integer x;
        Integer n;
        Integer m=0;
        Integer selection= 0;
        System.out.println("Nhập số bộ phim yêu thích: ");
        n = sc.nextInt();
        for (int i = 0;i<n;i++){
            System.out.println("\n Nhập tên bộ phim thứ" + i );
            film.add(sc.next());
            System.out.println("Bộ phim yêu thích thứ" + i + " la:" + film.get(i));
        }
        System.out.println();
        do{
            System.out.println("1.Thêm phim mới");
            System.out.println("2.In ra danh sách các bộ phim yêu thích");
            System.out.println("3.Chỉnh sửa tên phim đã có");
            System.out.println("4.Xóa đi 1 bộ phim khỏi danh sách phim yêu thích");
            System.out.println("5.Tìm kiếm tên phim trong danh sách phim yêu thích");
            selection = sc.nextInt();
            switch (selection){
                case 1:
                    System.out.println("\nNhập tên bộ phim muốn thêm");
                    film.add(sc.next());
                    System.out.println("Danh sách các bộ phim yêu thích là: " + film);
                    break;
                case 2:
                    System.out.println("\nDanh sách các bộ phim yêu thích của bạn là: " + film);
                    break;
                case 3:
                    System.out.println("\nSau đây là các bộ phim yêu thích của bạn " + film);
                    System.out.println("Nhập vị trí và tên phim muốn chỉnh sửa(LƯU Ý: Nhập vị trí trước tên): ");
                    film.set(x = sc.nextInt(), nameFilm = sc.next());
                    System.out.println("Danh sách các bộ phim sau khi chỉnh sửa: " + film);
                    break;
                case 4:
                    System.out.println("Sau đây là các bộ phim yêu thích của bạn: " + film);
                    System.out.println("\nNhập tên phim muốn xóa: ");
                    film.remove(nameFilm = sc.next());
                    System.out.println("Danh sách các bộ phim sau khi chỉnh sửa: " + film);
                    break;
                case 5:
                System.out.println("\n Nhập tên bộ phim bạn muốn tìm kiếm: ");
                check = film.add(sc.next());
                System.out.println("Tên bộ phim của bạn: " + film.contains(check));
            }
        }while (m<0);
    }
}
