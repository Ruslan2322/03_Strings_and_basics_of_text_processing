package Lesson_03_Pattern_Macher;

// Дана строка, содержащая следующий текст (xml-документ):
//
// <notes>
//   <note id = "1">
//       <to>Вася</to>
//       <from>Света</from>
//       <heading>Напоминание</heading>
//       <body>Позвони мне завтра!</body>
//   </note>
//   <note id = "2">
//       <to>Петя</to>
//       <from>Маша</from>
//       <heading>Важное напоминание</heading>
//       <body/>
//   </note>
// </notes>

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_2 {

    public static void main(String[] args) {

        String str = "<notes>\n" + // Входящая строка
                " <note id = \"1\">\n" +
                "  <to>Вася</to>\n" +
                "  <from>Света</from>\n" +
                "  <heading>Напоминание</heading>\n" +
                "  <body>Позвони мне завтра!</body>\n" +
                " </note>\n" +
                " <note id = \"2\">\n" +
                "  <to>Петя</to>\n" +
                "  <from>Маша</from>\n" +
                "  <heading>Важное напоминание</heading>\n" +
                "  <body/>\n" +
                " </note>\n" +
                "</notes>";
        Pattern pattern = Pattern.compile("</?.+?>"); // Регулярное выражение
        Matcher matcher = pattern.matcher(str);
        boolean flagOpen = true; // Проверка какой тег открытый или закрытый.
        boolean flagClose = true;
        int tegEnd = 0, tegStart = 0; // Начала и конец для считывания содержимого тега
        while (matcher.find()) {
            String temp = str.substring(matcher.start()+1, matcher.start()+2); // Проверка на то какой символ идет после '<'.
            String tempEmpty = str.substring(matcher.end()-2, matcher.end()-1); // Проверка на то какой символ идет перед '>'.
            String teg = str.substring(matcher.start(), matcher.end()); // Название тега.
            if(!temp.equals("/") && !tempEmpty.equals("/")) { // Проверка на то открывающийся тег, пустой или закрывающийся.
                System.out.println("Открывающийся тег: " + teg);
                flagOpen = false;
                tegStart = matcher.end();
            } else {
                if(tempEmpty.equals("/")) { // Проверка пустой тег или нет.
                    System.out.println("Тег без тела");
                } else {
                    flagClose = false;
                    tegEnd = matcher.start();
                    System.out.println("Закрывающийся тег: " + teg);
                }
            }
            if(!flagClose && !flagOpen) { // Условие чтобы выводить содержимое тега.
                if(tegStart < tegEnd) {
                    String tegContent = str.substring(tegStart, tegEnd);
                    flagOpen = true;
                    flagClose = true;
                    System.out.println("Содержимое тега: " + tegContent);
                }
            }
        }
    }
}