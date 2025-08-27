import java.util.Scanner;

// Bài 3:Yêu cầu:
//Đầu vào:
//Một số nguyên dương N được nhập từ bàn phím.
//Nếu người dùng nhập số không hợp lệ (ví dụ: số âm hoặc số 0), hiển thị thông báo lỗi “Số nhập vào không hợp lệ”.
//Xử lý:
//Sử dụng vòng lặp for để tính tổng các số từ 1 đến N.
//Tính tổng bằng cách cộng dồn từng giá trị từ 1 đến N.
//Đầu ra:
//Hiển thị kết quả tính tổng trên.
public class ex03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // B1: Cho người dùng nhập vào 1 số nguyên dương
        System.out.println("Hãy nhập vào một số nguyên dương");
        int n =  input.nextInt();
    // B2: dùng if\else để validate trong trường hợp người dùng nhập vào số 0 or số âm
        if (n <= 0) {
            System.out.println("Số bạn nhập không phải số nguyên dương!");
        } else {
    // B3:Trong trường hợp người dùng nhập vào số hợp lệ
    // khởi tạo biến sum bắt đầu với giá trị = 0
            int sum = 0;
    // B4:Tạo vòng lặp khi khởi tạo biến i - > n , mỗi lần lặp sẽ cộng vào giá trị sum
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
    // B5: In ra tổng dãy số
            System.out.printf("Tổng của dãy số từ 1 đến %d là : %d", n, sum);
        }
    }
}

