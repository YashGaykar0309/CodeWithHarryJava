package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class JA03_SERIAL_Implementation {
    public static void main(String[] args) {
        JA03_Serializaion Student = new JA03_Serializaion("Yash", 20, "Rumbhodi");

        String filename = "F:\\java-tutorials\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

// Serialization
//        try {
//            fileOut = new FileOutputStream(filename);
//            objOut new ObjectOutputStream(fileOut);
//            objOut.writeObject(student);
//
//            objOut.close();
//            fileOut.close();
//
//            System.out.println("Object has been serialized: \n" + student);
//        } catch (IOException ex) {
//            System.out.println("IOException is caught");
//        }
//
//    //Deserialization
//    FileInputStream fileIn = null;
//    ObjectInputStream objIn null;
//    try (
//            fileIn = new FileInputStream(filename);
//            objIn new ObjectInputStream(fileIn);
//
//            Student object (Student) objIn.readObject();
//
//            System.out.println("Object has been deserialized: \n" object);
//
//            objIn.close();
//
//}
    }
}
