package Lesson_03_Strings_like_arrays;

// В строке найти количество цифр.

public class Ex_3 {

    public static void main(String[] args) {
        String str = "84545674hdgflkgd34585534-jgdff45435043580tdfjg";
        char[] arr_ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr_ch.length; i++) {
            if(arr_ch[i] >= '0' && arr_ch[i] <= '9'){
                count++;
            }
        }
        System.out.println("Quantity of digits = " + count);
    }
}