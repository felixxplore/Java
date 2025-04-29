package Collections.MapInterface;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Day{
    SUNDAY, MONDAY, TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY
}

public class Enummap {
    public static void main(String[] args) {

        Map<Day,String> map=new EnumMap<>(Day.class);
        map.put(Day.SUNDAY,"Chill");
        map.put(Day.SATURDAY,"movie");
        System.out.println(map.get(Day.SUNDAY));
        System.out.println(map);

    }
}
