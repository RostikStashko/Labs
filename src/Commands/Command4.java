package Commands;

import AirCompany.Company;
import AirCompany.Plane;

import java.util.ArrayList;
import java.util.Scanner;
public class Command4 extends Command {
    private Scanner scanner;
    public Command4(Company company){
        super(company);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void Execute() {
        System.out.println("Введіть мінімальну та максимальну витрату палива:");
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        System.out.println("(4)Список літаків  по витратам палива(" + from + "," + to+")");
        ArrayList<Plane> planes = company.getPlanesWithFuelRate(from , to);
        if(planes.size() == 0)
            System.out.println("Немає літаків по заданому діапазону");
        for (Plane plane : planes) {
            System.out.println("Дальність " + plane.getDistance()
                    + " витрати палива " + plane.getFuelRate() + " вантажопідйомність " + plane.getMaxBaggageCapacity() + " місткість " + plane.getMaxPeopleCapacity());
        }
    }
}