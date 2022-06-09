package com.company;




class Base{
        int x;

        public int getX() {
                return x;
        }

        public void setX(int x) {
                System.out.println("I am in base and Setting x now");
                this.x = x;
        }

        public void PrintMe(){
                System.out.println("I am a constructor");

        }


        }
        class Derieved extends Base{
        int y;


                public int getY() {
                        return y;
                }

                public void setY(int y) {
                        this.y = y;
                }
        }
public class CWH_25_Inheritance{
        public static void main(String[] args) {
                Base b=new Base();
                b.setX(4);
                System.out.println(b.getX());
                Derieved d=new Derieved();
                d.setX(5);
                System.out.println(d.getX());

        }
}
