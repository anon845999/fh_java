import java.util.Scanner;

public class Calendars {

    private static final int SET_DATE = 0;
    private static final int IS_LEAP = 1;
    private static final int DAYS_IN_MONTH = 2;
    private static final int CHECK_DATE = 3;
    private static final int YMD_2_W = 7;
    private static final int DAY_NUMBER = 8;
    private static final int WEEK_NUMBER = 9;
    //private static final int DAY_NAME = 13;
    //private static final int PRINT_DAY = 14;
    //private static final int DAY_SHORT_NAME = 15;
    //private static final int PRINT_DAY_SHORT = 16;
    //private static final int PRINT_MONTH = 17;
    //private static final int PRINT_MONTH_SHORT = 18;
    //private static final int PRINT_DATE = 19;
    private static final int PRINT_STATISTICS = 20;
    //private static final int COMPARE = 10;
    private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
    private static final int PRINT_CALENDAR = 22;
    private static final int EXIT = 666;
    /**** D O N T T O U C H T H I S ***/

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        sc = new Scanner(System.in);
        int day = 1, month = 1, year = 1970;
        while (true) {

            int op;
            System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);

            System.out.printf("enter option: ");

            op = sc.nextInt();

            switch (op) {
                case SET_DATE:
                    System.out.printf("day: ");

                    day = sc.nextInt();
                    System.out.printf("month: ");

                    month = sc.nextInt();
                    System.out.printf("year: ");

                    year = sc.nextInt();
                    break;


                case IS_LEAP:
                    System.out.printf("\nisLeap(year): %b\n", isLeap(year));
                    break;

                case DAYS_IN_MONTH:
                    System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
                    break;

                case CHECK_DATE:
                    System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
                    System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
                    System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
                    break;


                case YMD_2_W: {
                    System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
                    break;
                }

                case DAY_NUMBER:
                    System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
                    break;

                case WEEK_NUMBER:
                    System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
                    break;



                case PRINT_STATISTICS:
                    System.out.printf("\nprintStatistics: ");
                    printStatistics(year, month, day);

                    break;


                case PRINT_CALENDAR_HIGHLIGHT:
                    System.out.printf("\nprintCalendar(year, month, day, 1): \n");
                    printCalendar(year, month, day, true);

                    break;
                case PRINT_CALENDAR:
                    System.out.printf("\nprintCalendar(year, month, day, 0): \n");
                    printCalendar(year, month, day, false);

                    break;
                case EXIT:
                    System.out.printf("closing.\n");
                    sc.close();

                    return;

                default:
                    ;
            }


        }
*/
        test();


    }

    public static boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Specified year is a leap year");
            return true;
        } else {
            System.out.println("Specified year is not a leap year");
            return false;
        }

    }

    public static int ymd2w(int year, int month, int day) {
        return 0;
    }

    public static int dayNumber(int year, int month, int day) {
        return 0;
    }

    public static int weekNumber(int year, int month, int day) {
        return 0;
    }

    public static int printStatistics(int year, int month, int day) {
        return 0;
    }

    public static void printCalendar(int year, int month, int day, boolean highlight) {

    }

    public static int daysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                if (isLeap(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4, 6, 9, 11:
                return 30;

            default:
                return -1;

        }
    }

    public static boolean checkDate(int year) {
        return year >= 1582 && year <= 2199;
    }

    public static boolean checkDate(int year, int month) {

        if (checkDate(year)) {
            if (year == 1582) {
                if (month >= 10 && month <= 12) {
                    return true;
                }
            }
            if (year == 2199) {
                if (month >= 1 && month <= 12) {
                    return true;
                }
            }
            if (year > 1582 && year < 2199) {
                return month >= 1 && month <= 12;
            }
        }
        return false;


    }

    public static boolean checkDate(int year, int month, int day) {
        if (checkDate(year, month)) {
            if (year == 1582) {
                switch (month) {
                    case 10:
                        if (day >= 16 && day <= 31) {
                            return true;
                        }
                        break;
                    case 11:
                        if (day >= 1 && day <= 30) {
                            return true;
                        }
                        break;
                    case 12:
                        if (day >= 1 && day <= 31) {
                            return true;
                        }

                    default:
                        return false;
                }

            }
        } else if (year > 1582 && year <= 2199) {

            if (checkDate(year, month)) {
                int days = daysInMonth(year, month);
                return days != -1;
            } else {
                return false;
            }


        }
        return false;
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter year: ");
            int year = sc.nextInt();
            System.out.println("Enter month: ");
            int month = sc.nextInt();
            System.out.println("Enter day: ");
            int day = sc.nextInt();

            System.out.println("check year: ");
            boolean ausgabe = checkDate(year);
            System.out.println(ausgabe);

            System.out.println("check year,month: ");
            ausgabe = checkDate(year, month);
            System.out.println(ausgabe);

            System.out.println("check year,month,day: ");
            ausgabe = checkDate(year, month,day);
            System.out.println(ausgabe);
        }


    }
}







