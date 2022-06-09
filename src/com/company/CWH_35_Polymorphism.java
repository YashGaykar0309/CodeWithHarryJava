package com.company;

interface Camera2{
    void takesnap2();
    void recordVideo2();
    private void greet2(){
        System.out.println("Good Morning");
    }
    default void record4Kvideo2(){
        greet2();
        System.out.println("Recording 4K Video ");
    }

}

interface Wifi2{
    void connectToNetwork2(String network);

    String[] getNetworks2();

}


class MyCellPhone2{
    void callNumber2(int  number){
        System.out.println("Calling "+ number);
    }
    void pickNumber2(){
        System.out.println("Connecting......");
    }
}
class SmartPhone2 extends MyCellPhone2 implements Wifi2,Camera2 {
    public void takesnap2() {
        System.out.println("Taking Snap");
    }

    public void recordVideo2() {
        System.out.println("Recording Video");
    }

    public String[] getNetworks2() {
        System.out.println("Getting List of Networks");
        String[] netWorklist2 = {"Harry", "Prashant", "Rahul"};
        return netWorklist2;
    }
    public void connectToNetwork2(String network){
        System.out.println("Connecting..."+network);
    }
    public  void sampleMeth(){
        System.out.println("Meth");
    }
}


public class CWH_35_Polymorphism {
    public static void main(String[] args) {
//        Camera2 cam1= new SmartPhone2();
////        cam1.sampleMeth();------>Method in Class not allowed
////        cam1.getNetworks();------>Method in Other Interface not allowed
//        cam1.record4Kvideo2();


        SmartPhone2 s1=new SmartPhone2();
        s1.callNumber2(3660);



    }
}
