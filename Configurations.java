package com.company;
import java.util.Random;

public class Configurations
{
    private int Id,AccountBalance,CreditCardNumber;
    private String Name,Patronymic,Address;
    private char Surname;

    public Configurations(int id, String name, char surname, String patronymic, String address,
                          int creditCardNumber, int accountBalance) {
        Id = id;
        Name = name;
        Surname = surname;
        Patronymic = patronymic;
        Address = address;
        CreditCardNumber = creditCardNumber;
        AccountBalance = accountBalance;
    }

    /**
     Гетери і сетери
     */

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public char getSurname() {
        return Surname;
    }

    public void setSurname(char surname) {
        Surname = surname;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    /**
     Фунція toString
     */
    public String toString()
    {
        return "\nID: " + this.Id
                + "\nFull name: "+ this.Name+" "+ this.Surname+" "+ this.Patronymic
                + "\nAddress " + this.Address
                + "\nCreditCardNumber:  " + this.CreditCardNumber
                + "\nAccountBalance:  " + this.AccountBalance + "$"
                + "\n---------------------------\n";
    }

    /**
     Заповнення масиву випадковими людьми
     */
    public static Configurations RandomFill() {
        final String[] ArrName = {"Helen", "Kate", "Oksana", "Oleksandra", "Lidia", "Ksenia",
                "Maria", "Liza", "Roksolana "};
        final char[] ArrSurname = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        final String[] ArrPatronymic = {"Olekhivna", "Borysivna", "Petrivna", "Davydivna", "Mykolaivna", "Tymophiivna", "Denysivna",
                "Ihorivna", "Volodymyrivna", "Bohdanivna", "Leonydivna", "Vladyslavivna"};
        final String[] Address1 = {"Rubchaka street", "Stryiska street", "Fedkovycha street", "Vol.Velykoho street",
                "Morozna street", "Zelena street", "Shevchenka street", "Soborna street"};
        final String[] Address2 = {"Lviv", "Odessa", "Kyiv", "Kharkiv", "Zaporizhya",
                "Vynnyky", "Berdychiv"};
        Random x = new Random();
        int Id = x.nextInt(1000);
        String Name = ArrName[x.nextInt(9)];
        char Surname = ArrSurname[x.nextInt(26)];
        String Patronymic = ArrPatronymic[x.nextInt(12)];
        String Address = Address1[x.nextInt(8)]+" "+ x.nextInt(99)+" "+ Address2[x.nextInt(7)];
        int CreditCardNumber = (x.nextInt() % 1000000) + 5200000;
        int AccountBalance = (x.nextInt((10000)) - 5000);
        return new Configurations(Id,Name,Surname,Patronymic,Address,CreditCardNumber,AccountBalance);
    }

    public void  DisplayNames(int Count) {
        System.out.printf("\n"+ getName()+" "+getSurname()
                +" "+getPatronymic()+"\n ");
    }

}


