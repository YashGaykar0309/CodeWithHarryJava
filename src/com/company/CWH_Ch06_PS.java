package com.company;

public class CWH_Ch06_PS {
    public static void main(String[] args) {


        /*System.out.println("practice problem 1\n");
        float []array={33.3f,44.f,55.5f,66.6f,77.7f};
        float sum=0;
        for (float element:array)
        {
            sum=sum+ element;
        }
        System.out.println(sum);*/


        /*System.out.println("practice problem 2\n");
        float []array={33.3f,44.f,55.5f,66.6f,77.7f};
        float num =55.5f;
        boolean present=true;
        for (float element:array)
        {
            if (num==element){
                present=true;
                break;
            }


        }
        if( present ){
            System.out.println(" present in array");
        }
        else{
            System.out.println("not present in array");
        }*/


        /*System.out.println("practice problem 3");


        float []array={33.3f,44.f,55.5f,66.6f,77.7f};
        float sum=0;
        for (float element:array)
        {
            sum=sum+ element;
        }
        System.out.println("sum = "+sum);
        System.out.println("average marks of all students = "+ sum/array.length);*/


        /*System.out.println("practise problem 4");

        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{7,8,9},{10,11,12}};
        int [][] result={{0,0,0},{0,0,0}};

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
*/
        /*System.out.println("practice problem 5\n");
        int []array={1,2,3,4,5,6,7,8};
        int l=array.length;
        int a=Math.floorDiv(l,2);
        int temp;
        for (int i=0;i<a;i++){
            temp=array[i];
            array[i]=array[l-1-i];
            array[l-1-i]=temp;

        }
        for (int element:array){
            System.out.print (element+" ");
        }

*/
        /*System.out.println("problem no 6");
        int []array={22,26,83,94,45,66,37,28};
        int max=0;
        for (int e:array){
            if (e>max){
                max=e;
            }

        }
        System.out.println("the value of max element is "+max);



        System.out.println("problem no 7");

        int min=Integer.MAX_VALUE;
        for (int e:array){
            if (e<min){
                min=e;
            }

        }
        System.out.println("the value of minimum element is "+min);*/


        System.out.println("problem no 8");
        int []array={1,2,3,4,5,6,7,8};
        boolean isSorted=true;
        for (int i=0;i< array.length-1;i++)
        {
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }









    }
}
