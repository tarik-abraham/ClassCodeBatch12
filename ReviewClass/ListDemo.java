package ReviewClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            list.add("fajflkasjfklasflkajfka");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);





        ArrayList<String> arrayList=new ArrayList<>();
        long startTime1=System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            arrayList.add("fajflkasjfklasflkajfka");
        }

        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);

    }





}


