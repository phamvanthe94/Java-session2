import java.util.Scanner;

// Bài:5
// Sinh viên cần viết một chương trình Java thực hiện các nhiệm vụ sau:
//Yêu cầu người dùng nhập một số nguyên từ 1 đến 12 (tương ứng với tháng)
//Sử dụng cấu trúc switch-case để:
//Hiển thị tên tháng
//Hiển thị số ngày của tháng:
//Tháng 1, 3, 5, 7, 8, 10, 12: có 31 ngày
//Tháng 4, 6, 9, 11: có 30 ngày
//Tháng 2: có 28 hoặc 29 ngày
//Xử lý trường hợp người dùng nhập số không hợp lệ (không nằm trong khoảng 1-12)
// và hiển thị thông báo: "Tháng không hợp lệ.”
public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1: Cho người dùng nhập số nguyên từ 1 -> 12
        System.out.println("Hãy nhập tháng mà bạn thích : ");
        // B2: Sử dụng cấu trúc swich-case để so sánh giá trị người dùng
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Tháng 1 có 31 ngày !");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày !");
                break;
            case 3:
                System.out.println("Tháng 3 có 31 ngày !");
                break;
            case 4:
                System.out.println("Tháng 4 có 30 ngày !");
                break;
            case 5:
                System.out.println("Tháng 5 có 31 ngày !");
                break;
            case 6:
                System.out.println("Tháng 6 có 30 ngày !");
                break;
            case 7:
                System.out.println("Tháng 7 có 31 ngày !");
                break;
            case 8:
                System.out.println("Tháng 8 có 31 ngày !");
                break;
            case 9:
                System.out.println("Tháng 9 có 30 ngày !");
                break;
            case 10:
                System.out.println("Tháng 10 có 31 ngày !");
                break;
            case 11:
                System.out.println("Tháng 11 có 30 ngày !");
                break;
            case 12:
                System.out.println("Tháng 12 có 31 ngày !");
                break;
            default:
                System.out.println("Tháng bạn nhập không hợp lệ !");
                input.close();
        }
    }
}
