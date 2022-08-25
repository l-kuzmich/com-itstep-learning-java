package classwork.Pr2508.Task1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int phone;
    private String city;
    private String country;
    private String address;
    private final Scanner scanner = new Scanner(System.in);

    public void setName() {
        System.out.println("Input name");
        String name = scanner.nextLine();
    }

    public String getName(String name) {
        return name;
    }

    public void setDateOfBirth() {
        System.out.println("Input date of birth (dd mm yyyy)");
        LocalDate dateOfBirth = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public LocalDate getDateOfBirth(LocalDate dateOfBirth) {
        return dateOfBirth;
    }

    public void setPhone() {
        System.out.println("Input phone +375(xx)xxx-xx-xx");
        int phone = scanner.nextInt();
        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        Matcher matcher = pattern.matcher(Integer.toString(phone));

        if (matcher.matches()) {
        } else {
            System.out.println("Wrong phone input");
        }

    }

    public int getPhone(int phone) {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.println("Input city");
        this.city = scanner.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.println("Input country");
        this.country = scanner.nextLine();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("Input address");
        this.address = scanner.nextLine();
    }
}
