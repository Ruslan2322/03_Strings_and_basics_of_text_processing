package Lesson_03_Pattern_Macher;

// Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом  три  различных
// операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
// алфавиту.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1 {

    public static void SortParagraph(String str) {

        String[] arrstr = str.split("\\t");
        for (int i = 0; i < arrstr.length; i++) {
            for (int j = 0; j < arrstr.length - 1; j++) {
                if (arrstr[j].split("([.!?]+)").length > arrstr[j + 1].split("([.!?]+)").length) {
                    String temp = arrstr[j];
                    arrstr[j] = arrstr[j + 1];
                    arrstr[j + 1] = temp;
                }
            }
        }
        Sys_print(arrstr);
        System.out.println();
    }
    public static void Sys_print(String[] str) {
        int count = 1;
        for (String str1 : str) {
            if (!str1.equals("")) {
                if (count == str.length) {
                    System.out.print(str1);
                    System.out.println();
                } else {
                    System.out.print(str1 + " ");
                }
            }
            count++;
        }
    }

    public static void Sort_Sentence(String str) {
        String[] arrstr = str.split("([.!?]+)");
        for (int i = 0; i < arrstr.length; i++) {
            String[] arr = arrstr[i].split("\\W");
            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j].length() > arr[j + 1].length()) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            Sys_print(arr);
        }
    }

    public static int Count_Literal(String str, char lit) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lit) {
                count++;
            }
        }
        return count;
    }

    public static void Sort_Literal(String str, char lit) {
        if (str.indexOf(lit) != -1) {
            String[] arrstr = str.split("([.!?]+)");
            for (int i = 0; i < arrstr.length; i++) {
                String[] arr = arrstr[i].split("\\W");
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k].indexOf(lit) == -1) {
                        arr[k] = arr[k].replaceAll(".", "");
                    }
                }
                for (int k = 0; k < arr.length; k++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (Count_Literal(arr[j], lit) > Count_Literal(arr[j + 1], lit)) {
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                for (int k = 0; k < arr.length; k++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (Count_Literal(arr[j], lit) == Count_Literal(arr[j + 1], lit) && arr[j].compareTo(arr[j + 1]) > 0) {
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                Sys_print(arr);
            }
        } else {
            System.out.println("Wrong enter");
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "\tHere you can find activities to practise your reading skills. \n Reading will help you to improve your understanding of the language and build your vocabulary.\nThe self-study lessons in this section are written and organised according to the levels of the Common European Framework of Reference for languages (CEFR).  \nThere are different types of texts and interactive exercises that practise the reading skills you need to do well in your studies, to get ahead at work and to communicate in English in your free time." +
                "\tMy name is Clark, and I will tell you about my city.\nI live in an apartment.\nIn my city, there is a post office where people mail letters. \nOn Monday, I go to work. I work at the post office.\nEveryone shops for food at the grocery store." +
                "\tDoctor Klein: Good morning, Cecilia, how are you feeling today? \nCecilia: I do not feel very well, Doctor Klein. I hope that you can treat my illness.\nDoctor Klein: I’m sorry that you feel very sick. Tell me some of your symptoms so that I can give you a proper diagnosis." +
                "\tLucas goes to school every day of the week. \nHe has many subjects to go to each school day: English, art, science, mathematics, gym, and history. His mother packs a big backpack full of books and lunch for Lucas.";
        boolean flag = true;
        while (flag) {
            System.out.print("Your choice" + "\n1). Sort paragraphs by number of sentences;" +
                    "\n2). In each sentence, sort words by length;" + "\n3). Sort lexemes in a sentence in descending order " +
                    "occurrences of a given symbol, and in case of equality - alphabetically." +
                    "\n4). Exit .\n");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Make a choice:");

            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    SortParagraph(str);
                    break;
                case 2:
                    Sort_Sentence(str);
                    break;
                case 3:
                    System.out.println("Введите символ");
                    char literal = (char) reader.read();
                    Sort_Literal(str, literal);
                    break;
                case 4:
                    System.out.println("Завершение программы.");
                    flag = false;
                    reader.close();
                    break;
            }
        }
    }
}