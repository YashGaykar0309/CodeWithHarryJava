package com.company;

enum Day{Sunday,Monday,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

enum Color{RED("red"),GREEN("green"),Blue("blue"),ORANGE("orange");

    private String value;

    Color(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }


}

public class JA01_Enum {
    public static void main(String[] args) {
        Color c1= Color.RED;


        System.out.println("Red Enum name is "+c1.name());
        System.out.println("Red Enum value is "+c1.getValue());

        for (Color color:Color.values()){
            System.out.println("Enum Name is "+color.name());
            System.out.println("Enum value is "+color.getValue());
        }
    }

}
