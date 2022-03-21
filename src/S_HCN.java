import java.util.Scanner;

public class S_HCN {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng scanner;

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat(); //Nhập chiều cao

        float area = width * height;
        System.out.println("Diện tích Hình Chữ Nhật = " + area);
    }
}
