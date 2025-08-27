// Bài 10:Kiểm tra và in các số Happy numbers trong khoảng từ 1 đến N
//Đầu vào:
//Một số nguyên dương N được nhập từ bàn phím.
//Xử lý:
//Sử dụng vòng lặp để duyệt qua các số từ 1 đến N.
//Với mỗi số, tính tổng bình phương các chữ số và lặp lại quá trình này cho đến khi số đó bằng 1 (số Happy) hoặc phát hiện vòng lặp vô hạn.
//Nếu số đó là số Happy, in ra số đó.
//Đầu ra:
//In danh sách các số Happy trong khoảng từ 1 đến N.

//T* Phân tích và các bước làm của Thế

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên dương (1~)");
        if (!input.hasNextInt()) {
            System.out.println(" Bạn nhập không hợp lệ");
            return;
        }
        int n = input.nextInt();
        // B2:Validate giá trị người dùng nhập vào
        if (n < 1) {
            System.out.println("Số bạn nhập phải >=1");
            return;
        }
        // B3:Dùng vòng lặp for để duyệt qua các số từ 1 đến N
        System.out.printf("Số Happy number trong khoảng từ 1 đến %d là: %n",n);
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int count = 0;
            // B4: Dùng vòng lặp để tách số rồi tính tổng bình phương số vừa tách
            while (temp != 1 && count < 100) { //while vẫn lặp miễn là temp != 1 và số lặp dưới 100 lần
                int sum = 0;  // tạo biến tính tổng sum =0;
                int num = temp; // tạo biến num = temp
                while (num > 0) { // tạo vòng lặp while với điều kiện while vẫn chạy nếu num >0
                    int digit = num % 10; // Tách chữ số ở num rồi gắn vào biến digit
                    sum += digit * digit; // tính tổng = sum + digit*digit
                    num = num / 10;    // xóa dần một chữ số
                }
                temp = sum; // gắn lại giá trị temp = tổng bình phương số ban nãy vừa tách
                count++; // tăng biến đếm lên 1
            }

            if (temp == 1) { // nếu giá trị của temp == 1 thì in ra giá trị
                System.out.println(i);
            }
        }
    }
}





