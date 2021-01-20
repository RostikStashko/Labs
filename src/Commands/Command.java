package Commands;

import AirCompany.Company;

public abstract class Command {
    protected Company company;

    public Command(Company company){
        this.company=company;
    }

    public abstract void Execute();
}
