class Grandmother {
    String land;

    Grandmother(String land) {
        this.land = land;
        System.out.println("Grandfather constructor");
    }
}

class Mother extends Grandmother {
    String job;

    Mother(String land, String job) {
        super(land);                   /*calls Grandmother constructor*/
        this.job = job;
        System.out.println("Father constructor");
    }
}

class Doughter extends Mother {
    String college;

    Doughter(String land, String job, String college) {
        super(land, job);        /* Called Mother constructorar */
        this. college = college;
        System.out.println("Son constructor");
    }

    void display() {
        System.out.println("Land: " + land);
        System.out.println("Job: " + job);
        System.out.println("College: " + college);
    }
}
/*
woring of code

   Grandfather
     ↑
   super()
     ↑
   Father
     ↑
   super()
     ↑
    Son
 */

public class Multilevel {
    public static void main(String[] args) {

        Doughter d = new Doughter("5 Acres", "Engineer", "Kongu Engineering College");

        d.display();
    }
}