package classwork.Pr0808;

/*Пользователь вводит с клавиатуры любую строку. Поменять в исходной строке все большие буквы на
маленькие, а маленькие – на большие. Если в строке присутствуют цифры, заменить на символ подчеркивания и
вывести результат на консоль.*/

import java.util.Scanner;

public class Task7 {

    private String [] stringToArrayOfString (String string){
        String[] arrayOfString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
           arrayOfString[i] = string.charAt(i) + "";
        }
        return arrayOfString;
    }

    private String[] changedString (String[] arrayOfString, String string){
        for (int i = 0; i < arrayOfString.length; i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90){ //Upper
                arrayOfString[i] = arrayOfString[i].toLowerCase();
            }
            else if (string.charAt(i) >= 97 && string.charAt(i) <= 122){ //Lower
                arrayOfString[i] = arrayOfString[i].toUpperCase();
            }
            else if (string.charAt(i) >= 48 && string.charAt(i) <= 57){
                arrayOfString[i] = "_";
            } else {
                arrayOfString[i] = arrayOfString[i];
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
        Task7 obj = new Task7();
        System.out.println("Input string");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] arrayOfString = obj.stringToArrayOfString(string);
        arrayOfString = obj.changedString(arrayOfString,string);
        obj.displayArrayOfString(arrayOfString);


    }
}
