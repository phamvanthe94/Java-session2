// Bài 2 : Nhập ngày trong tuần
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // B1: Cho người dùng nhập vào giá trị chọn
        System.out.println("Hãy nhập vào số tương ứng (1-7)");
    // B2: tạo biến n = với giá trị người dùng nhập
        int n = input.nextInt();
    // B3: So sánh n với các case khác
    switch (n) {
        case 1:
            System.out.println("Hôm nay là ngày chủ nhật");
            break;
        case 2:
            System.out.println("Hôm nay là thứ 2");
            break;
        case 3:
            System.out.println("Hôm nay là thứ 3");
            break;
        case 4:
            System.out.println("Hôm nay là thứ 4");
            break;
        case 5:
            System.out.println("Hôm nay là thứ 5");
            break;
        case 6:
            System.out.println("Hôm nay là thứ 6");
            break;
        case 7:
            System.out.println("Hôm nay là thứ 7");
            break;
        default:
            System.out.println("Bạn nhập giá trị không hợp lệ");
    }
    }
}
