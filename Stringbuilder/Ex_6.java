package Lesson_03_Stringbuilder;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Ex_6 {

    public static void main(String[] args) {

        StringBuilder str =new StringBuilder("air space epam war solar");
        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i < str.length()*2; i++) {
            str1.insert(i + 1, str1.charAt(i));
            i++;
        }
        System.out.println(str1.toString());
    }
}