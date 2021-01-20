package AirCompany;

import Commands.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Airplanes {
    public static void main(String[] args) {
        Company company = new Company();
        company.generatePlanes(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1)Список літаків:");
        System.out.println("(2)Список літаків посортований по дальності польоту:");
        System.out.println("(3)Загальна місткість:");
        System.out.println("(4)Список літаків  по витратам палива1:");
        System.out.println("(0)->Вихід");
        int command = 1;
        Command commandToExecute = new Command1(company);
        while(command != 0) {
            System.out.print("Виберіть пункт меню: ");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    commandToExecute = new Command1(company);
                    break;
                case 2:
                    commandToExecute = new Command2(company);
                    break;
                case 3:
                    commandToExecute = new Command3(company);
                    break;
                case 4:
                    commandToExecute = new Command4(company);
                    break;
                case 0:
                    return;
            }
            commandToExecute.Execute();
        }
    }
}
