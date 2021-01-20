package Commands;

import AirCompany.Company;

public class Command3 extends Command {

    public Command3(Company company){
        super(company);
    }

    @Override
    public void Execute() {
        System.out.println("(3)Загальна місткість:");
        System.out.println(company.sumMaxPeopleCapacity());
    }
}