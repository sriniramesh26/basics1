class Vehicles{     // Parent Class
    void start(){
        System.out.println("Vehicle is Started");
    }
}

      // Single Inheritance
class Truck extends Vehicles{     // Child1 class
    void drive(){
        System.out.println("Truck is Driving");
    }
}

interface Electric{          // Child2 class
    void charge();
}

    //Multilevel Inheritance
class ElectricTruck extends Truck implements Electric{
    public void charge(){
        System.out.println("Electric  Truck is Charging");
    }
}



public class Hybrid {
    public static void main(String[] args) {
        ElectricTruck t = new ElectricTruck(); // object is create the ElectricTruck class
        t.start();   //Call Vehicle Method
        t.drive();   //Cal Truck Method
        t.charge();  //Call ElectricTruck Method
    }
}
