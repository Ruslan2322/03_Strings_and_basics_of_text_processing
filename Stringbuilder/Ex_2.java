package Lesson_03_Stringbuilder;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Ex_2 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("air space epam war solar");

        int index = 0;
        System.out.println("Previos string");
        System.out.println("air space epam war solar");
        while (str.indexOf("a", index) != -1){
            index = str.indexOf("a", index) + 1;
            str.insert(index, "b");
        }
        System.out.println("New string");
        System.out.println(str);
    }
}