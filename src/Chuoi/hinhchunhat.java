package Chuoi;

import java.util.Scanner;

public class hinhchunhat {
    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua HCN: ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao chieu rong cua HCN: ");
        int m = scanner.nextInt();

        if (n < m) {
            System.out.println("Nhap lai:");
        }

        System.out.println("Dien tich cua HCN la: " + m * n);
        System.out.println("Chu vi cua HCN la: " + (m + n) * 2);
    }
}
