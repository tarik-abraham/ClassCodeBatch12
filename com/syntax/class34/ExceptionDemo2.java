package com.syntax.class34;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        System.out.println("0");

        try{
           // System.out.println(10/0);
           /* String name=null;
            name.length();
            int [] arr=new int[-5];
            String [] strArr=new String[2];
            strArr[5]="Issues";*/
            throw new RuntimeException();

        }catch(ArithmeticException arithmeticException){
            System.out.println("1");
        }catch(NullPointerException nullPointerException){
            System.out.println("2");
        }catch(NegativeArraySizeException negativeArraySizeException){
            System.out.println("3");
        }catch(IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("4");
        }catch(Exception e){
            System.out.println("Oops, something went wrong");
        }
        System.out.println("6");
    }


}
