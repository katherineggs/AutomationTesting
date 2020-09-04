public class Chocolate extends WaffleMaker{
    @Override
    public void makeWaffle() {
        throw new RuntimeException("Not able to make waffle");
    }
}
