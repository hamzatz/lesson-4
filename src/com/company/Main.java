package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"Павел", "Саша", "Иван"};
        for (String name:names) {
            switch (name) {
                case "Павел":
                    System.out.println(name + " доброе утро");
                    break;
                case "Саша":
                    System.out.println(name + " добрый день");
                    break;
                case "Иван":
                    System.out.println(name + " добрый вечер");
                    break;
           }
        }
        /*for (int i = 0; i <names.length ; i++) {

                    switch (i) {
                case 0:
                    System.out.println(names[i] + " доброе утро");
                    break;
                case 1:
                    System.out.println(names[i] + " добрый день");
                    break;
                case 2:
                    System.out.println(names[i] + " добрый вечер");
                    break;
            }
        }*/

    }
}