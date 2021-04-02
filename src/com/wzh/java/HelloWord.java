package com.wzh.java;

import com.wzh.com.wzh.bean.Customer;

import java.util.ArrayList;

//单行注释
public class HelloWord{

    public static final Customer user = new Customer();

    public static final int n = 1;


    public static final String s = "s";

    public static void main(String[] args){

        System.out.println("hehehe");
        ArrayList list = new ArrayList();
        System.out.println("maybe");

        int num1 = 1;
        System.out.println("num1 = " + num1);

        String[] strings = new String[]{"Tom","Mike","James"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (String string : strings) {
            System.out.println("strings = " + string);
        }
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println("string = " + string);
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        if (list1 != null) {

        }

    }


    private void method(){
        String s = new String();
        if (s == null) {
            
        }
    };
    
    public void testenjoy(){
        String teststr = null;
        if (teststr != null) {
            System.out.println("teststr = " + teststr);
        }
    }
}
