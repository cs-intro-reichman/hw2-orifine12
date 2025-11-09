public class TimeCalc {
    public static void main(String[] args) {
        String Time = args [0];
        String hoursString = Time.charAt (0) + "" + Time.charAt(1);
        String minutesString = Time.charAt(3) + "" + Time.charAt(4);
        int hours = Integer.parseInt(hoursString);
        int minutes = Integer.parseInt(minutesString);
        int minutesToAdd = Integer.parseInt (args [1]);

//Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
//Total hours = 4685 / 60 = 78;
//New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
//New minutes = 4685 – (78 * 60) = 5;
//Therefore the answer is 06:05. 
int TotalMinutes = (hours*60) + minutes + minutesToAdd;
int TotalHours = TotalMinutes / 60;
int NewHours = TotalHours % 24;
int NewMinutes = TotalMinutes - (TotalHours * 60);      

//system.out.println(hours + ":" + minutesString + " " + minutesToAdd);
String SNewHours = String.format("%02d", NewHours);
String SNewMinutes = String.format("%02d", NewMinutes);
System.out.println(SNewHours + ":" + SNewMinutes);

    }
}
