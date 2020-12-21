package by.it.yemialyanava;

import java.util.Scanner;

public enum Seasons {
    WINTER("white",90),
    SPRING("green", 92),
    SUMMER("sunny", 92),
    FALL("brown", 91);

    String description;
    int countOfDays;

    Seasons(String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
    }

    static Seasons getNextSeason(String outsideSeason){
        Seasons result = null;
        switch (outsideSeason){
            case "winter" :
                result =  SPRING;
                break;
            case "spring" :
                result =  SUMMER;
                break;
            case "summer" :
                result =  FALL;
                break;
            case "fall" :
                result = WINTER;
                break;
            default:
                System.out.println("We don't know this season");
                break;
        }
             return result;
    }
    static int getDaysInSeason(String outsideSeason){
        int result = 0;
        switch (outsideSeason){
            case "winter" :
                result = WINTER.countOfDays;
                break;
            case "spring" :
                result = SPRING.countOfDays;
                break;
            case "summer" :
                result = SUMMER.countOfDays;
                break;
            case "fall" :
                result = FALL.countOfDays;
                break;
            default:
                System.out.println("We don't know this season");
                break;
        }
        return result;
    }
}
