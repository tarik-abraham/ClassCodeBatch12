package com.syntax.class19;

public class Panda {

    String name="Poe";
    String breed="Kung Fu";
    String color="Kick Ass";
    double height=2.2;
    int age=12;
    double weight=35.0;

    Panda(String pandaName,String pandaBreed,String pandaColor,double pandaHeight,
          int pandaAge, double pandaWeight){
        name=pandaName;
        breed=pandaBreed;
        color=pandaColor;
        height=pandaHeight;
        age=pandaAge;
        weight=pandaWeight;
    }
    Panda(String pandaName){
        name=pandaName;
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+height+" "+age+" "+weight);
    }

}
