package Lesson_03_Stringbuilder;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
// буквы.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_9 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter text:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int upp = 0;
        int low = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > 'a' && str.charAt(i) < 'z'){
                low++;
            }
            if(str.charAt(i) > 'A' && str.charAt(i) < 'Z'){
                upp++;
            }
        }
        System.out.println("Верхний регистр = " + upp + "\nНижний регистр = " + low);
    }
}