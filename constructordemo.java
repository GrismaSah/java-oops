import java.util.*;

class Students{
    int id;
    int age;

    Students(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("parameterized constructor");
    }
    Students(){
        System.out.println("Default");
    }
    Students(int id,  String name, int age){
        System.out.println("parameterized constructor 2");
    }

    
}


public class constructordemo {
    public static void main(String[] args){
        Students obj = new Students(5, 21);
        Students obj1 = new Students(5,  "Grizzy", 21);
        Students obj2 = new Students();
    }
}
