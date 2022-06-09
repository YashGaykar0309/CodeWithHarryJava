package com.company;

public class CWH_49_FinallyBlock {
    public static int greet(){
        int a=66;
        int b=6;

        try{
            int c=a/b;
            return c;

        }
        catch (Exception e){
            System.out.println(e);

        }
        finally {
            System.out.println("You are in Finally Block.");
        }
        return -1;




    }

    public static void main(String[] args) {
        System.out.println( greet());
        int a=99;
        int b=3;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("You are in Finally Block 2 with value of b::"+b);
            }
            b--;

        }
        try{
            System.out.println(50.0f/0.0f);
        }
        finally {
            System.out.println("End of Program");
        }
    }
}
