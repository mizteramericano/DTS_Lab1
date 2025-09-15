
package week7_priorityqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class Student {
    String code;
    String name;
    double gpa;
    
    Student(String code,String name,double gpa){
        this.code = code;
        this.gpa = gpa;
        this.name = name;
    }
    
    public String toString(){
        return code + "-" + name + "-" + gpa ;
    }
    
    public double getGpa(){
        return gpa;
    }
    public String getCode(){
        return code;
    }
    
}

/***** sort by qpa **************/
/*
class StudentComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        // ASD : Natural ordering return 1 and -1 
        // DES : switch between return 1 to be -1 and -1 to be 1
        if(s1.getGpa() > s2.getGpa()){
            return -1;
        } else if (s1.getGpa() < s2.getGpa()){
            return 1;
        }
        return 0;
    }
}
*/

/********* sort by String code **********/
class StudentComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        /* compare String code */
        
        // ASD : Natural ordering return 1 and -1 
        // DES : switch between return 1 to be -1 and -1 to be 1
        
        /* use s1.getCode().compareTo(s2.getCode())*/
        
        if(s1.getCode().hashCode() > s2.getCode().hashCode()){
            return -1;
        } else if (s1.getCode().hashCode() < s2.getCode().hashCode()){
            return 1;
        }
        return 0;
    }
}
public class Week7_PriorityQueue {
   
    public static void main(String[] args) {
        //Random ran = new Random();
        
        /*Queue<Integer> q = new PriorityQueue<>();
         q.add(3);
         q.add(2);
         q.add(1);
         System.out.println(q); //[1, 3, 2]
         
         System.out.println(q.element()); // 1 is frist element
         q.remove(); // deque
         System.out.println(q); // [2, 3]*/
        
        /*Queue<String> q = new PriorityQueue<>();
        q.add("Silpakorn");
        q.add("University");
        q.add("Nakorn-pathom");
        System.out.println(q); // [Nakorn-pathom, University, Silpakorn]
        
        System.out.println(q.element()); // Nakorn-pathom
        q.remove(); // deque
        System.out.println(q); // [Silpakorn, University]*/
        
        /*Queue<String> q = new PriorityQueue<>(Collections.reverseOrder());
        q.add("Silpakorn");
        q.add("University");
        q.add("Nakorn-pathom");
        System.out.println(q); // [University, Silpakorn, Nakorn-pathom]
        System.out.println(q.element()); // University
        q.remove(); // deque
        System.out.println(q); // [Silpakorn, Nakorn-pathom]*/
        
        
        /*Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        Integer[] x = new Integer[10];
        // int x = ran.nextInt(10);
        for (int i=0 ; i<x.length ;i++){
            x[i] = ran.nextInt(100);
            q.add(x[i]);
        }
        System.out.println("Arrays : " + Arrays.toString(x)); // Arrays : [67, 51, 56, 69, 62, 95, 19, 97, 58, 52]
        System.out.println("Queue : " + q ); // Queue : [97, 95, 69, 67, 62, 56, 19, 51, 58, 52]
        
        System.out.println("front : " + q.element()); // front : 97
        System.out.println("remove : " + q.remove()); // remove : 97
        System.out.println("After remove : " + q ); // After remove : [95, 67, 69, 58, 62, 56, 19, 51, 52]*/
        
        /*Queue<Integer> q = new PriorityQueue<>();
        Integer[] x = new Integer[10];
        // int x = ran.nextInt(10);
        for (int i=0 ; i<x.length ;i++){
            x[i] = ran.nextInt(100);
            q.add(x[i]);
        }
        System.out.println("Arrays : " + Arrays.toString(x)); // Arrays : [42, 82, 57, 24, 72, 30, 96, 10, 68, 54]
        System.out.println("Queue : " + q ); // Queue : [10, 24, 30, 42, 54, 57, 96, 82, 68, 72]
        
        System.out.println("front : " + q.element()); // front : 10
        System.out.println("remove : " + q.remove()); // remove : 10
        System.out.println("After remove : " + q ); // After remove : [24, 42, 30, 68, 54, 57, 96, 82, 72]*/
        
        /********** sort by  qpa******/
        /*
        Queue<Student> q = new PriorityQueue<>(new StudentComparator());
        q.add(new Student("001","A",2.57)); 
        q.add(new Student("002","B",3.50));
        q.add(new Student("003","C",4.00));
        System.out.println(q); // [003-C-4.0, 001-A-2.57, 002-B-3.5]
        System.out.println("remove : " + q.remove()); // remove : 003-C-4.0
        System.out.println("after remove : " + q); // after remove : [002-B-3.5, 001-A-2.57]
        */
        
        /******** sort by String code***********/
        Queue<Student> q = new PriorityQueue<>(new StudentComparator());
        q.add(new Student("001","A",2.57)); 
        q.add(new Student("002","B",3.50));
        q.add(new Student("003","C",4.00));
        System.out.println(q); // [003-C-4.0, 001-A-2.57, 002-B-3.5]
        System.out.println("remove : " + q.remove()); // remove : 003-C-4.0
        System.out.println("after remove : " + q); // after remove : [002-B-3.5, 001-A-2.57]
        
        
        
    
    }
    
}
