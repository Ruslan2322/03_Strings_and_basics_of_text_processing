package Lesson_03_Stringbuilder;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Ex_5 {

    public static void main (String[] args){

        String str = "air space epam war solar";
        int index = 0;
        int count = 0;
        while (str.indexOf('a', index) != -1){
            index = str.indexOf("a", index) + 1;
            count++;
        }
        System.out.println("Quantity of 'a' symbols = " + count);
    }
}