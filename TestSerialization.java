package javaapplication3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {

    private String name;
    private double price;

    public Product(String n, double p) {
        name = n;
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + "," + price;
    }

    public String getName() {
        return name;
    }

}

public class TestSerialization {

    public static void main(String[] args) {
        Product[] r = {new Product("A", 100.0), new Product("B", 150.0)};

        //write
        try {
            FileOutputStream fos = new FileOutputStream("TestSerialization.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(r);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }

        //read
        Product[] s = new Product[2];
        try {
            FileInputStream fis = new FileInputStream("TestSerialization.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s = (Product[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
        }

        //Debug
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName() + " " + s[i].getPrice());
        }

    }
}
