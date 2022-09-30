public class Transport {
    static int cnt = 1000;
    int plateNum;
    int fuel = 100;
    int speed = 0;
    int speedChange;
    int passengersMax; //personMax
    int passengersNow; //personNow
    boolean run = true;
    int seatsNow;
    String curStatus;
    int totalFare;
    int money;

    void start() {  //운행 시작
        run = true;
        System.out.println("운행을 시~~~작해보겠습니다");
    }
    void stop() {   //운행 종료
        run = false;
        System.out.println("야호 운행 종~~~~~~료");
    }
    void speedChange() {   //속도 변경
        this.speedChange = speedChange;
        System.out.println();
    }
    void passengersIn(int person) {
        if (person>seatsNow) {
            System.out.println("최대 승객수 초과 못타유~");
        } else {
            this.passengersNow += person;
            seatsNow -= person;
            System.out.println("탑승승객 수 : " + passengersNow );
            System.out.println("잔여승객 수 : " + seatsNow);
        }
    }

    void refuel(int addFuel) {
        this.fuel += addFuel;
        if(fuel<=10) {
            System.out.println("주유 필요");
            curStatus = "차고지행";
        }
    }



}
