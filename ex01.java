import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1: Nhập số nguyên n
        System.out.println("Hãy nhập vào số nguyên:");
        int n = input.nextInt();
        // B2: sử dụng if \ else để xem có phải chẵn hay lẻ hay không ?
        // n%2 == 0 -> n là số chẵn  n%2 != 0 -> n là số lẻ
        // n == 0 -> n không phải số chẵn cũng không phải số lẻ
        if (n == 0) {
            System.out.println("Số" +" " +  n +" " + "không phải số chẵn cũng không phải số  lẻ");
        } else if (n % 2 == 0) {
            System.out.println("Số" +" " + n +" " + "là sỗ chẵn");
        } else {
            System.out.println("Số" + " " +n + " " +"là số lẻ");
        }

    }
}
