package by.it.yemialyanava.person.tasks;

public class Range {

    private int hour;
    private int min;
    private long sec;

    public Range(long sec){
        this.hour =(int) sec / 3600;
        int ostatokVremeni = (int) sec % 3600;
        this.min = ostatokVremeni / 60;
        this.sec = ostatokVremeni % 60;
    }

    public Range(int hour, int min, long sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public long countWholeSecond() {
        long summa = (hour * 3600) + (min *60) + sec;
        return  summa;
    }

    public int compareSeconds(Range other){
       long otherDenormalizedSeconds = other.countWholeSecond();
       long myDenormalizedSeconds = this.countWholeSecond();

        if (myDenormalizedSeconds > otherDenormalizedSeconds ){
            return +1;
        } else if (myDenormalizedSeconds == otherDenormalizedSeconds ){
            return 0;
        } else {
            return -1;
        }
    }


}
