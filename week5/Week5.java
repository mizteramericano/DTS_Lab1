/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

public class Week5 {

    public static void reverse(String str) {

        if (str.length() >= 1) {
            reverse(str.substring(1)); // BC
            System.out.print(str.charAt(0)); // A
        }
        

    }

    public static void main(String[] args) {
        reverse("ABC");
    }

}
