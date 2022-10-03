package classwork._3_0808_Arrays;

/*Вам требуется написать программу, которая преобразует переменную, записанную на одном языке, в формат другого
языка. Идентификатор (имя) переменной должен вводится с клавиатуры. Программа должна определить, из какого языка
взята переменная, и переделать ее в переменную другого языка. Вывести результат на консоль.
Examples: в Java могут выглядеть следующим образом: javaIdentifier, longAndMnemonicIdentifier, name, nEERC.
В языке C++ для описания переменных используются только маленькие латинские символы и символ «_»,
который отделяет непустые слова друг от друга. Если строка имеет смешанный синтаксис: например java_
Identifier, сообщить об этом. Примеры: java_identifier, long_and_mnemonic_identifier, name, n_e_e_r_c. */

import java.util.Scanner;

public class Task8 {

    boolean isJava;

    private String[] stringToArrayOfString(String string) {
        String[] arrayOfString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrayOfString[i] = string.charAt(i) + "";
        }
        return arrayOfString;
    }

    private boolean isIdentifiedOnJava(String string) {

        if (string.matches(".+[A-Z].+") && !string.contains("_")) { // its Java - contains upper letter
            isJava = true;
            System.out.println("Its Java");
        } else if (string.contains("_") && !string.matches(".+[A-Z].+")) { // its C++ - contains '_'
            isJava = false;
            System.out.println("Its C++");
        } else if (string.contains("_") && string.matches(".+[A-Z].+")) {
            System.out.println("Its not java or c++");
        }
        return isJava;
    }

    private String[] translateFromJavaToCPlusPlus (String[] arrayOfString, String string){

        if (isJava){
            for (int i = 0; i < arrayOfString.length; i++) {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90){
                    arrayOfString[i] = "_" + arrayOfString[i].toLowerCase();
                }
            }
        }
        else {
            for (int i = 0; i < arrayOfString.length; i++) {
                if (arrayOfString[i].equals("_")){
                    arrayOfString[i] = arrayOfString[i+1].toUpperCase();
                    arrayOfString[i+1] = "";
                }
            }
        }

        return arrayOfString;
    }

    private void displayArrayOfString (String[] arrayOfString){
        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.print(arrayOfString[i]);
        }
    }

    public static void main(String[] args) {
        Task8 obj = new Task8();
        System.out.println("Input string");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] arrayOfString = obj.stringToArrayOfString(string);
        obj.isJava = obj.isIdentifiedOnJava(string);
        arrayOfString = obj.translateFromJavaToCPlusPlus(arrayOfString, string);
        obj.displayArrayOfString(arrayOfString);
    }
}
