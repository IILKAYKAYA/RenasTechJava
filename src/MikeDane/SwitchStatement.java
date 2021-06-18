package MikeDane;

public class SwitchStatement {

    public static void main(String[] args) {

        getDayName(1);
        System.out.println(getDayName(5));

        //1 - sunday
        //2 - monday
        //3 - tuesday
        //4 - wednesday
        //5 - thursday
        //6 - friday
        //7 - saturday



    }

    public static String getDayName(int dayNum) {

        String dayName="";

        switch (dayNum) {
            case 1:
            dayName = "sunday";
            break;

            case 2:
            dayName = "monday";
            break;

            case 3:
            dayName = "Tuesday";
            break;


            case 4:
                dayName = "wednesday";
                break;

                case 5:
            dayName = "thursday";
            break;

            case 6:
            dayName = "friday";
            break;

        case 7:
        dayName = "saturday";
        break;

            default:
                System.out.println("invalid number");

        }
        return dayName;

    }

}