package Lesson_03_Stringbuilder;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
// def", то должно быть выведено "abcdef".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_7 {

    public static void main(String[] args) throws IOException {

        System.out.println("Entered text :");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(reader.readLine());

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(j - 1) == ' '){
                    str.deleteCharAt(j - 1);

                } else {
                    if(str.charAt(i) == str.charAt(j)){
                        str.deleteCharAt(j);
                        j--;
                    }
                }
            }
        }
        System.out.println(str.toString());
        reader.close();
    }
}