// Bài 7: Kiểm tra tính hợp lệ của tam giác

//        Viết chương trình Java thực hiện các chức năng sau:
//
//        Nhập ba số nguyên dương từ người dùng,tương ứng với ba cạnh của một tam giác
//        Kiểm tra xem ba cạnh nhập vào có tạo thành một tam giác hợp lệ không
//        Quy tắc kiểm tra tam giác:Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại
//        Nếu không hợp lệ,hiển thị thông báo:"Ba cạnh không tạo thành tam giác.”
//        Nếu ba cạnh hợp lệ:
//        Phân loại tam giác:
//        Tam giác đều:Ba cạnh bằng nhau.
//        Tam giác cân:Hai cạnh bằng nhau
//        Tam giác vuông:Bình phương một cạnh bằng tổng bình phương hai cạnh còn lại
//        Tam giác thường:Không thuộc các loại trên
//        Hiển thị thông tin chi tiết về loại tam giác

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1: Cho người dùng nhập vào 3 số nguyên dương

        System.out.println("Hãy nhập vào số nguyên dương thứ 1:");
        if (!input.hasNextInt()) {
            System.out.println("Hãy nhập vào số nguyên dương");
            return;
        }
        int a = input.nextInt();

        System.out.println("Hãy nhập vào số nguyên dương thứ 2:");
        if (!input.hasNextInt()) {
            System.out.println("Hãy nhập vào số nguyên dương");
            return;
        }
        int b = input.nextInt();

        System.out.println("Hãy nhập vào số nguyên dương thứ 3:");
        if (!input.hasNextInt()) {
            System.out.println("Hãy nhập vào số nguyên dương");
            return;
        }
        int c = input.nextInt();
        // B2: Validate giá trị người dùng nhập vào


        // B4: Nếu không hợp lệ thì hiển thị thông báo :" Ba cạnh không tạo thành tam giác"
        if (!((a + b) > c && (a + c) > b && (b + c) > a)) {
            System.out.println("Ba cạnh không tạo thành tam giác");
        } else {
            // B5: Nếu 3 cạnh hợp lệ :
            if (a == b && b == c) {
                // 1. 3 cạnh bằng nhau - > tam giác đều
                System.out.println("Ba cạnh tạo thành tam giác đều !");
            } else if (a == b || b == c) {
                // 2. 2 cạnh bằng nhau - > tam giác cân
                System.out.println("Ba cạnh tạo thành tam giác cân !");
            } else if (
                // 3. Bình phương 2 cạnh = tổng bình phương 2 cạnh còn lại  -> tam giác vuông
                    Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) ||
                            Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) ||
                            Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                System.out.println("Ba cạnh tạo thành tam giác vuông !");
            } else {
                // 4. Không thuộc loại trên -> tam giác thường
                System.out.println("Ba cạnh tạo thành tam giác thường !");
            }
        }
    }
}




