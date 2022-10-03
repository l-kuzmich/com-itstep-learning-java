package classwork._3_0808_Arrays;

/*Написать программу, проверяющую является ли одна строка анаграммой для другой строки (строка может состоять
из нескольких слов и символов пунктуации). Пробелы и пунктуация должны игнорироваться при анализе. Разница
в больших и маленьких буквах должна игнорироваться. Обе строки должны вводиться с клавиатуры. Программа должна
выводить Yes, если строки являются анаграммой, и No – иначе.
Пример анаграммы в стихах:
Строка 1 «Аз есмь строка, живу я, мерой остр».
Строка 2 «За семь морей ростка я вижу рост!»*/

import java.util.Scanner;

public class Task9 {

    private String[] stringToArrayOfString(String string) {
        String[] arrayOfString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrayOfString[i] = string.charAt(i) + "";
        }
        return arrayOfString;
    }

    private String deletingSpaceAndPunctuationSymbols (String string){
        string = string.replaceAll("[[\\s][.,?!;:—]]", "");
        return string;
    }

    private String isAnagram(String[] string1, String[] string2, String s1, String s2) {

        String isAnagram = "";
        for (int i = 0; i < string1.length; i++) {
            if (s1.split(string1[i]).length == s2.split(string2[i]).length) {
                isAnagram = "Yes";
            } else {
                isAnagram = "No";
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        Task9 obj = new Task9();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first string");
        String firstString = sc.nextLine();
        System.out.println("Input second string");
        String secondString = sc.nextLine();

        firstString = obj.deletingSpaceAndPunctuationSymbols(firstString);
        secondString = obj.deletingSpaceAndPunctuationSymbols(secondString);

        System.out.println(firstString + " " + secondString);

        String[] firstArrayOfString = obj.stringToArrayOfString(firstString);
        String[] secondArrayOfString = obj.stringToArrayOfString(secondString);

        System.out.println(obj.isAnagram(firstArrayOfString, secondArrayOfString, firstString, secondString));

    }
}
