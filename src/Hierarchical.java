
class Vehicle{
    void start(){            /* SuperClass or ParentClass */
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle{
    void drive(){            /* SubClass1 or ChildClass1 */
        System.out.println("Car  is driving");
    }
}
class Bike extends Vehicle{
    void ride(){             /*S ubClass2 or ChildClass2 */
        System.out.println("Bike is driving");
    }
}

public class Hierarchical { //MAIN CLASS
    public static void main(String[] args) {
        Car c = new Car(); //OBJECT CREATION OF CAR CLASS
        Bike b = new Bike(); //OBJECT CREATION OF BIKE CLASS
        c.start();    //calling start method
        c.drive();    //calling drive method

        b.start();    //calling start method
        b.ride();     //calling ride method
    }
}
