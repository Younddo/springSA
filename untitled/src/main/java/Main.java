public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        System.out.println(bus1.number);
        System.out.println(bus2.number);
        bus1.passengersIn(2);
        System.out.println("요금확인 : " + bus1.totalFare);
        bus1.refuel(-50);
        System.out.println("주유량 : " + bus1.fuel);
        bus1.refuel(+10);
        bus1.curStatus="차고지행";
        bus1.passengersIn(0);
        System.out.println(bus1.curStatus);
        System.out.println("주유량 : " + bus1.fuel);
        bus1.curStatus="운행중";
        bus1.passengersIn(45);
        bus1.passengersIn(5);
        System.out.println("요금확인 : " + bus1.totalFare);
        bus1.refuel(-55);
        System.out.println("주유량 : " + bus1.fuel);
        System.out.println(bus1.curStatus);

        System.out.println("-----------------------------");

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println(taxi1.number);
        System.out.println(taxi2.number);
        System.out.println("주유량 = " + taxi1.fuel);
        System.out.println("상태 = " + taxi2.curStatus);
        taxi1.passengersIn(2);
        System.out.println("기본 요금 확인 = " + taxi1.standardFee);
        taxi1.destinate("서울역",2);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.distance + "km");
        taxi1.addFee();
        System.out.println("지불할 요금 = " + taxi1.totalFare);
        System.out.println("상태 = " +taxi1.curStatus);
        taxi1.refuel(-80);
        taxi1.dropPassengers();
        System.out.println("주유량 = " + taxi1.fuel);
        taxi1.passengersIn(5);
        taxi1.passengersIn(3);
        System.out.println("기본 요금 확인 = " + taxi1.standardFee);
        taxi1.destinate("구로디지털단지역", 12);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.distance + "km");
        taxi1.addFee();
        System.out.println("지불할 요금 = " + taxi1.totalFare);
        taxi1.refuel(-20);
        System.out.println(taxi1.fuel);
        System.out.println(taxi1.curStatus);
        System.out.println(taxi1.totalFare);


    }
}

