package Lesson_03_Stringbuilder;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter text:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] sentence = str.split("\\.|!|&");

        System.out.println(sentence.length);
    }
}
