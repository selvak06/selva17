public class Main {
    public static void main(String[] args) {
        String getDuration = getDurationString(3965);
    }
    public static String getDurationString (int seconds){
        int minutes = 0;
        if (seconds < 0 ) {
            return "Invalid Seconds value" ;
        } else {
            minutes = seconds / 60 ;
            seconds = seconds % 60 ;
            return getDurationString(minutes, seconds);
        }
    }

    public static String getDurationString (int minutes, int seconds){
        int hours, remMinutes, remSeconds = 0;
        if (minutes < 0  &&  minutes > 60) {
            return "Invalid Minutes value" ;
        } else {
            hours = minutes /60 ;
            remMinutes = minutes % 60 ;
            String convertedValue = (hours + "h" + remMinutes + "m" + seconds + "s");
            System.out.println("The output value is " + convertedValue);
            return convertedValue;
        }
    }

}
