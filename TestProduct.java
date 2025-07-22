package javaapplication3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class Product {

    private String name;
    private double price;

    public Product(String n, double p) {
        name = n;
        price = p;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "," + price;
    }
}

public class TestProduct {

    public static void main(String[] args) {
        Product[] p = {new Product("x", 10.0), new Product("y", 20.0)};

        // write file
        try {
            FileWriter fileWriter = new FileWriter("data.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Product x : p) {
                printWriter.println(x.toString());
            }
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
        }

        //read
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            Product[] q = new Product[2];
            for (int i = 0; i < 2; i++) {
                String[] str = reader.readLine().split(",");
                q[i] = new Product(str[0], Double.valueOf(str[1]));
            }
            fileReader.close();

        } catch (Exception e) {
        }

    }

}
