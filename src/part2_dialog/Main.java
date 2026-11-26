package part2_dialog;

import common.Input;
public class Main {
    public static void main(String[] args) {
        // Part 2. Ten separate user inputs, using several data types.
        String name=Input.text("First name: ");
        String surname=Input.text("Surname: ");
        int age=Input.integer("Age (0-120): ",0,120);
        String city=Input.text("City: ");
        String country=Input.text("Country: ");
        String major=Input.text("Study subject: ");
        int year=Input.integer("Study year (1-8): ",1,8);
        double hours=Input.number("Hours of study per week: ");
        boolean likesJava=Input.text("Do you like Java? (yes/no): ").equalsIgnoreCase("yes");
        String hobby=Input.text("Favourite hobby: ");
        char initial=name.isEmpty()?'?':name.charAt(0);
        System.out.printf("%nSUMMARY%n%s %s (%c), age %d%n%s, %s%n%s, year %d%nStudy hours: %.1f%nLikes Java: %s%nHobby: %s%n",
                name,surname,initial,age,city,country,major,year,hours,likesJava,hobby);
        String lower=hobby.toLowerCase(java.util.Locale.ROOT);
        if(lower.contains("read")) System.out.println("You might enjoy a programming book.");
        if(lower.startsWith("sport")) System.out.println("Sport is a great way to take a study break.");
        System.out.println("Position of 'a' in hobby (-1 means absent): " + lower.indexOf('a'));
    }
}
