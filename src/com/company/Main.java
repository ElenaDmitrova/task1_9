package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("f");
        list.add("s");
        list.add("q");

        ArrayList<String> list001 = new ArrayList<String>();
        list001.add("a");
        list001.add("c");
        list001.add("p");
        list001.add("l");
        list001.add("j");

        compareTwoLists(list, list001);
        compareFirstLists(list, list001);
        compareSecondLists(list, list001);
    }

    public static void compareTwoLists(ArrayList<String> list, ArrayList<String> list001){

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list001.size(); j++){
                if(list.get(i).equals(list001.get(j)) == true){
                    System.out.println(list.get(i));
                }
            }
        }
    }

    public static void compareFirstLists(ArrayList<String> list, ArrayList<String> list001){
        ArrayList<String> b = (ArrayList<String>)list.clone();
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list001.size(); j++){
                if(list.get(i).equals(list001.get(j)) == true){
                    b.remove(i);
                }
            }
        }System.out.println(b);
    }

    public static void compareSecondLists(ArrayList<String> list, ArrayList<String> list001){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list001.size(); j++){
                if(list.get(i).equals(list001.get(j)) == true){
                    list001.remove(i);
                }
            }
        }System.out.println(list001);
    }
}