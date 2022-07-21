package Module3;

import java.util.Scanner;

public class Task5 {
    static void zodiak(int d, int m){
        if ((m == 1) && (d <= 20) || (m == 12) && (d >= 23)){
            System.out.println("Your zodiak sign is Capricorn (Козерог)");
        } else if ((m == 1) && (d >= 21) || (m == 2) && (d <= 19)){
            System.out.println("Your zodiak sign is Aquarius (Водолей)");
        } else if ((m == 2) && (d >= 20) || (m == 3) && (d <= 20)){
            System.out.println("Your zodiak sign is Pisces (Рыбы)");
        } else if ((m == 3) && (d >= 21) || (m == 4) && (d <= 20)){
            System.out.println("Your zodiak sign is Aries (Овен)");
        } else if ((m == 4) && (d >= 21) || (m == 5) && (d <= 21)){
            System.out.println("Your zodiak sign is Taurus (Телец)");
        } else if ((m == 5) && (d >= 22) || (m == 6) && (d <= 21)){
            System.out.println("Your zodiak sign is Gemini (Близнецы)");
        } else if ((m == 6) && (d >= 22) || (m == 7) && (d <= 22)){
            System.out.println("Your zodiak sign is Cancer (Рак)");
        } else if ((m == 7) && (d >= 23) || (m == 8) && (d <= 23)){
            System.out.println("Your zodiak sign is Leo (Лев)");
        } else if ((m == 8) && (d >= 24) || (m == 9) && (d <= 23)){
            System.out.println("Your zodiak sign is Virgo (Дева)");
        } else if ((m == 9) && (d >= 24) || (m == 10) && (d <= 23)){
            System.out.println("Your zodiak sign is Libra (Весы)");
        } else if ((m == 10) && (d >= 24) || (m == 11) && (d <= 22)){
            System.out.println("Your zodiak sign is Scorpio (Скорпион)");
        } else if ((m == 11) && (d >= 23) || (m == 12) && (d <= 22)){
            System.out.println("Your zodiak sign is Sagittarius (Стрелец)");
        }
    }

    static void animalYear(int y){
        String result = "";
        int a = y % 12;
        switch (a){
            case 0 : result += "Monkey (Обезьяна)";
                break;
            case 1: result += "Rooster (Петух)";
                break;
            case 2: result += "Dog (Собака)";
                break;
            case 3: result += "Pig (Свинья)";
                break;
            case 4: result += "Rat (Крыса)";
                break;
            case 5: result += "Ox (Бык)";
                break;
            case 6: result += "Tiger (Тигр)";
                break;
            case 7: result += "Rabbit (Заяц)";
                break;
            case 8: result += "Dragon (Дракон)";
                break;
            case 9: result += "Snake (Змея)";
                break;
            case 10: result += "лошадь";
                break;
            case 11: result += "овца";
                break;
        }
        System.out.println("Your year of birth according to the Eastern calendar is " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birthdate");
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (day > 0 && day <= 31) {
            if (month > 0 && month <= 12) {
                if (year > 1922 && year < 2023) {
                    {
                        System.out.println("Your birthdate is: " + day + "." + month + "." + year);
                        zodiak(day, month);
                        animalYear(year);
                    }
                } else {
                    System.out.println("Error the year input");
                }
            } else {
                System.out.println("Error the month input");
            }
        } else {
            System.out.println("Error the day input");
        }
    }
}
