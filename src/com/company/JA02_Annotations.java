/*
Java Annotation is a tag that represents the metadata
i.e. attached with class, interface, methods or fields to indicate
some additional information which can be used by java compiler and JVM.
*/


package com.company;

import java.lang.reflect.Method;


public class JA02_Annotations {
    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println(" Hello My Custom Annotation");
    }

    public static void main(String[] args)throws Exception {
        JA02_Annotations a=new JA02_Annotations();
        Method methodVal=a.getClass().getMethod("sayHello");

        MyCustomAnnotation mca=methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is "+mca.value());
//        System.out.println(methodVal);




    }
}
