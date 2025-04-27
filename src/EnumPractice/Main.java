package EnumPractice;

 import java.util.EnumMap;
 import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        Day day=Day.FRIDAY;
        int index=day.ordinal(); // ordinal hain vo by default enum constant position return karta hain use array start with index 0
        System.out.println("Day :"+day+" position: "+index);
        System.out.println("check day weekend hain ya nahi : "+day.isWeekend());
        System.out.println("check day Workday hain ya Weekend : "+day.getType());
        System.out.println("check day ka position number kya hain : "+day.getDayNumber());
        System.out.println("description about day : "+day.displayDescription());

        EnumSet<Day> workDays= EnumSet.of(Day.MONDAY,Day.TUESDAY,Day.WEDNESDAY,Day.THURSDAY,Day.FRIDAY);
        EnumSet<Day> weekends=EnumSet.complementOf(workDays);
        EnumSet<Day> allDays=EnumSet.allOf(Day.class);

        System.out.println("workdays : "+workDays);
        System.out.println("weekends : "+weekends);
        System.out.println("allDays : "+allDays);

        EnumMap<Day,String> schedule=new EnumMap<>(Day.class);
        schedule.put(Day.SUNDAY,"spend time with family");
        schedule.put(Day.SATURDAY,"spend time with friends");

        System.out.println("Where i spend time in sunday : "+schedule.get(Day.SUNDAY) );


        // lets enum used with swtich statement
        switch (day){
            case MONDAY:
                System.out.println("this is monday");
                break;
            case FRIDAY:
                System.out.println("this is friday");
                break;
            default :
                System.out.println("this is nothing");
        }




    }
}
