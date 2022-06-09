package com.company;

public class CWH_Ch07_PS {

//    problem no 1

    static void multiplication(int x){
        for(int i=1;i<=10;i++){
            int m=i*x;
            System.out.println(x+" * "+i+" = "+ m);
        }
    }
//    problem no 2
    static  void pattern1(int y){
        for(int i=1;i<=y;i++){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    //          problem no 3
    static int sum(int z){
        int add=0;

        if (z==1){
            return 1;
        }
        else{
            return z+sum(z-1);
        }
    }

//       problem no 4
    static void pattern2(int w){
        for(int i=w;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//      problem no 5
    static int fib(int v){
        if(v==1||v==2)
            return v-1;
        else
            return fib(v-1)+fib(v-2);
    }


//    problem no 6
    static int avg(int ...args) {
        int totalno=0;
        int sum=0;
        for (int numbers:args){
            sum+=numbers;
            totalno++;

        }
        int average=sum/totalno;
        return average;

    }

//    Problem no 7
       static void pattern2rec(int w){
           if(w>0){
               for (int i=0;i<w;i++){
                   System.out.print("* ");

               }
               System.out.println();
               pattern2rec(w-1);
           }
}


//problem no 9
    static float df(float v){
        float far =(v*(1.8f))+32;
        return far;

    }







//problem no 8
    static void pattern1rec(int n) {
        if (n > 0) {
            pattern1rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }



    public static void main(String[] args) {
        System.out.println("problem no 1");
        multiplication(7);
        System.out.println("problem no 2");
        pattern1(6);
        System.out.println("problem no 3");
        System.out.println(sum(4));
        System.out.println("problem no 4");
        pattern2(4);
        System.out.println("problem no 5");
        System.out.println(fib(7));
        System.out.println("problem no 6");
        System.out.println(avg(66,88,99,88,66,99));
        System.out.println("problem no 7");
        pattern2rec(3);
        System.out.println("problem no 8");
        pattern1rec(3);
        System.out.println("problem no 9");
        System.out.println(df(6)+"F");
    }










}
