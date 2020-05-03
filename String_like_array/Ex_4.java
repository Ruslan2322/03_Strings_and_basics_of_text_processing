package Lesson_03_Strings_like_arrays;

 // В строке найти количество чисел.

public class Ex_4 {

    public static void main(String[] args) {

        String str = "344465fdnkj34hgd547548rfdsh454gd95834544dfu85345r3htfd7er583hj7tdfg3423rhfdrt34rfdrhf83";
        char[] arr_ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr_ch.length; i++) {
            int num = 0;
            while(i != arr_ch.length && arr_ch[i] >= '0' && arr_ch[i] <= '9'){
                num++;
                i++;
            }
            if(num > 0){
                count++;
            }
        }
        System.out.println("Quantity of digits = " + count); // Вывод результата
    }
}