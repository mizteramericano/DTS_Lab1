package javaapplication3;

import java.util.Random;

class Animal {

    private String name;
    private int age;
    private String country;

    public Animal(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public static String genRandomString(int n) {
        Random ran = new Random();
        String str = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";

        for (int i = 0; i < n; i++) {
            temp += str.charAt(ran.nextInt(str.length()));
        }

        return temp;
    }
}

public class testAnimal {

    public static void main(String[] args) {

        Random ran = new Random();
        Animal[] an = new Animal[100];

        System.out.println("animal have ");
        //save and genarate animal in array(an)
        for (int i = 0; i < an.length; i++) {
            int age = ran.nextInt(50) + 1; // 1 to 50
            String name = Animal.genRandomString(5);
            String country = "";
            if (ran.nextInt(100) < 30) {
                country = "Africa";
            } else {
                country = Animal.genRandomString(5);
            }

            //System.out.println("age : " + age);
            //System.out.println("name: "+ name);
            //System.out.println("country: "+ country);
            // save in array(an)
            an[i] = new Animal(name, age, country);

            System.out.println("name: " + name + " ,country : " + country + " ,age : " + age);
        }

        double avg = 0.0;
        double sum = 0.0;

        for (int i = 0; i < an.length; i++) {
            if(an[i].getCountry().equals("Africa")){
                sum += an[i].getAge();
            }  
        }

        avg = sum / 100.00;
        System.out.printf("age average is %.2f\n", avg);

    }
}
