package overloading;

public class A {
    void doSomething(){
        System.out.println("Do something without params");
    }

    String doSomething(String a){
       return "";
    }

//    String doSomething(){
//        System.out.println("Do something without params");
//        return "";
//    }
}
