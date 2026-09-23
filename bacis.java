class Pen {
    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.color); // here this keyword tell which object has called this function..,
    }

    Pen() {
        System.out.println("constuctor called");
    }
}

public class bacis {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue"; // to call the properties - use dot
        pen1.type = "gel";
        pen1.write(); // to call methods - use dot and function/method
        pen1.printcolor();
        
        Pen pen2 = new Pen(); // new keyword - create allocates space in the memory heap
        // Pen() --- constuctor.. - construct java object
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen2.printcolor();
    }
}
