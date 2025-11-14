public class TimeCalc {
    public static void main(String[] args)
    {
        String[] noyArg = args[0].split(":");
		int hours = Integer.parseInt(noyArg[0]);
		int minutes = Integer.parseInt(noyArg[1]);
        int minuteToAdd = Integer.parseInt(args[1]);

        int totalminutes =hours * 60 + minutes + minuteToAdd;
        int newHours = (totalminutes / 60) % 24;
        int newMinutes = totalminutes % 60;

        System.out.println(String.format("%02d", newHours) + ":" + String.format("%02d", newMinutes));
	
        // Replace this comment with your code
    }
}
