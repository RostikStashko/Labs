package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    /**
     Пошук за іменем
     */
    public static void FindByName(ArrayList<Configurations> Array,int Size,Scanner input)
    {
        String name;
        int Count=1;
        System.out.printf("\n\nEnter a name to search : ");
        name = input.next();
        for(int i=0,d=1; i<Size; i++){
            if (Array.get(i).getName().equals(name)){
                Array.get(i).DisplayNames(Count);
                Count++;

            }
        }
        if(Count==0) {
            Error();
            return;
        }
        Line();

    }
    /**
    Пошук за номером картки
     */
    public static void FindByInterval(ArrayList<Configurations> Array,int Size,Scanner input){
        long x1,x2;
        int Count=0;
        System.out.printf("\n\nEnter items: ");
        x1 = input.nextLong();
        x2 = input.nextLong();
        for(int i=0,d=1; i<Size; i++){
            if (Array.get(i).getCreditCardNumber()<x2 && Array.get(i).getCreditCardNumber()>x1){
                Array.get(i).DisplayNames(Count);
                Count++;
            }
        }
        if(Count==0) {
            Error();
            return;
        }
        Line();

    }
    /**
     Пошук боржників
     */
    public static void FindByBalance(ArrayList<Configurations> Array,int Size,Scanner input){
        int Count=0;
        System.out.printf("\n\nNames of debtors: ");
        for(int i=0; i<Size; i++){
            if (Array.get(i).getAccountBalance()<0){
                Array.get(i).DisplayNames(Count);
                Count++;
            }
        }
        if(Count==0) {
            Error();
            return ;
        }
        System.out.printf("Amount with debt: %d\n", Count);
        Line();

    }
    public static void FillArr(ArrayList<Configurations> Array, int Size)
    {
        for(int i = 0; i < Size; i++) {
            Array.add(Configurations.RandomFill());
        }

    }
    public static void Line(){
        System.out.printf("-------------------------------------------");
    }
    public static void Error(){
        System.out.printf("Nothing found\n");
        Line();
    }

    public static void main(String[] args) {
        int size;
        ArrayList<Configurations> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter amount of customers: ");
        size = input.nextInt();
        arr.ensureCapacity(size);
        FillArr(arr,size);
        System.out.printf("Full list of customers: ");
        System.out.println(arr);
        FindByBalance(arr,size,input);
        FindByName(arr,size,input);
        FindByInterval(arr,size,input);


    }
}
