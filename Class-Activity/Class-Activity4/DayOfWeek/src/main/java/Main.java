public class Main {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SATURDAY; // Change the day as needed

        if (isWeekend(day)) {
            System.out.println(day + " is a weekend day.");
        } else {
            System.out.println(day + " is a weekday.");
        }
    }

    public static boolean isWeekend(DayOfWeek day) {
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
}
