/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int randomNumber = random.nextInt(50) + 1;
            int guess = 0;
            
            while (guess != randomNumber) {
                System.out.print("Đoán một số từ 1 đến 50: ");
                guess = scanner.nextInt();
                
                if (guess < randomNumber) {
                    System.out.println("Số của bạn nhỏ hơn. Hãy thử lại.");
                } else if (guess > randomNumber) {
                    System.out.println("Số của bạn lớn hơn. Hãy thử lại.");
                } else {
                    System.out.println("Chúc mừng! Bạn đã đoán đúng số.");
                }
            }
            
            System.out.println("Trò chơi kết thúc.");
        }
    }
}

    
    

