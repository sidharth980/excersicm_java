class NeedForSpeed {
    private int speed;
    private int distance;
    private int batteryDrain;
    private int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.distance = 0;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        if (this.battery == 0){
            return true;
        }
        if (this.battery<this.batteryDrain){
            return true;
        }

        return false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery>=batteryDrain) {
            this.battery -= this.batteryDrain;
            this.distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int disatance;
    RaceTrack(int distance) {
        this.disatance = distance;

    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
            if (car.distanceDriven()>=this.disatance){
                return true;
            }
        }
        return false;
    }
}
