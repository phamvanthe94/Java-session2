// Bài 4:Bài toán yêu cầu tạo biến age để lưu giá trị nhập vào từ người dùng ,
// nếu người dùng nhập một chuỗi , một số âm  hoặc để trống ,
// tóm lại là không phải một số nguyên thì cho người dùng nhập lại đến khi nào nhập đúng
// một số nguyên thì thôi và sau đó in ra dòng chữ : “ Tuổi của bạn là [age] ! “ .

import java.util.Scanner;


public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        do {
            //B1: Cho người dùng nhập vào số nguyên
            System.out.println("Hãy nhập vào 1 số nguyên:");

            //B2: Validate số nguyên người dùng nhập vào có hợp lệ hay không
            if (input.hasNextInt()) { // dùng value.hasNextInt() để xem người dùng có nhập vào số nguyên hay không
                age = input.nextInt(); // Nếu người dùng nhập vào số nguyên thì gán age = giá trị nhập vào
                if (age <= 0) { // Validate tiếp Nếu người dùng nhập số <=0
                    System.out.println("Hãy nhập vào số nguyên lớn hơn 0!");
                }
            } else { // Trong trường hợp người dùng nhập không phải số nguyên
                System.out.println("Giá trị nhập vào không hợp lệ!");
                input.next(); // Xóa giá trị không hợp lệ .. value.next()
            }
        } while (age <= 0); // Vòng lặp while vẫn chạy nếu người dùng nhập số <=0
        System.out.printf("Tuổi của bạn là %d !%n", age); // Sau khi người dùng nhập đúng thì in ra
        input.close(); // Đóng scanner
    }
}