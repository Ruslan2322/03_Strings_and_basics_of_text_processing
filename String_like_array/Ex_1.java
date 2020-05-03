package Lesson_03_Strings_like_arrays;
import java.util.Arrays;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Ex_1 {
    public static void main(String[] args) {
        char[] str = new char[]{'c', 'a', 'm', 'e', 'l', 'C', 'a', 's', 'e'};
        int count = 0;
        for (int i = 0; i < str.length - 1; i++) { // Поиск количества заглавных букв.
            if(str[i + 1] >= 'A' && str[i + 1] <= 'Z')
                count++;
        }
        char[] str2 = new char[str.length + count];
        for (int i = 0, j = 0; j < str2.length; j++, i++) {
            if(str[i] >= 'A' && str[i] <= 'Z'){
                str2[j] = '_';
                str2[j + 1] = Character.toLowerCase(str[i]);
                j++;
            } else{
                str2[j] = str[i];
            }
        }
        System.out.println(Arrays.toString(str2));
    }
}