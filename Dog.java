
package twst;

import java.util.Arrays;
import java.util.Comparator;

//1. Create a class named Dog with the fields: name, breed, and age.
class Dog {
    private String name;
    private String breed;
    private int age;
    
    public Dog(String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    // 3-5
    @Override
    public String toString(){
        return "name=" + name + ", breed='" + breed + "', age= " + age;
    }
    
    public static void main(String[] args) {
        
        //2. Create 5 objects from the Dog class and store them in an array named myDogs.
        Dog[] myDogs = new Dog[5];
        myDogs[0] = new Dog("A","Golden Retriever",3);
        myDogs[1] = new Dog("B","Beagle",2);
        myDogs[2] = new Dog("C","Poodle",1 );
        myDogs[3] = new Dog("Lucy", "Poodle", 1);
        myDogs[4] = new Dog("Rocky", "German Shepherd", 5);
        
        //3. Display all the data in the myDogs array using the method Arrays.toString()
        System.out.println(Arrays.toString(myDogs));
        
        //4. Copy 3 elements from the myDogs array into a new array named yourDogs.
        Dog[] yourDogs = Arrays.copyOf(myDogs,3);
        
        System.out.println("is copyOf method ");
        
        //5. Display all the data in the yourDogs array using the method Arrays.toString()
        System.out.println(Arrays.toString(yourDogs));
        
        System.out.println("is Sort method ");
        
        //6. Sort the data in the yourDogs array in ascending order.
        Arrays.sort(yourDogs, Comparator.comparingInt(dog -> dog.age));
        
        //7. Display all the data in the yourDogs array using the method Arrays.toString().
        System.out.println(Arrays.toString(yourDogs));
        
    }
}

