package classwork._4_2508_Classes.Task1;

import java.time.LocalDate;
import java.util.Scanner;

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
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth() {
        System.out.println("Input date of birth (yyyy mm dd)");
        this.dateOfBirth = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPhone() {
        System.out.println("Input phone 375xxxxxxxxx");
        this.phone = scanner.nextInt();
//        Pattern pattern = Pattern.compile("\\d{12}");
//        Matcher matcher = pattern.matcher(Integer.toString(phone));
//
//        if (matcher.matches()) {
//            this.phone = phone;
//
//        } else {
//            System.out.println("Wrong phone input");
//        }

    }

    public int getPhone() {
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
