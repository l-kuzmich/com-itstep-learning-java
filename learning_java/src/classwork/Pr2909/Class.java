package classwork.Pr2909;

public class Class implements CheckDays{

    @Override
    public void checkDays(DaysOfWeek day) {
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:{
                System.out.println("This is " + day.getDay());
                break;
            }
            default:{
                System.out.println("No day");
            }

        }
    }
}
