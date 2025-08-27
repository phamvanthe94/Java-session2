// Bài 6:Tính tổng các chữ số của một số nguyên
//Đầu vào:
//Một số nguyên N, có thể âm hoặc dương, được nhập từ bàn phím.
//Xử lý:
//Nếu số là âm, chuyển nó thành số dương.
//Sử dụng vòng lặp để tách từng chữ số của N (lấy phần dư khi chia 10).
//Cộng các chữ số lại để tính tổng.
//In ra tổng của các chữ số.
//Đầu ra:
//Hiển thị tổng các chữ số của N.

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        // B1: Cho người dùng nhập vào 1 số nguyên từ bàn phím
        System.out.println("Hãy nhập một số nguyên:");
        // B2 : Validate giá trị người dùng nhập vào
        if (input.hasNextInt()) {
            // B3 : Nếu là số nguyên thì sử dụng giá trị tuyệt đối cho nó thành nguyên dương Math.abs(value)
            int n = Math.abs(input.nextInt());

            // B4 : Sử dụng vòng lặp tách từng số của N
            while (n > 0) { // sử dụng vòng lặp while (miễn là n> 0 thì while vẫn chạy )
                // Sủ dụng vòng lặp for để lặp qua giá trị
                int a = n % 10; // tạo biến a = n%10 lấy phần dư khi chia 10 = số cuối cùng của số nguyên nhập vào)
                n = n / 10; // gắn lại giá trị n = n/10  = với giá trị còn lại của n khi mất đi số cuối cùng
                sum = sum + a; // mỗi lần lấy được một chữ số ở đuôi số nguyên thì cho nó vào tổng sum

            }
            System.out.println("Tổng các chữ số của số nguyên bạn nhập là: " + sum);
            // In ra tổng các chữ số trong số nguyên

        } else {
            System.out.println("Giá trị bạn nhập vào không hợp lệ");
            // Trường hợp người dùng nhập không phải số nguyên thì in ra giá trị không hợp lệ
        }


        input.close();// đóng scanner
    }
}


// Phân tích : ví dụ N = 1234 sum = 0 ;
// Vòng 1 : 1234 % 10 -> 4 + vào sum
// 1234/ 10 -> cập nhật lại n = 123