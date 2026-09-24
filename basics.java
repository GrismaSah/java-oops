import java.util.*;

import bank.Bank; // or else - import bank.*; // from that bank package i am importing Bank class

class Pen {
    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.color); // here this keyword tell which object has called this function..,
    }

    Pen() { //non-parameterized constructor
        System.out.println("constuctor called");
    }

    Pen(String color, String type){
        this.color = color;
        this.type = type;
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class basics {
    public static void main(String args[]){
        // Student s1 = new Student("grisma", 21);
        // s1.printInfo();

        Bank myBank = new Bank();
        System.out.println("Bank object created successfully!");
    
    }  
}
