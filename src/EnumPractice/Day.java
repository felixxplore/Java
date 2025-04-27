package EnumPractice;

 interface Description{

    String displayDescription();
}


public enum Day implements Description{
    SUNDAY("Weekend",1,"funday only enjoy"),
    MONDAY("Workday",2,"first workday is boring"),
    TUESDAY("Workday",3,"secound workday is also very boring"),
    WEDNESDAY("Workday",4,"third day is exciting because 2 day left for Weekends"),
    THURSDAY("Workday",5,"fourth day is very exciting because 1 day left for weekends"),
    FRIDAY("Workday",6,"fifth day is very happy day because tomorrow is weekend."),
    SATURDAY("Weekend",7,"just enjoy with friends and family");

   private final String type;
    private final int dayNumber;
    private final String description;

    Day(String type,int dayNumber,String description){
        this.type=type;
        this.dayNumber=dayNumber;
        this.description=description;
    }

    public String getType(){
        return type;
    }
    public int getDayNumber(){
        return dayNumber;
    }

    @Override
    public String displayDescription(){
        return description;
    }

    public boolean isWeekend(){
        return this==SUNDAY || this==SATURDAY;
    }

}
