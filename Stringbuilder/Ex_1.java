package Lesson_03_Stringbuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Ex_1{
    public static void main(String[] args) {
        
        String str = "        dadjghdf        fsdljfs d fjdsfls        fsfjs fsdflj      flsfjs           fds";
        int T = 0, count;
        for(int i = 0; i < str.toCharArray().length; i++){
            count = 0;
            while (str.toCharArray()[i] == ' '){
                count++;
                i++;
            }
            if(count > T){
                T = count;
            }
        }
        System.out.println("Maximum empty spaces = " + T);
    }
}