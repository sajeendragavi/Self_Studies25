package org.example;

class A extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){}


        }

    }
}

class B extends Thread{
    public void run(){
        for(int j =0; j<100; j++){
            System.out.println("Welcome");
            try{
                Thread.sleep(500);
            }catch(Exception e){}

        }

    }
}

public class Practice {
    public static void main(String args []){
        A obj1 = new A();
        obj1.start();
        try{
            Thread.sleep(50);
        }catch(Exception e){}
        B obj2 = new B();
        obj2.start();
    }

}


//package org.example;
//
//class A{
//    public void say(){
//        for(int i = 0; i<10; i++){
//            System.out.println("Hello");
//        }
//
//    }
//}
//
//class B{
//    public void say(){
//        for(int j =0; j<10; j++){
//            System.out.println("Welcome");
//        }
//
//    }
//}
//
//public class Practice {
//    public static void main(String args []){
//        A obj1 = new A();
//        obj1.say();
//        B obj2 = new B();
//        obj2.say();
//    }
//
//}
//
//
//
