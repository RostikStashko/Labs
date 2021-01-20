package Commands;

import AirCompany.Company;

public class Command2 extends Command {

    public Command2(Company company){
        super(company);
    }

    @Override
    public void Execute() {
        System.out.println("(2)Список літаків посортований по дальності польоту:");
        company.sortPlanesByDistance();
        company.printPlanes();
    }
}