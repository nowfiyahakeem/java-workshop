package com.java.temperature.bean;

public class Upper {
    public static void main(String[] args) {


        String firstName  = "NOWFIYA";
        String lastName = "HAKEERM";
        String fullName = firstName .concat(lastName);

        String upperCase = fullName.toUpperCase();
        System.out.println((" The upper case of  my name is :" + upperCase));



        String sentence = "hi this is nowfiya here currently pursuing my ug degree in vetias ";
        String[] words = sentence.split("  ");
        System.out.println(words.length);

        for (String word : words) {
            System.out.println(word);
        }

    }
    
}
