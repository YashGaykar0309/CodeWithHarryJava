package com.company;

public class CWH_17_multi_array {
        public static void main(String[] args) {
            int [][] marks;
            marks=new int[2][3];
            marks[0][0]=101;
            marks[0][1]=102;
            marks[0][2]=103;

            marks[1][0]=104;
            marks[1][1]=105;
            marks[1][2]=106;

            for (int i=0;i<marks.length;i++){
                for (int j=0;j<marks[i].length;i++){
                    System.out.print(marks[i][j]);
                }
                System.out.println("");

            }





        }



}
