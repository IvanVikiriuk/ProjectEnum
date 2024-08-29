package app;

public class WeekDay implements AdviceProvider {

    @Override
    public void advise(Day day) {
        switch (day) {
            case Monday, Tuesday, Wednesday, Thursday ->
                    System.out.println("Be productive at work! ");
            case Friday -> System.out.println("Happy Friday! ");
            case Saturday, Sunday ->
                    System.out.println("It's a great time to visit" +
                    "parks,museums or spend time in nature.");
            default -> System.out.println("Unknown day of the week. ");
        }
    }
}
