package Chuoi;

import java.util.Scanner;

public class Mang {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So phan tu cua mang : ");
        int n = scanner.nextInt();

        int a[] = new int[n];//phan khai bao va khoi tao

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }

//in mang
        for (int i = 0; i < a.length; i++)//length la thuoc tinh cua mang
            if ((a[i] % 2) == 0 && a[i] > 5)
                System.out.println("So chia het cho 2 & lon hon 5 la : " + a[i]);

    }
}
