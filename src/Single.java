import java.security.DigestException;

class Animal{
    void run(){
        System.out.println("Dog is running");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating");
    }
}


public class Single {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Dog obj2 = new Dog();
        obj1.eat();
        obj2.eat();


    }
}
