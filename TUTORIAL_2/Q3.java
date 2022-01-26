public class Q3 {
    
    public static void main(String[] args) {

        long unixTime = System.currentTimeMillis() / 1000L;

        System.out.println(unixTime);

        long currentSecond = unixTime % 60;

        System.out.println(currentSecond);

        long totalMinutes = unixTime / 60;

        System.out.println(totalMinutes);

        long currentMinutes = totalMinutes % 60;

        System.out.println(currentMinutes);

        long totalHours = totalMinutes / 60;
        
        System.out.println(totalHours);

        long currentHours = totalHours % 24;

        System.out.println(currentHours);

        System.out.printf("Current time is "  + currentHours + ":" + currentMinutes + ":" + currentSecond + " GMT");


    }
}
