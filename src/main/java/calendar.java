public class calendar {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < months.length; i++) {
            printCalendarForMonth(months[i], daysInMonth[i]);
        }
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth) {
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        int day = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (day <= daysInMonth) {
                    System.out.printf("%2d ", day);
                    day++;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if (day > daysInMonth) {
                break;
            }
        }
    }
}
