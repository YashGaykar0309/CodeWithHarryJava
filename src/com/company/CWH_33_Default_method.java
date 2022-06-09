



package com.company;

interface Camera{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4Kvideo(){
        System.out.println("Recording 4K Video ");
    }

}

interface Wifi{
    void connectToNetwork(String network);

    String[] getNetworks();

}


class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling"+ number);
    }
    void pickNumber(){
        System.out.println("Connecting......");
    }
}
class SmartPhone extends MyCellPhone implements Wifi,Camera {
    public void takesnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] netWorklist = {"Harry", "Prashant", "Rahul"};
        return netWorklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting..."+network);
    }
}

public class CWH_33_Default_method {
    public static void main(String[] args) {
        SmartPhone s2=new SmartPhone();
        String[] st = s2.getNetworks();
        for (String item:st) {
            System.out.println(item);
        }
        s2.connectToNetwork("Rahul");
    }
}