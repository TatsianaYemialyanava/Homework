package by.it.yemialyanava.person.tasks;

public class Seconds {
    public static void main(String[] args) {
        int time = 99632147;
        int sec = time % 60;
        int timeMin = (time - sec) / 60;
        int min = timeMin % 60;
        int timeHour = timeMin - min;
        int hour = (timeHour / 60) % 24;
        int days = ((timeHour / 60 - hour) / 24) % 7;
        int weeks = (((timeHour / 60 - hour) / 24) - days) / 7;
        System.out.println(weeks + " недель " + days + " суток " + hour + " часов " + min + " минут " + sec + " секунд ");
    }
}
