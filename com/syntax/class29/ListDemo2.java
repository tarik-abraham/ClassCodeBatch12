package com.syntax.class29;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("TestNG");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interviews");
        courses.add("Resume Prep");
        courses.add("AWS");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");

        System.out.println(courses);
        courses.set(courses.size()-1,"Happy"); // replace
        System.out.println(courses);


    }
}
