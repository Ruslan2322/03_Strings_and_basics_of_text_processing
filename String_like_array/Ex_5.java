package Lesson_03_Strings_like_arrays;

// Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить на  одиночные  пробелы.
// Крайние пробелы в строке удалить.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_5 {
    public static void main(String[] args) {

        System.out.println("Ведите строку с пробелами");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(replaceSpaces(strings));


        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    private static String replaceSpaces(String string){
        //Create an object
        StringBuilder strBuilder = new StringBuilder();
        // Truncate spaces from start and end
        String str = string.trim();
        //Determinate space is or not
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}

