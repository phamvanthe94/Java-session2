// Bài 9 : Xác định số Armstrong trong khoảng từ 0 đến N
//Đầu vào:
//Một số nguyên dương N được nhập từ bàn phím.
//Nếu người dùng không nhập vào số nguyên dương thì hiển thị thông báo “Số nhập vào không hợp lệ
//Xử lý:
//Sử dụng vòng lặp để duyệt qua các số từ 0 đến N.
//Với mỗi số, tính số chữ số của nó (k).
//Tính tổng lũy thừa bậc k của từng chữ số.
//Nếu tổng này bằng chính số đó, thì số đó là số Armstrong.
//Đầu ra:
//In danh sách các số Armstrong trong khoảng từ 0 đến N.


import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //T* Phân tích các bước :
        // B1: cho người dùng nhập vào bàn phím 1 số nguyên dương
        System.out.println("Hãy nhập vào một số nguyên dương :");


        // B2: Validate giá trị người dùng nhập vào
        if (!input.hasNextInt()) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }
        int n = input.nextInt();
        // Nếu người dùng không nhập vào số nguyên dương thì hiển thị thông báo “Số nhập vào không hợp lệ"
        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        System.out.printf("Các số Armstrong từ 0 đến %d là :%n", n);
        // B3: Chạy vòng lặp i (i chạy từ 0 đến n)
        for (int i = 0; i <= n; i++) {
            // Gán giá trị gốc của i = original
            int original = i;
            // Gán  giá trị tạm thời của i = temp
            int temp = i;
            // tạo biến k = 0 để tí đếm số chữ số trong số người dùng nhập
            int k = 0;
            // Tạo biến sum = 0 để tính tổng lũy thừa của các chữ số
            double sum = 0;
            // Tạo vòng lặp while để tách chữ số
            while (temp > 0) { // miễn temp > 0 thì vòng lặp vẫn chạy (temp = i hiện tại)
                k = k + 1; // mỗi lần vòng lặp chạy sẽ tăng k lên 1 đơn vị
                temp = temp / 10; // giảm bớt một chữ số mỗi vòng
            }
            if (k == 0) // Xét trường hợp i = temp = 0
                k = 1;
            temp = i; // Gán lại giá trị chi temp
            while (temp > 0) { // Tạo vòng lặp while
                int digit = temp % 10; // Tách từng chữ số trong số nhập vào (ví dụ 123%10 -> tách số 3)
                sum = sum + Math.pow(digit, k); // Tính tổng lũy thừa k của số vừa tách cho vào sum
                temp = temp / 10; // Xóa phần tử vừa tách (ví dụ 123/10 = 12)
            }
            if (sum == original) { // Nếu sum = giá trị i ban đầu ==> số Armstrong
                System.out.println(original); // in ra số
            }
        }
    }
}



