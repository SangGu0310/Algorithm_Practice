package step0;

import java.util.Scanner;

public class AddString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String str2 = "";
        for (int i = 0; i < n; i++) {
        	str2+=str;
		}
        System.out.println(str2);
    }

}
