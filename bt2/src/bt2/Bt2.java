/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy Fibonacci: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;

        System.out.print("Dãy Fibonacci: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
