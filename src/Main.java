public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        car.setDistance(120);
        car.setSpeed(90);
        car.setStartTime("9:10");

        Train train=new Train();
        train.setSpeed(200);
        train.setDistance(400);
        train.setStartTime("00:00");


        System.out.println("Duration "+car.calculateDuration());
        System.out.println("Arrivate time"+car.calculateArriveTime());
        System.out.println("Price Ticket : "+car.priceTrip(car.getDistance())+" SR");

       
        System.out.println("Duration "+train.calculateDuration());
        System.out.println("Arrivate time"+train.calculateArriveTime());
        System.out.println("Price Ticket : "+train.priceTrip(car.getDistance())+" SR");

        
    }
}