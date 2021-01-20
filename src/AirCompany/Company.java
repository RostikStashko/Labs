package AirCompany;

import java.util.ArrayList;
import java.util.Random;

public class Company {
    private final ArrayList<Plane> planes;

    public Company() {
        planes = new ArrayList<Plane>();
    }

    public void sortPlanesByDistance() {
        Plane temp;
        for (int i = 0; i < planes.size() - 1; i++) {
            for (int j = 0; j < planes.size() - 1; j++) {
                if (planes.get(j).getDistance() > planes.get(j + 1).getDistance()) {
                    temp = planes.get(j + 1);
                    planes.set(j + 1,planes.get(j));
                    planes.set(j,temp);
                }
            }
        }
    }

    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println("Дальність " + plane.getDistance()
                    + " витрати палива " + plane.getFuelRate()+" вантажопідйомність " + plane.getMaxBaggageCapacity()+" місткість " + plane.getMaxPeopleCapacity());
        }
    }

    public void generatePlanes(int planesAmount) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < planesAmount; i++) {
            planes.add(
                    new Plane(
                            rnd.nextInt(10) + 20,
                            rnd.nextInt(1500) + 2000,
                            rnd.nextInt( 100 + 1)*1000,
                            rnd.nextInt(30) + 40
                    )
            );
        }
    }

    public ArrayList<Plane> getPlanesWithFuelRate(int from, int to) {
        ArrayList<Plane> arrayToReturn = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getFuelRate() >= from && plane.getFuelRate() <= to) {
                arrayToReturn.add(plane);
            }
        }
        return arrayToReturn;
    }

    public int sumMaxPeopleCapacity(){
    int sum = 0;
        for (Plane plane : planes) {
            sum += plane.getMaxPeopleCapacity();
        }
        return sum;
    }

    public void addPlane(Plane plane){
        planes.add(plane);
    }
    public  ArrayList<Plane> getPlanes(){
        return planes;
    }


}
