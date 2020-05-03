package Lesson_03_Stringbuilder;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
// длинных слов может быть несколько, не обрабатывать.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_8 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] str_arr = str.split(" ");
        String R = "";
        for (int i = 0; i < str_arr.length; i++) {
            if(R.length()< str_arr[i].length()){
                R = str_arr[i];
            }
        }
        System.out.println(R);
    }
}