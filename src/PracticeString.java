public class PracticeString {

    public static void main(String[] args) {
String s1= " Pragra";
System.out.println(s1);
        System.out.println(s1.trim());
        int a = 10;
        String s= String.valueOf(a);
        System.out.println(s + s);


        char CharacterArr[] = s1.toCharArray();

        for (char s2:CharacterArr) {
            System.out.print(" " +s2 +" ");  // Reverse this Char Array ???f
        }
    }
}

