public class Taxi extends Transport {


    String destination;
    int distance;
    int standardLength;
    int standardFee;
    int distanceFee;

    int payfee;
    int number;


    Taxi() {
        number = cnt++;
        // 상속받은 필드
        this.passengersNow=0;
        this.seatsNow=4;
        this.fuel = 100;
        this.speed = 0;
        this.passengersMax = 4;
        this.run = true;
        //택시거
        this.standardLength = 1;
        this.standardFee = 3000;
        this.distanceFee = 1000;
        this.payfee=0;
        this.curStatus = "일반";
    }

    @Override
    void passengersIn(int person) {
        this.curStatus = "운행중";
        super.passengersIn(person);
    }

    void destinate (String des, int d) {
        destination = des;
        distance = d;
    }

    void addFee() {
        this.totalFare = (standardFee + (distanceFee*(distance-standardLength)));
    }

    void dropPassengers() {
        totalFare = 0;
        passengersNow=0;
        seatsNow=4;
        passengersMax=4;
        destination = "";
        distance = 0;
    }




}
