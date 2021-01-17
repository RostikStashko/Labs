package AirCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Airplanes {
    public static void main(String[] args) {
        Company company = new Company();
        company.generatePlanes(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1)Список літаків:");
        System.out.println("(2)Список літаків посортований по витратам палива:");
        System.out.println("(3)Загальна місткість:");
        System.out.println("(4)Список літаків  по дальності польоту:");
        System.out.println("(0)->Вихід");
        int command = 1;
        while(command != 0) {
            System.out.print("Виберіть пункт меню: ");
            command= scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("(1)Список літаків:");
                    company.printPlanes();
                    break;
                case 2:
                    System.out.println("(2)Список літаків посортований по витратам палива:");
                    company.sortPlanesByFuel();
                    company.printPlanes();
                    break;
                case 3:
                    System.out.println("(3)Загальна місткість:");
                    System.out.println(company.sumMaxPeopleCapacity());
                    break;
                case 4:
                    System.out.println("Введіть мінімальну та максимальну відстань:");
                    int from = scanner.nextInt();
                    int to = scanner.nextInt();
                    System.out.println("(4)Список літаків  по дальності польоту(" + from + "," + to+")");
                    ArrayList<Plane> planes = company.getPlanesWithDistance(from , to);
                    if(planes.size() == 0)
                        System.out.println("Немає літаків по заданому діапазону");
                    for (Plane plane : planes) {
                        System.out.println("Дальність " + plane.getDistance()
                                + " витрати палива " + plane.getFuelRate()+" вантажопідйомність " + plane.getMaxBaggageCapacity()+" місткість " + plane.getMaxPeopleCapacity());
                    }
                    break;
                case 0:
                    return;
                }
            }
        }
    }
