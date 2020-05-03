package Lesson_03_Strings_like_arrays;

// Замените в строке все вхождения 'word' на 'letter'.

public class Ex_2 {

    public static void main(String[] args) {

        String str = "word word hello word complete it word superman said his word. ";
        System.out.println(str.replace("word", "letter"));

    }
}