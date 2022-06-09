package com.company;

public class CWH_16_arrays {
    public static void main(String[] args) {
//        int[] array;
//        array = new int[5];
//        array[0]=11;
//        array[1]=12;
//        array[2]=13;
//        array[3]=14;
//        array[4]=15;
//
//        System.out.println(array[4]);
//
//
//        int[] array1 = new int[5];
//
//        array1[0]=11;
//        array1[1]=12;
//        array1[2]=13;
//        array1[3]=14;
//        array1[4]=15;
//
//        System.out.println(array1[2]);
//
//
//        int[] array2={1,2,3,4,5};
//        System.out.println(array2[2]);



        //Array operations


        //        String [] Students={"harry","yash","jay"};
        //        System.out.println(Students.length);

//       float []array={1.0f,2,3,4,5.1f};


        int [] array={1,2,3,4,5};
//        System.out.println(array[4]);
//        System.out.println(array.length);
        System.out.println("printing array by simple method : ");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);


        //Display using for loop

        System.out.println("printing array using for loop:");

        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }


        System.out.println("printing array using for loop in reverse order:");

        for (int i= array.length-1;i>=0;i--) {
            System.out.println(array[i]);
        }


        System.out.println("printing array using for each loop");
        for (int element :array){
        System.out.println(element);
        }












    }
}
