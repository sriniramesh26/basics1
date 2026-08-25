
//
class Grandfather{
    void retaire(){
        System.out.println("Grandfather is retaire");
        System.out.println();
    }
    Grandfather(){
        System.out.println("Grandfather is occupy the land");
        System.out.println();
    }
}
class Father extends Grandfather{
    void  work(){
        System.out.println("Fater is work");
        System.out.println();
    }
    Father(){
        System.out.println("Father is make the house");
        System.out.println();
    }
}

class Son extends Grandfather{
    void study(){
        System.out.println("Son is study");
        System.out.println();
    }
    Son(){
        System.out.println("son is now staying in the house");
        System.out.println();
    }

}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.study();
        s.retaire();
        Father f = new Father();
        f.work();


    }
}
