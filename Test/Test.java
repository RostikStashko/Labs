import AirCompany.Company;
import AirCompany.Plane;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashSet;

public class Test  extends TestCase {

    public void testPlaneSize(){
        Company company = new Company();
        company.generatePlanes(5);
        company.addPlane(new Plane(2,3,1,5));
        company.addPlane(new Plane(2,3,1,5));
        assertEquals(7 , company.getPlanes().size());
    }

    public void testPlanesSort(){
        Company company = new Company();
        company.generatePlanes(10);
        company.sortPlanesByDistance();
        boolean isSorted = true;
        ArrayList<Plane> planes = company.getPlanes();
        for (int i = 0; i < planes.size() - 1; i++) {
            if(planes.get(i).getDistance() > planes.get(i + 1).getDistance()) {
                isSorted = false;
            }
        }
        assertTrue(isSorted);
    }

    public void testGetPlanesWithRateFuel(){
        Company company = new Company();
        company.addPlane(new Plane(3,2100,1,4));
        company.addPlane(new Plane(2,5000,1,5));
        company.addPlane(new Plane(2,2300,1,5));
        company.addPlane(new Plane(2,2000,1,5));
        ArrayList<Plane> planes = company.getPlanesWithFuelRate(2 , 2);
        assertEquals(3 , planes.size());
    }

    public void testSumMaxPeopleCapacity() {
        Company company = new Company();
        company.addPlane(new Plane(3, 2100, 1, 12));
        company.addPlane(new Plane(2, 5000, 1, 10));
        company.addPlane(new Plane(3, 2100, 1, 15));
        company.addPlane(new Plane(2, 5000, 1, 5));
        int sum = company.sumMaxPeopleCapacity();
        assertEquals(42, sum);
    }
}