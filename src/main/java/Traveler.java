public class Traveler {
    Car car;
    //why Constructor given (Traveler)? Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Car.move()" because "this.car" is null
    //	at Traveler.startJourney(Traveler.java:7)
    //	at Client.main(Client.java:4)
    public Traveler(){
        this.car=new Car();
    }
    public void startJourney(){
        this.car.move();
    }
}
