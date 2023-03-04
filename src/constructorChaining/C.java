package constructorChaining;

public class C extends B {
    C(){
        System.out.println("Constructor of C");
    }

    C(String a){
        super("Alok");
        System.out.println("Name is :" + a);
    }

    C(String a, String b){
        System.out.println("Pram cons : a and b");
    }
}
