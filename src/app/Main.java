package app;

public class Main {

    public static void main(String[] args) {

        AdviceProvider adviceProvider = new WeekDay();

        adviceProvider.advise(Day.Monday);
        adviceProvider.advise(Day.Friday);
        adviceProvider.advise(Day.Sunday);
    }
}
