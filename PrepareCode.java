
package twst;

import java.util.Random;

public class PrepareCode {
    
    public static void main(String[] args) {
        Random ran = new Random();
    
        //Random int
        int x = ran.nextInt(100)+1;
        System.out.println("Random int : " + x);
        
        //Random double
        double y = (1.00 + (99.99 - 1.00)) * ran.nextDouble();
        System.out.printf("Random double : " + Math.round(y*100.0)/100.0);
        System.out.println("");
        
        //Random String
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        for (int i = 0; i < 2; i++) { // 2 char
            temp += str1.charAt(ran.nextInt(str1.length()));
        }
        
        //Random char
        char[] opt = {'+', '-' , '*' , '/'};
        int index = ran.nextInt(opt.length);
        char ranChar = opt[index];
        System.out.println("Random char : " + ranChar);
        
        
        
    }
}
