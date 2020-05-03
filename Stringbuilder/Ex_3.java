package Lesson_03_Stringbuilder;

// Проверить, является ли заданное слово палиндромом

public class Ex_3 {
    public static void main (String[] args){
        String str1 = "Madam";
        String str2 = (new StringBuilder(str1).reverse()).toString();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("word is palindrome");
        }else{
            System.out.println("word is not palindrome");
        }
    }
}

