package Commands;

import AirCompany.Company;

public class Command1 extends Command {

    public Command1(Company company){
        super(company);
    }

    @Override
    public void Execute() {
        System.out.println("(1)Список літаків:");
        company.printPlanes();
    }
}
