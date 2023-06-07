import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Nhập chuỗi: ");
        String chuoi = "svjsdbvcwevfchvsdcghacv";

        System.out.print("Nhập ký tự cần tìm: ");
        char kyTu = scanner.nextLine().charAt(0);

        int dem = demSoLanXuatHien(chuoi, kyTu);
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi là: " + dem);
    }

    public static int demSoLanXuatHien(String chuoi, char kyTu) {
        int dem = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }

        return dem;
    }
}
