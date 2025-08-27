// Bài 8:  Đọc số thành chữ(3 chữ số)
//Yêu cầu:
//Nhập vào một số hợp lệ(100-999):
//Nhập vào một số 100-999
//Nếu người dùng nhập vào số vượt ngoài phạm vi 100-999 thì thông báo “Số nhập vào không hợp lệ”
//Tách số:
//Tách một số có 3 chữ số thành 3 số có một chữ số và lưu chúng vào các biến hundreds, tens, units.
//In ra kết quả tương ứng:
//Sử dụng switch-case hoặc if-else để in ra từng trường hợp tương ứng với từng giá trị hundreds, tens, units.
//Ví dụ: khi người dùng nhập vào 123 thì chương trình in ra “Một trăm hai mươi ba”

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //B1: Cho người dùng nhập vào 1 số nguyên 100-999
        System.out.println("Hãy nhập vào 1 số nguyên trong khoảng 100-999");
        //B2: Validate giá trị người dùng nhập vào
        if (!input.hasNextInt()) {
            System.out.println("Bạn nhập không hợp lệ");
            return;
        }
        // Lưu giá trị người dùng nhập vào biến int N
        int n = input.nextInt();
        //B3: nếu người dùng nhập ngoài phạm vi 100-999 thì thông báo "Số nhập không hợp lệ"
        if (n < 100 || n > 999) {
            System.out.println("Số nhập không hợp lệ");
        } else {
            //B4: Tách số
            //   a.Tách số hàng trăm bằng cách lấy N/100 -> lưu vào biến hundreds
            int hundred = n / 100;
            //   b.Tách số hàng chục bằng cách lấy (N%100)/10 -> lưu vào biến tens
            int ten = (n % 100) / 10;
            //   c.Tách số hàng đơn vị bằng cách lấy N%10 -> Lưu vào biến units
            int units = n % 10;

            //B5: Tạo ra các biến textHundreds , textTens, textUnits
            String textHundreds = "";
            String textTens = "";
            String textUnits = "";
            // dùng switch -case để in ra từng trường hợp tương ứng với các số đã tách
            switch (hundred) {
                case 1:
                    textHundreds = "Một trăm";
                    break;
                case 2:
                    textHundreds = "Hai trăm";
                    break;
                case 3:
                    textHundreds = "Ba trăm";
                    break;
                case 4:
                    textHundreds = "Bốn trăm";
                    break;
                case 5:
                    textHundreds = "Năm trăm";
                    break;
                case 6:
                    textHundreds = "Sáu trăm";
                    break;
                case 7:
                    textHundreds = "Bảy trăm";
                    break;
                case 8:
                    textHundreds = "Tám trăm";
                    break;
                case 9:
                    textHundreds = "Chín trăm";
                    break;
            }
            switch (ten) {
                case 0:
                    textTens = "lẻ";
                    break;
                case 1:
                    textTens = "mười";
                    break;
                case 2:
                    textTens = "hai mươi";
                    break;
                case 3:
                    textTens = "ba mươi";
                    break;
                case 4:
                    textTens = "bốn mươi";
                    break;
                case 5:
                    textTens = "năm mươi";
                    break;
                case 6:
                    textTens = "sáu mươi";
                    break;
                case 7:
                    textTens = "bảy mươi";
                    break;
                case 8:
                    textTens = "tám mươi";
                    break;
                case 9:
                    textTens = "chín mươi";
            }
            switch (units) {
                case 1:
                    textUnits = "một";
                    break;
                case 2:
                    textUnits = "hai";
                    break;
                case 3:
                    textUnits = "ba";
                    break;
                case 4:
                    textUnits = "bốn";
                    break;
                case 5:
                    textUnits = "Lăm";
                    break;
                case 6:
                    textUnits = "sáu";
                    break;
                case 7:
                    textUnits = "bảy";
                    break;
                case 8:
                    textUnits = "tám";
                    break;
                case 9:
                    textUnits = "chín";
            }
            if (ten == 0 && units == 0) {
                textTens = "";
                textUnits = "";
            }
            System.out.println(textHundreds + " " + textTens + " " + textUnits);
        }
    }
}


// Phân tích : làm thế nào để tách số có 3 chữ số ?
// ví dụ : cho số 123
// test1 : dùng %10 --> vòng 1 123 % 10 -> tách được 3 -> lưu vào biến units
// vòng 2 12 %10 -> tách được 2 -> lưu vào biến tens
// vòng 3 còn số 1 - >lưu vào biến hundreds
// hơi fail

// test 2 (ok)
// 123/100 = 1 => hundreds
// (123%100)/10 = 23/10 = 2 => tens
// 123%10 = 3 => units