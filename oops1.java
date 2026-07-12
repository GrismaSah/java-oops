import java.util.*;
// basics java oops concepts

// class students{
//     String name;
//     int roll_no;
//     String address;
// }
// public class oops1{
//     public static void main(String[] args){
//         students s1 = new students();
//     s1.name = "Grisma";
//     s1.roll_no = 12;
//     s1.address = "bangalore";
//     System.out.println(s1.roll_no);
//     // s1.name = "rahul";
//     System.out.println(s1.name);
    
//     students s2 = new students();
//     s2.name = "Grisma";   
//     System.out.println(s2.name); 
//     }
// }

// java class methods..
class Dog{
    String breed;
    String color;
    String name;

    public void eat(){
        System.out.println(name + " is eating now");
    }
}

public class oops1{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "jackey";
        dog1.eat();
    }
}