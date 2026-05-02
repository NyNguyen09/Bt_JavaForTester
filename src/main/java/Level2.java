import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        //Bài tập 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap thu nhap cua ban: ");
        double thunhap = sc.nextDouble();

        System.out.println("Thue phai tra " + tinhThue(thunhap));

        //Bài tập 2
        String input = "madam";
        if(doiXung(input)) {
            System.out.println(input + " doi xung");
        }
        else
            System.out.println(input + " khong doi xung");

        //Bài tập 3
        String input2 = "programming";
        System.out.println("Chuoi da xoa ky tu lap: " + xoaKyTuLap(input2));
    }

    public static double tinhThue(double thunhap){
        double thue = 0;

        if (thunhap > 0 && thunhap < 5000000)
            thue = thunhap * 0.05;
        else if (thunhap < 10000000)
            thue = thunhap * 0.10;
        else if (thunhap < 18000000)
            thue = thunhap * 0.15;
        else if (thunhap < 32000000)
            thue = thunhap * 0.20;
        else if (thunhap < 52000000)
            thue = thunhap * 0.25;
        else if (thunhap < 80000000)
            thue = thunhap * 0.30;
        else
            thue = thunhap * 0.35;

        return thue;
    }

    public static boolean doiXung(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String xoaKyTuLap(String s){
        String ketQua = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (ketQua.indexOf(c) == -1) {
                ketQua += c;
            }
        }

        return ketQua;
    }
}