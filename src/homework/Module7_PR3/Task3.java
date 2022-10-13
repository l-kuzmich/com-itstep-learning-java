package homework.Module7_PR3;

/*1. Generate the output 4247 from the original StringBuilder
“0123456789” using all the methods from the list below:
- append;
- insert;
-delete;
-replace.
2. Repeat the same task for String data type. Find out which methods are not valid anymore.
Use: string of methods call.*/

public class Task3 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("0123456789");
        System.out.println("StringBuilder " + string);
        string.delete(0,2); //23456789
        string.append("4"); //234567894
        string.insert(0,string.charAt(8)); //4234567894
        string.replace(2,3,"4"); //4244567894
        string.replace(3,4,"7"); //4247567894
        string.delete(4,10); //4247
        System.out.println(string);

        String str = "0123456789";
        System.out.println("\nString " + str);
        String newStr = str.replace('1','4').replace('3','4'); //0424456789
        System.out.println(newStr.substring(1,4).concat("7")); //4247
    }
}
