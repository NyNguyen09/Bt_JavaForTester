import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        //Bài tập 1
        System.out.println("Ex1:");
        System.out.println(XoaNguyenAm("Cybersoft"));

        //Bài tập 2
        System.out.println("Ex2:");
        int a[] = {1,3,4,5,0,2};
        System.out.println("Max2 of a: " + SoLonThuHai(a));
        int b[] = {3};
        System.out.println("Max2 of b: " + SoLonThuHai(b));

        //Bài tập 3
        System.out.println("Ex3:");
        System.out.println("Tong so chan: " + tongChan(10));
        System.out.println("Tong so chan: " + tongChan(5));

        //Bài tập 4:
        System.out.println("Ex4:");
        System.out.println("Tong tu: " + demTu("Xin chao cac ban!"));
        System.out.println("Tong tu: " + demTu("Hello Word"));

        //Bài tập 5:
        System.out.println("Ex5:");
        System.out.println("Tong tu: " + layChuCaiDau("Xin chao cac ban!"));
        System.out.println("Tong tu: " + layChuCaiDau("Hello Word"));
    }

    public static String XoaNguyenAm(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
                    && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result += c;
            }
        }

        return result;
    }

    public static int SoLonThuHai(int[] a){
        if(a.length < 2){
            return Integer.MIN_VALUE;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int x = a[i];

            if (x > max1) {
                max2 = max1;
                max1 = x;
            }
            else if (x < max1 && x > max2) {
                max2 = x;
            }
        }

        return max2;
    }

    public static int tongChan(int n){
        int tong = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0)
                tong += i;
        }
        return tong;
    }

    public static int demTu(String s){
        int count = 0 ;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static String layChuCaiDau(String s) {
        String result = "";
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    result += Character.toUpperCase(s.charAt(i)) + " ";
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return result;
    }
}
