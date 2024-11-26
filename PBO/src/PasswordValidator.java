
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nidzzz
 */
public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Panjang minimal 8 karakter
        if (password.length() < 8) {
            System.out.println("Password harus memiliki minimal 8 karakter.");
            return false;
        }

        // Regex untuk memeriksa huruf besar, huruf kecil, angka, dan simbol
        String upperCasePattern = ".*[A-Z].*";
        String lowerCasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";
        String specialCharPattern = ".*[@#$%^&+=!].*";

        if (!password.matches(upperCasePattern)) {
            System.out.println("Password harus mengandung setidaknya satu huruf besar.");
            return false;
        }

        if (!password.matches(lowerCasePattern)) {
            System.out.println("Password harus mengandung setidaknya satu huruf kecil.");
            return false;
        }

        if (!password.matches(digitPattern)) {
            System.out.println("Password harus mengandung setidaknya satu angka.");
            return false;
        }

        if (!password.matches(specialCharPattern)) {
            System.out.println("Password harus mengandung setidaknya satu simbol (@#$%^&+=!).");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password valid!");
        } else {
            System.out.println("Password tidak valid.");
        }

        scanner.close();
    }
}
