package com.company;
import java.util.Scanner;
import java.util.Random;

class  Game {
    public int number;
    public int noOfGuesses;
    public int inputNumber;
    int num;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void Game() {
        Random r = new Random();
        num = r.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice Between 0 to 100");
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNo() {
        if (num == inputNumber) {
            return true;
        } else if (num < inputNumber) {
            System.out.println("required no is smaller");
        } else if (num > inputNumber){
            System.out.println("required no is larger");
        }
        return false;
    }
}




public class CWH_PRoblem4_findingNo {
    public static void main(String[] args) {
//        Random random=new Random() ;
//        int reqNo=random.nextInt(101);
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter Your Choice Between 0 to 100");
//
//
//        for (int i=8;i>0;i--){
//            int userNo =sc.nextInt();
//            if(userNo>reqNo){
//                System.out.println("Required No is Smaller "+(i-1)+" Chances Left");
//            }
//            else if(userNo<reqNo){
//                System.out.println("Required No is Larger "+(i-1)+" Chances Left");
//            }else{
//                System.out.println("Congratulations! You found the Required No with "+(i-1)+" Chances left");
//
//            }
//        }System.out.println("Required No was "+reqNo);










        Game g=new Game();
    }

}
