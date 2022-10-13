package classwork._8_2909_Interface_and_Enum;

public enum DaysOfWeek {

    MONDAY ("Monday"),
    TUESDAY ("Tuesday"),
    WEDNESDAY ("Wednesday"),
    THURSDAY ("Thursday"),
    FRIDAY ("Friday"),
    SATURDAY ("Saturday"),
    SUNDAY ("Sunday");

    private String day;

    DaysOfWeek (String day){
        this.day = day;
    }

    public String getDay () {
        return day;
    }

}
