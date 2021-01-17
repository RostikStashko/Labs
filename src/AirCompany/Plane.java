package AirCompany;

public class Plane {
    public int maxPeopleCapacity;
    private int fuelRate;
    private int distance;
    private float maxBaggageCapacity;



    public Plane(int fuelRate, int distance, float maxBaggageCapacity ,int maxPeopleCapacity) {
        this.fuelRate = fuelRate;
        this.distance =  distance;
        this.maxBaggageCapacity= maxBaggageCapacity;
        this.maxPeopleCapacity = maxPeopleCapacity;
    }

    public float getDistance() {
        return distance;
    }

    public float getMaxBaggageCapacity() {
        return maxBaggageCapacity;
    }

    public int getMaxPeopleCapacity() {
        return maxPeopleCapacity;
    }
    public int getFuelRate() {
        return fuelRate;
    }


}