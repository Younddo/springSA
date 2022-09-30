import java.util.Scanner;

public class Bus extends Transport {
    int number;
    Bus(){
        number = cnt++;
        this.passengersMax = 30;
        this.money = 1000;
        this.run = true;
        this.seatsNow = passengersMax-passengersNow;
    }

    @Override
    void passengersIn(int person) {
        if (curStatus == "차고지행"){
            seatsNow = passengersMax;
            passengersNow = 0;
            totalFare = 0;
        } else {
            super.passengersIn(person);
            totalFare = person*money;
        }
    }

    @Override
    void start() {
        super.start();
        curStatus = "운행중";
    }

    @Override
    void stop() {
        super.stop();
        curStatus = "차고지행";

    }
}
